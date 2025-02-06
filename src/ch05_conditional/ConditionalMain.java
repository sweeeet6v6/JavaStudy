package ch05_conditional;

/*
 * class Name : ConditionalMain
 * Author : KIM
 * Created Date : 2025. 1. 23.
 * Version : 1.0
 * Purpose : [Java 기초]
 * Description : [조건문 if]
 */

public class ConditionalMain {

	public static void main(String[] args) {
		
		int score = 85;
		String grade = "";
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		
		System.out.println(score + "는 " + grade);
		
		// 변수의 scope
		int price = 3000;
		int myMoney = 1000;
		
		if(price > myMoney) {
			
		}
		
		// 중첩 if 가능
		// 조건 1: 이름은 1글자 이상
		// 조건 2: 전화번호는 10 or 11 자리
		// 조건 1을 만족하지 않으면 가입 실패
		
		String nm = "닉";
		String phone = "0101234567";
		
		if(nm.length() >= 1) {
			if(phone.length() == 10 || phone.length() == 11) {
				System.out.println("환영합니다.");
			}else {
				System.out.println("가입 실패!!");
			}
		}else {
			System.out.println("가입 실패!!");
		}
		
		
		
		
		
		
		
		

	}

}
