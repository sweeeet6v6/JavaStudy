package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * class Name   : JdbcSelect
 * Author       : SSAM
 * Created Date : 2025. 3. 11.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : JDBC 사용  
 */

public class JdbcSelect {
	public static void main(String[] args) {
		//db연결 객체
		Connection conn = null;
		//SQL명령
		PreparedStatement ps = null;
		//쿼리 결과
		ResultSet rs = null;
		//1.드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("실패");
			e.printStackTrace();
			System.exit(0);  //프로그램 종료
		}
		//2.db연결
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "java";
		String db_pw = "oracle";
		
		try {
			conn = DriverManager.getConnection(url,db_id, db_pw);
			System.out.println("접속 성공");
			
			StringBuffer query = new StringBuffer();
			query.append(" SELECT info_no");
			query.append("       ,nm");
			query.append("       ,email");
			query.append("       ,hobby");
			query.append(" FROM tb_info");
			query.append(" WHERE nm LIKE ?||'%' ");
			ps = conn.prepareStatement(query.toString());
			ps.setString(1,"이");
			rs = ps.executeQuery(); // 쿼리문 실행!
 			//조회결과 만큼 반복
			while(rs.next()) {
				int no = rs.getInt("info_no");
				String nm = rs.getString("nm");
				String email = rs.getString("email");
				String hobby = rs.getString("hobby");
				System.out.println(no+"|"+nm+"|"+email+"|"+hobby);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("접속 종료");
			if(rs != null) {try {rs.close();}catch(SQLException e){}}
			if(ps != null) {try {ps.close();}catch(SQLException e){}}
			if(conn != null) {try {conn.close();}catch(SQLException e){}}
		}
	}
}
