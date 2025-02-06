package ch05_conditional;

import java.util.Scanner;

/*
 * class Name : LoopWhile
 * Author : KIM
 * Created Date : 2025. 1. 24.
 * Version : 1.0
 * Purpose : [Java 기초]
 * Description : [반복문 while]
 */

public class LoopWhile {

	public static void main(String[] args) {
		// while(조건식) 조건식이 true면 반복(무한루프 주의)
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		boolean flag = true;
//		
//		while(flag) {
//			System.out.println("===============");
//			System.out.println("이름을 입력하세요.(종료: q)");
//			String nm = scan.nextLine();
//			
//			//
//			if(nm.equals("q")) {
//				flag = false;
//			}else {
//				System.out.println(nm + "님, 환영합니다.");
//			}
//			System.out.println("===============");
//		}
//		
//		// flag를 사용하지 않고도 사용할 수 있다. 위와 동일
//		while(true) {
//			System.out.println("===============");
//			System.out.println("이름을 입력하세요.(종료: q)");
//			String nm = scan.nextLine();
//			
//			//
//			if(nm.equals("q")) {
//				break;
//			}else {
//				System.out.println(nm + "님, 환영합니다.");
//			}
//			System.out.println("===============");
//		}
		
		// while 문으로 구구단 2 ~ 9단까지 출력하시오.
		int dan = 2;
		// 1. 단(2 ~ 9) while문 작성
		while(dan <= 9) {
			int num = 1;
			System.out.println(dan + "단");			
			// 2. 곱하는 수(1 ~ 9)에 해당되는 while문 작성
			while(num <= 9) {
				System.out.printf("%d × %d = %d \n", dan, num, dan*num);
				num++;
			}
			dan++;
			System.out.println("");
		}
		
		// 10부터 1로 감소
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		// 5씩 증가
		for(int i = 1; i <= 100; i += 5) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		
		
		
		
		
		
		
		
	}

}
