package cafe;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		
		// 카페 만들기
		Cafe starbucks = new Cafe("starbucks");
		Cafe aka = new Cafe("aka");
		
		// 대표 음료 3개 추가
		Coffee starbucksMenu1 = new Coffee("아메리카노", "Americano", 4700);
		Coffee starbucksMenu2 = new Coffee("돌체 라떼", "Dolce Latte", 6100);
		Coffee starbucksMenu3 = new Coffee("쿨 라임 피지오", "Cool Lime Fizzio", 6100);
		
		// 카페에 메뉴 넣어주기
		starbucks.addMenu(starbucksMenu1);
		starbucks.addMenu(starbucksMenu2);
		starbucks.addMenu(starbucksMenu3);
		
		Coffee akaMenu1 = new Coffee("아메리카노", "Americano", 4100);
		Coffee akaMenu2 = new Coffee("카페 라떼", "Caffe Latte", 4500);
		Coffee akaMenu3 = new Coffee("콜드브루", "Cold Brew", 6100);
				
		aka.addMenu(akaMenu1);
		aka.addMenu(akaMenu2);
		aka.addMenu(akaMenu3);
			
		// 사용자 입력을 받기 위한 준비
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행동을 선택해주세요!");
		System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실 복귀");
		int userInput = Integer.parseInt(scan.nextLine());
		if (userInput == 1) {
			starbucks.printMenu();
			System.out.println("메뉴를 선택해주세요!");
			int menuCoice = Integer.parseInt(scan.nextLine());
			starbucks.buyCoffee(menuCoice);
		} else if (userInput == 2) {
			aka.printMenu();
			System.out.println("메뉴를 선택해주세요!");
			int menuCoice = Integer.parseInt(scan.nextLine());
			aka.buyCoffee(menuCoice);
		} else if (userInput == 3) {
			System.out.println("사무실로 복귀합니다...");
		}
		
	}

}
