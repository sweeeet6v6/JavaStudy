package ch13_thread;

/*
 * class Name : ExThread
 * Author : KIM
 * Created Date : 2025. 2. 12.
 * Version : 1.0
 * Purpose : [JAVA 기초]
 * Description : 스레드 사용 - Thread 클래스를 상속 받는 방법
 */
public class ExThread extends Thread{
	
	int num;
	
	public ExThread(int num, String name) {
		super(name);
		this.num = num;
	}

	// 스레드.start() 메소드 호출 시 실행되는 메소드
	// 스레드 사용 로직을 완성하는 부분
	@Override
	public void run() { // 실제 작업 내용이 들어가는 부분
		for(int i = num; i <= num+5; i++) {
			System.out.println(super.getName() + " " + i);
			// 시간 차를 두기 위해
			try {
				Thread.sleep(500); // 0.5초 딜레이
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
