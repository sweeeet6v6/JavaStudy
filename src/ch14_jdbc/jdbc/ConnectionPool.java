package ch14_jdbc.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

/*
 * class Name : ConnectionPool
 * Author : KIM
 * Created Date : 2025. 3. 12.
 * Version : 1.0
 * Purpose : Java 기초
 * Description : maxConn 수량 만큼 접속 객체를 생성하여 
 * 				 풀(Pool)에 관리하는 클래스 
 */

public class ConnectionPool {
	
	// 동기화 Synchronized가 적용된 ArrayList
	private static Vector<Connection> pool = new Vector<>();
	private static ConnectionPool instance = new ConnectionPool();
	// 싱글톤
	public static ConnectionPool getInstance() {
		return instance;
	}
	private ConnectionPool() {
		try {
			initPool(); // 클래스를 인스턴스화 할 때 init을 호출(접속해놓음)
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 외부에서 데이터베이스 사용 요청 시
	public synchronized Connection getConnection() {
		if(pool.size() == 0) {
			try {
				System.out.println("가능한 연결이 없어용... WAIT!");
				wait(); // 연결이 반환될 때까지 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Connection conn = pool.get(0);
		pool.remove(0);
		
		return conn;
	}
	
	// 사용 후 반환
	public synchronized void releaseConnection(Connection conn) {
		System.out.println("사용 후 pool에 담기");
		pool.add(conn);
		notifyAll(); // 대기중인 스레드 깨우기 
	}
	
	// 풀 초기화 메서드
	private synchronized void initPool() throws SQLException {
		destroyPool();
		ConnectionFactory factory = ConnectionFactory.getInstance();
		int maxConn = factory.getMaxConn();
		// maxConn 수량 만큼 DB 접속
		for (int i = 0; i < maxConn; i++) {
			pool.add(factory.getConnection());
		}
	}
	
	// 풀 DB연결 닫기
	private synchronized void destroyPool() throws SQLException {
		for(int i = 0; i < pool.size(); i++) {
			pool.get(i).close(); // 하나씩 닫기
		}
		pool.clear();
	}
	
}
