package ch02_variable;

/*
 * class Name : Constant
 * Author : KIM
 * Created Date : 2025. 1. 22.
 * Version : 1.0
 * Purpose : [java 기초]
 * Description : [데이터 타입과 상수]
 */
// Shift + Alt + J [자동주석] class, method .. 등등 위치에서 누르면 됨.
// Ctrl + H 전체에서 찾기

public class Constant { 
	
	public static void main(String[] args) {
		
		// 상수 Constant 변경 불가
		// 상수는 보통 대문자로 표기(앞에 final 표기)
		final double MATH_PI = 3.14;
		//MATH_PI = 1; // 상수 변경 오류
		
		double math_pi = 3.14;
		math_pi = 1; // 변수는 변경 가능
		
		//문자열 String 타입은 클래스로 관리되어짐(다양한 함수[메소드]를 내장하고 있음)
		String fruits = " Apple, Banana, Cherry ";
		
		System.out.println(fruits.length()); // 문자열의 길이를 리턴
		String trimfruits = fruits.trim();  // 문자열의 앞, 뒤 공백을 제거
		System.out.println(trimfruits.length()); 
		
		// .indexOf("키워드") 키워드 문자열을 찾아서 첫번째 인덱스를 리턴
		// 문자열의 인덱스는 0부터 시작
		System.out.println(trimfruits.indexOf("Banana"));
		System.out.println(trimfruits.indexOf("바나나"));	// 없으면 -1를 리턴
		
		// .substring(start, end) 인덱스: start 부터 end - 1 까지 자름
		// .substring(start) 인덱스	  : start 부터 끝까지
		System.out.println(trimfruits.substring(15));
		System.out.println(trimfruits.substring(7, 13));		
		
		String pangsu = "팽수:10";
		// 이름과 나이를 각각 출력하세요
		System.out.println(pangsu.substring(0, 2));
		System.out.println(pangsu.substring(3));
		String stu = "김길동:20";
		String stu2 = "남궁민수:20";
		
		
		
	}

}
