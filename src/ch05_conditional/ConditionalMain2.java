package ch05_conditional;

/*
 * class Name : ConditionalMain2
 * Author : KIM
 * Created Date : 2025. 1. 24.
 * Version : 1.0
 * Purpose : [JAVA 기초]
 * Description : [조건식 switch]
 */
public class ConditionalMain2 {
	public static void main(String[] args) {
		
		// switch 문은 단순 값을 매칭하는 경우 사용
		int num = 0;
		switch(num) {
		case 0:
			System.out.println("수강등록");
			break;
		case 1:
			System.out.println("기초 프로그래밍");
			break;
		case 2:
			System.out.println("취업 관련");
			break;
		default:
			System.out.println("종료");	
		}
	}

}
