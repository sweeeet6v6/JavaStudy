package ch06_method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		// coffee shop method를 만들기
		// input: 고객 수
		// output: 없음

		// 고객 수만큼 커피 주문을 받아 금액을 출력하는 메소드
		// 아아, 아메리카노: 3000, 카푸치노: 4500, 밀크티: 5000
		// 메뉴가 없으면 '메뉴가 없습니다.' 출력 후 다시 주문받기
		// n명 고객 주문 완료
		// 총 주문 금액: m원
		
		coffeeShop(3);
		
	}
	
	// 1. 메소드 선언
	public static void coffeeShop(int num) {
		System.out.println(num + "명 고객 출현");

		Scanner scan = new Scanner(System.in);
		int total = 0; // 주문 금액
		int i = 1; // 고객 수 세기
		
		// 2. 인원 수 만큼 반복(특정 횟수 반복은 for, 조건이 만족할 때까지 반복은 while)
		while(i <= num) {
			System.out.println(i + "번째 고객님 어떤 걸 드릴까요?");
			String order = scan.nextLine();
			System.out.println(order + " 주문");
			
			// 3. 사용자 입력에 따른 음료의 가격 조건문(단순 값비교는 switch)
			// 4. 조건에 해당되는 음료가 있을 때 가격 합산(해당 메서드 전역적으로 합산 관련 변수 사용)
			switch(order) {
			case "아아":
			case "아메리카노":
				System.out.println("선택하신 음료는 3000원 입니다.");
				total += 3000;
				break;
				
			case "카푸치노":
				System.out.println("선택하신 음료는 4500원 입니다.");
				total += 4500;
				break;
				
			case "밀크티":
				System.out.println("선택하신 음료는 5000원 입니다.");
				total += 5000;
				break;
				
			default:
				System.out.println("메뉴가 없습니다.");
				continue;
				
			}
			
			i++;

		}
		
		// 5. 인원수에 따른 주문이 완료되면 합산 출력
		System.out.print(num + "명의 고객 주문 완료. \n총 주문 금액: " + total + "원");
			
	}
	
}