package ch14_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import ch14_jdbc.jdbc.ConnectionFactory;

public class JdbcMain {

	public static void main(String[] args) {
		while(true) {
			System.out.println("학사 정보 시스템입니다.");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.조회 | 2. 수정 | 3. 추가 (q: 종료)");
			String msg = sc.nextLine();
			if(msg.equalsIgnoreCase("q")) {
				System.out.println("학사 정보 시스템 종료");
				break;
			}else if(msg.equals("1")) {
				// 1. 조회는 이름을 입력받아서(like) 모두 출력
				System.out.println("조회할 학생의 이름을 입력하세요");
				String inputName = sc.nextLine();
				search(inputName);
			}else if(msg.equals("2")) {
				// 2. 수정은 취미를 입력받아 변경되도록
				System.out.println("취미를 수정할 학생의 이름을 입력하세요");
				String inputName = sc.nextLine();
				System.out.println("새로운 취미를 입력하세요");
				String inputHobby = sc.nextLine();
				edit(inputName, inputHobby);
			}
			
		}

	}
	
	public static void search(String input) {
		//db연결 객체
		Connection conn = null;
		//SQL명령
		PreparedStatement ps = null;
		//쿼리 결과
		ResultSet rs = null;
		
		ConnectionFactory factory = ConnectionFactory.getInstance();
		
		try {
			conn = factory.getConnection();
//			System.out.println("접속 성공");
//			System.out.println("auto 커밋 상태: " + conn.getAutoCommit());
			conn.setAutoCommit(false); // 비활성 -> 수동으로 커밋 해야 함
			
			StringBuffer query = new StringBuffer();
			query.append(" SELECT *");
			query.append(" FROM tb_info");
			query.append(" WHERE nm LIKE ?||'%' ");

			ps = conn.prepareStatement(query.toString());

			ps.setString(1, input);
			
			rs = ps.executeQuery(); // 쿼리문 실행!
			
			//조회결과 만큼 반복
			while(rs.next()) {
				int info_no = rs.getInt("info_no");
				int pc_no = rs.getInt("pc_no");
				String nm = rs.getString("nm");
				String en_nm = rs.getString("en_nm");
				String email = rs.getString("email");
				String hobby = rs.getString("hobby");
				Date create_dt = rs.getDate("create_dt");
				Date update_dt = rs.getDate("update_dt");
				String mbti = rs.getString("mbti");
				System.out.println(info_no+"|"+nm+"|"+email+"|"+hobby+"|"+create_dt+"|"+update_dt+"|"+mbti);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			System.out.println("접속 종료");
			if(rs != null) {try {rs.close();}catch(SQLException e){}}
			if(ps != null) {try {ps.close();}catch(SQLException e){}}
			if(conn != null) {try {conn.close();}catch(SQLException e){}}
		}
	}
	
	public static void edit(String name, String hobby) {
		//db연결 객체
		Connection conn = null;
		//SQL명령
		PreparedStatement ps = null;
		//쿼리 결과
		ResultSet rs = null;
		
		ConnectionFactory factory = ConnectionFactory.getInstance();
		
		try {
			conn = factory.getConnection();
//			System.out.println("접속 성공");
//			System.out.println("auto 커밋 상태: " + conn.getAutoCommit());
			conn.setAutoCommit(false); // 비활성 -> 수동으로 커밋 해야 함
			
			StringBuffer query = new StringBuffer();
			query.append(" UPDATE tb_info");
			query.append(" SET hobby =? ");
			query.append(" WHERE nm =? ");

			ps = conn.prepareStatement(query.toString());
			ps.setString(1, hobby);
			ps.setString(2, name);
			
			int cnt = ps.executeUpdate(); // 쿼리문 실행!
			if(cnt > 0) {
				System.out.println(cnt + "행이 수정됨.");
				conn.commit();
			}else {
				System.out.println("대상 건이 없음");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			System.out.println("접속 종료");
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
