package ch13_thread.issac;

public class IssacMain {

	public static void main(String[] args) throws InterruptedException {
		// 오픈 전
		Customer cust1 = new Customer("팽수", 3);
		Customer cust2 = new Customer("동길", 5);
		cust1.start(); // Customer run 호출
		cust2.start();
		// start의 순서는 보장되지 않는다
		
		Thread.sleep(1000);
		System.out.println("! 오픈 !");
		Issac.getInstance().orderCheck();
		
		Chef chef1 = new Chef(5);
		chef1.start();
		chef1.endCook = new EndCook() {
			@Override
			public void endOfCook() {
				System.out.println("토스트 완성!!!");
			}
		};
		Chef chef2 = new Chef(6);
		chef2.endCook = new EndCook() {
			@Override
			public void endOfCook() {
				System.out.println("얏호 토스트 완성!!!");
			}
		};
		chef2.start();
	}

}
