package ch03_system;

import java.util.Scanner;

public class SystemEx {

	public static void main(String[] args) {
		/* 1. 사용자 이름:나이를 입력받아 이름 나이 따로 출력
		 * 2. 사용자 이름:나이를 입력받아 변수에 각각 할당 후 해당 변수로 사용자의 이름과 나이를 출력 
		 * 단, 이름의 길이가 달라질 수 있음(hint ':'을 기준으로 앞이 이름, 뒤가 나이
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요 = ");
		
		// 1번
		String userInput = scan.nextLine();
		System.out.println(userInput);
		int sepNameAge = userInput.indexOf(":"); // 콜론의 위치 확인
		// System.out.println(sepNameAge);
		System.out.println("1번 문제");
		System.out.println(userInput.substring(0, sepNameAge)); // 이름만 출력
		System.out.println(userInput.substring(sepNameAge + 1)); // 나이만 출력
		
		// 2번
		String userName = userInput.substring(0, sepNameAge);
		String userAge = userInput.substring(sepNameAge + 1);
		System.out.println("2번 문제");
		System.out.print("입력하신 이름: " + userName + ", 나이: " + userAge);
		System.out.println();
		System.out.printf("입력하신 이름: %s, 나이: %s", userName, userAge);
		
		int intAge = Integer.parseInt(userAge);
	}
}
