package ch14_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import ch14_jdbc.jdbc.ConnectionFactory;

public class JdbcInsert {
	public static void main(String[] args) {
		//db연결 객체
		Connection conn = null;
		//SQL명령
		PreparedStatement ps = null;
		//쿼리 결과
		ResultSet rs = null;
		
		ConnectionFactory factory = ConnectionFactory.getInstance();
		
		try {
			conn = factory.getConnection();
			System.out.println("접속 성공");
			System.out.println("auto 커밋 상태: " + conn.getAutoCommit());
			conn.setAutoCommit(false); // 비활성 -> 수동으로 커밋 해야 함
			
			StringBuffer query = new StringBuffer();
			query.append(" INSERT INTO tb_info (info_no, pc_no, nm, en_nm, email) ");
			query.append(" VALUES(?, ?, ?, ?, ?)");

			ps = conn.prepareStatement(query.toString());
			ps.setInt(1, 16);
			ps.setInt(2, 27);
			ps.setString(3,"팽수");
			ps.setString(4,"pangsu");
			ps.setString(5,"pangsu@gmail.com");
			int cnt = ps.executeUpdate(); // 쿼리문 실행!
			if(cnt > 0) {
				System.out.println(cnt + "행이 삽입됨.");
				conn.commit();
			}else {
				System.out.println("대상 건이 없음");
				conn.rollback();
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
	
	public void ConnClassLoad() {
		//db계정 정보 불러오기
		Properties prop = new Properties();
		//db계정 정보 불러오기
		InputStream reader = getClass().getClassLoader().getResourceAsStream("config/db.properties");
		try {
			prop.load(reader);
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("id"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
