package practice;

import java.util.Scanner;

public class Result01 {

	public static void main(String[] args) {
//		 1번 과제(사용자로부터 점수를 입력받아 등급 출력하기)
//		 변수 선언
		double korScore;
		double engScore;
		double mathScore;
		double avgScore;
		String grade;
		
		Scanner scan = new Scanner(System.in);
		
		// 각 점수 입력받아 저장하기
		System.out.print("국어 점수를 입력해주세요. \n>>> ");
		korScore = Double.parseDouble(scan.nextLine());
		
		System.out.print("영어 점수를 입력해주세요. \n>>> ");
		engScore = Double.parseDouble(scan.nextLine());
		
		System.out.print("수학 점수를 입력해주세요. \n>>> ");
		mathScore = Double.parseDouble(scan.nextLine());
		
		// 사용자로부터 점수를 잘 받았는지 확인
		System.out.println(korScore + " " + engScore + " " + mathScore);
		
		// 평균 점수 계산
		avgScore = (korScore + engScore + mathScore) / 3.0;
		
		System.out.println(avgScore);
		
		// 등급 계산
		if(avgScore >= 90.0) {
			grade = "A";
		}else if(avgScore >= 80.0) {
			grade = "B";
		}else if(avgScore >= 70.0) {
			grade = "C";
		}else {
			grade = "D";
		}
		
		// 출력
		System.out.println("평균: " + avgScore);
		System.out.println("등급: " + grade + " 등급");
		
		
		
		//2번 과제(팩토리얼)
		// 10! 계산하기	
		int factorial_10 = 1;
		
		for(int i = 10; i >= 1; i--) { // 10 ~ 1
			factorial_10 *= i;
		}
		System.out.println("결과: " + factorial_10);

		// 15! 계산하기
		// 숫자 크기 신경쓰기
		long factorial_15 = 1;
		
		for(long i = 15; i >= 1; i--) { // 15 ~ 1
			factorial_15 *= i;
		}
		System.out.println("결과: " + factorial_15);
	
		
	}

}
