package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작");

		int[] arr = { 1, 2, 3 };
//		System.out.println(arr[3]); // 오류 발생
		String str = null;

		try {
//			System.out.println(arr[3]); // 오류 발생
			str.length();
		} catch (ArrayIndexOutOfBoundsException e) {
			// 인덱스를 넘어선 문제가 발생하면 요 캐치 블럭을 탄다(클래스로서). 아니면 아래 것
			// 그래서 특정 상황마다 다르게 줄 수 있음
			System.out.println("인덱스 문제!");
		} catch (NullPointerException e) {
			System.out.println("널입니닷!!!!");
		} catch (Exception e) { // 어떤 오류든
			System.out.println(e.toString());
			e.printStackTrace(); // 예외 발생 코드에 대해 추적한 내용 출력
		} finally {
			System.out.println("오류가 나든 안 나든 여기는 처리가 된닷!!!");
		}

		// throws 메서드 -> 호출하는 쪽에서 예외 처리 해야 함
		try {
			ExMethod.detailMillSec("2025/01/01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 예외 처리가 되어있는 메서드
		ExMethod.detailMillSec2("2025/01/01");
		
		try {
			ExMethod.PrinterName("");
		} catch (BizException e) {
			System.out.println(e.getErrCode()); // BizException 클래스 메서드
			System.out.println(e.getMessage()); // 부모(Exception) 메서드
		}
		
		try {
			ExMethod.PrinterName("길");
		} catch (BizException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 종료");
		
	}

}
