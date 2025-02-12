package ch13_thread;

/*
 * class Name : ExRunnable
 * Author : KIM
 * Created Date : 2025. 2. 12.
 * Version : 1.0
 * Purpose : JAVA 기초
 * Description : 스레드 사용법 - Runnable 인터페이스 구현
 */
public class ExRunnable implements Runnable{

	int num;
	String name;
	
	public ExRunnable(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = num; i <= num+5; i++) {
			System.out.println(name + " " + i);
			// 시간 차를 두기 위해
			try {
				Thread.sleep(500); // 0.5초 딜레이
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
