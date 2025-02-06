package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		/* 사용자로부터 숫자를 입력받아 짝수인지 홀수인지 판별하시오
		 * 조건 1. 정수만 입력 받음
		 */
		
		// Ctrl + Shift + 5 -> 한번에 임포트 
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>>");
		
		// if문을 사용하여 짝수면 "짝수", 홀수면 "홀수"를 출력하시오.
		// 1. 입력받기(형 변환)		
		String userInput = scan.nextLine();
		int userInt = Integer.parseInt(userInput);
		// int userInt = Integer.parseInt(scan.nextLine());
		String output = "";
		
		// 2. 조건식 if, 연산자 사용				
		if((userInt % 2) == 0) {
			output = "짝수";
		}else {
			output = "홀수";
		}
		
		// 3. 출력하기
		System.out.println(output);
				
	}

}
