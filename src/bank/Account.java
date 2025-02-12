package bank;

public class Account {
	//Q.1 다음은 키보드로부터 계좌 정보를 입력 받아 계좌를 관리하는 프로그램입니다.
	// 계좌는 Account 객체로 생성되고 BankApplication에서 길이 Account[] 배열로 관리됩니다.
	// 실행 결과를 보고 Account 와 BankApplication 클래스를 작성해 보세요
	// (키보드 입력을 받을 때는 Scanner 의 nextLine() 메소드를 사용

	// 1. 필드, 속성값
	// 계좌번호, 이름, 잔액
	private String accountNum;
	private String name;
	private int balance;
	
	// 2. 생성자
	public Account(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}

	// toStirng
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", name=" + name + ", balance=" + balance + "]";
	}
	
	// 3. getter, setter
	public String getAccountNum() {
		return accountNum;
	}


	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	
	
}
