package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	// 한번에 관리하기 위해 클래스 변수로 선언
	private static ArrayList<Account> accountList = new ArrayList<>();

	public static void main(String[] args) {
		// Q.1 다음은 키보드로부터 계좌 정보를 입력 받아 계좌를 관리하는 프로그램입니다.
		// 계좌는 Account 객체로 생성되고 BankApplication에서 길이 Account[] 배열로 관리됩니다.
		// 실행 결과를 보고 Account 와 BankApplication 클래스를 작성해 보세요
		// (키보드 입력을 받을 때는 Scanner 의 nextLine() 메소드를 사용
//		String[] Account; // 계좌를 관리하는 배열 생성

		Scanner scan = new Scanner(System.in); // 사용자 입력 받을 준비
		
		
		while(true) {
			System.out.println("필요한 메뉴를 선택하세요");
			System.out.println("===============================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("선택 >");
			int userInput = Integer.parseInt(scan.nextLine());
			
			if(userInput == 1) {
				System.out.println("--------");
				System.out.println("계좌 생성");
				System.out.println("--------");
				System.out.println("계좌번호를 입력하세요. > ");
				String newAccNum = scan.nextLine();
				System.out.println("계좌주를 입력하세요. > ");
				String newAccName = scan.nextLine();
				System.out.println("초기 입금액을 입력하세요. > ");
				int newAccBal = Integer.parseInt(scan.nextLine());
				makeAccount(newAccNum, newAccName, newAccBal);
				System.out.println();
				System.out.println("결과: 계좌가 생성되었습니다!");
			}else if(userInput == 2) {
				System.out.println("--------");
				System.out.println("계좌 목록");
				System.out.println("--------");
				printAccount();
			}else if(userInput == 3) { 
				System.out.println("--------");
				System.out.println("입금");
				System.out.println("--------");
				System.out.println("계좌번호를 입력하세요. > ");
				String depAcc = scan.nextLine();
				System.out.println("입금할 금액을 입력하세요. > ");
				int depNum = Integer.parseInt(scan.nextLine());
				accountDeposit(depAcc, depNum);
			}else if(userInput == 4) {
				System.out.println("--------"); 
				System.out.println("출금");
				System.out.println("--------");
				System.out.println("계좌번호를 입력하세요. > ");
				String withAcc = scan.nextLine();
				System.out.println("출금할 금액을 입력하세요. > ");
				int withNum = Integer.parseInt(scan.nextLine());
				accountWithdraw(withAcc, withNum);
				System.out.println("결과: " + withNum + "원 출금이 성공되었습니다");
			}else if(userInput == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
		

	}

	// 새 계좌를 만드는 함수
	public static void makeAccount(String accountNum, String name, int balance) {

		Account account = new Account(accountNum, name, balance);

		accountList.add(account);
	}

	// 계좌 목록을 출력하는 함수
	public static void printAccount() {

		// 모든 계좌 정보를 출력
		for (Account acc : accountList) {
			System.out.println("계좌 번호: " + acc.getAccountNum());
			System.out.println("소유자: " + acc.getName());
			System.out.println("잔액: " + acc.getBalance());
			System.out.println();
		}
	}

	// 입금하는 함수
	public static int accountDeposit(String account, int num) {
		int afterBalance = -1;

		int accTemp = 0;

		for (Account acc : accountList) {
			if (account.equals(acc.getAccountNum())) {
			accTemp = acc.getBalance() + num;
			acc.setBalance(accTemp);
			}
		}

		return afterBalance;
	}

	// 출금하는 함수
	public static int accountWithdraw(String account, int num) {
		int afterBalance = -1;

		int accTemp = 0;

		for (Account acc : accountList) {
			if (account.equals(acc.getAccountNum())) {
			accTemp = acc.getBalance() - num;
			acc.setBalance(accTemp);
			}
		}

		return afterBalance;
	}

}
