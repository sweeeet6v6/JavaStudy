package ch04_operator;

import java.util.Scanner;

/*
 * class Name : OperatorMain
 * Author : KIM
 * Created Date : 2025. 1. 23.
 * Version : 1.0
 * Purpose : [JAVA 기초]
 * Description : [기본 연산자]
 */

public class OperatorMain {

	public static void main(String[] args) {
		
		// 1. 증감연산자 ++ --
		int num = 10;
		num++;
		num++;
		num++;
		
		// "문자열" + "문자열" = 문자열
		// "문자열" + "숫자 형태" = 문자열
		System.out.println("++ 이후 " + num);
		
		num --;
		System.out.println("-- 이후 " + num);
		
		// 주의(연산자의 전, 후에 따라 다름)
		int a, b;
		a = num++; // 후
		b = ++num; // 전
		System.out.printf("a: %d, b: %d \n", a, b); 
		
		//2. 대입 연산자 +=, -=, *=, /=, %=
		int c = 1;
		c += 2; // c = c + 2;
		System.out.println("c: " + c);
		
		c *= 10; // c = c * 10;
		System.out.println("c: " + c);
		
		// 3. 산술 연산자 +, -, *, /, % (%는 나머지를 반환)
		System.out.println(10 + 5);
		System.out.println(10 % 5);
		
		// 4. 비교 연산자 >, <, >=, <=, !=, ==
		int num1 = 10;
		int num2 = 20;
		System.out.println("-- 비교 연산자 --");
		System.out.printf("num1: %d vs num2: %d \n", num1, num2);
		// 비교 연산자는 연산 후 T/F를 리턴(boolean)
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		
		// 5. 삼항 연산자(조건 연산자)
		// (a) ? (b) : (c) : a의 조건식이 true 이면 b, false 이면 c
//		String msg = (a > 9) ? "a가 9보다 큼" : "9보다 작음";
//		System.out.println(msg);
//		
//		System.out.println("아이디를 입력해주세요(4자리 이상)");
//		System.out.print(">>>>");
		Scanner scan = new Scanner(System.in);
//		// 사용자 입력을 받아서 조건이 맞으면 "(사용 가능합니다.)" 맞지 않으면 "(4자리 이상으로 다시 입력하세요.)" 출력
//		String userInput = scan.nextLine();
//		int len = userInput.length();
//		System.out.println("문자열 길이: " + len);
//		String output = 
//				len >= 4 ? "사용 가능합니다." : "4자리 이상으로 다시 입력하세요.";
//		System.out.println(output);
		
		// 6. 논리 연산자 &&(and) ||(or)
		// 아이디를 (8 ~ 14) 길이만 사용 가능
//		System.out.println("=== 논리 연산 ===");
//		System.out.println("아이디를 입력하세요(8~14 길이: ");
//		System.out.print(">>>>");
//		
//		String userInput2 = scan.nextLine();
//		int len2 = userInput2.length();
//		String output2 = (len2 >= 8 && len2 < 15) ? "가능" : "불가능";
//		System.out.println(output2);
//		
		// 성적이 90 이상 A, 80 이상 B, 나머지는 C
		System.out.println("성적을 입력하세요");
		System.out.print(">>>>");
		
		// 결과는 A입니다. B입니다. C입니다. 
		// 1. 입력받기
		String userScoreInput = scan.nextLine();
		
		// 2. 형 변환 
		int userScore = Integer.parseInt(userScoreInput);
		
		// 3. 조건식 
		String scoreOutput = (userScore >= 90) ? "A" : ((userScore >= 80) ? "B" : "C");
		
		// 4. 결과 출력
		System.out.println("결과는 " + scoreOutput + "입니다.");
		
		
		
		
		
		
		
		
		
		
		

	}

}
