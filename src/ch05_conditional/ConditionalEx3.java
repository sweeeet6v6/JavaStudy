package ch05_conditional;

public class ConditionalEx3 {

	public static void main(String[] args) {
		/* 거꾸로 트리를 5층 만들기
		 * 
		 */
		
		// 중첩 for문 or 문자열 자르기
		
		for(int i = 5; i >= 1; i--) {
			String stars = "*****";
			System.out.println(stars.substring(0, i));
		}

		// 풀이
		// 1. 문자열 자르는 함수 사용
		String star = "*****";
		for(int i = 5; i >= 1; i--) {
			String subStr = star.substring(0, i);
			System.out.println(subStr);
		}
		
		// 2. 중첩 for문 사용
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
