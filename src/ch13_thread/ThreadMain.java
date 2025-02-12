package ch13_thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		System.out.println("main start");
		print(20);
		print(100);
		
		// 1. Thread 상속 받아 사용
		ExThread job1 = new ExThread(20, "job1");
		job1.start(); // run() 메서드 실행
		ExThread job2 = new ExThread(100, "job2"); // 멀티 스레드
		job2.start();
		
		// Runnable 인터페이스 구현 클래스 사용
		ExRunnable exRun1 = new ExRunnable(300, "job3");
		Thread job3 = new Thread(exRun1); // Thread의 생성자에 Runnalbe를 매개변수로 받는 게 있음
		job3.start();
		
		// 3. 람다식 사용(익명함수) 
		// () 매개변수 {} 로직
		// 재사용이 아닌 일회성!
		Thread job4 = new Thread(() -> {
			int num = 600;
			for(int i = num; i <= num + 5; i++) {
				System.out.println("job4 " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		job4.start();
		
		System.out.println("main end");

	}
	
	public static void print(int num) {
		for(int i = num; i <= num + 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
