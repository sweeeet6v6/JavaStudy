package ch06_method;

/*
 * class Name : RecursionMain
 * Author : KIM
 * Created Date : 2025. 1. 31.
 * Version : 1.0
 * Purpose : [JAVA 기초]
 * Description : [재귀함수]
 */

public class RecursionMain {

	public static void main(String[] args) {
		
		System.out.println(recFactorial(3));

	}
	
	// factorial 재귀함수 활용
	public static long recFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		// 만약 3을 입력하면
		// 3 * recFactorial(2)
		// 3 * 2 * recFactorial(1)
		return num *= recFactorial(num - 1);
	}
	
	// 재귀함수는 멈추는 게 중요함
//	public static void Func(int num) {
//		System.out.println("hi");
//		Func(num - 1);
//	}

}
