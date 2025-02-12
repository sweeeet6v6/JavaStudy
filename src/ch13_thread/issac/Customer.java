package ch13_thread.issac;

public class Customer extends Thread{
	
	private Issac issac = Issac.getInstance();
	private String name; // 주문명
	private int count; // 개수
	// 주문명과 개수를 넣어서 인스턴스를 호출할 수 있다
	
	// 생성자
	public Customer(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		System.out.println(name + " 주문!");
		issac.buyToast(name, count);
	}

}
