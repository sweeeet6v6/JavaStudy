package ch04_operator;

import java.util.Scanner;

/*
 * class Name : OperatorEx
 * Author : KIM
 * Created Date : 2025. 1. 23.
 * Version : 1.0
 * Purpose : [JAVA 기초]
 * Description : [연산자 연습문제]
 */

public class OperatorEx {

	public static void main(String[] args) {
		
		// 사용자에게 이메일 주소를 입력 받고 이메일 형식이면 "사용 가능"을, 아니면 "이메일 형식이 아닙니다"를 출력(@의 유무가 기준)
		
		Scanner scan = new Scanner(System.in); // 인스턴스화?! 알듯말듯 ㅋㅋ
		System.out.println("email 주소를 입력하세요");
		System.out.print(">>>>");
		
		// 1. 입력 받기
		String userInput = scan.nextLine();
		
		// 2. 형식 체크
		String output = (userInput.indexOf("@") > 0) ? "사용 가능" : "이메일 형식이 아닙니다!";
		
		// 3. 메시지 출력
		System.out.printf("입력은 %s, %s", userInput, output);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
