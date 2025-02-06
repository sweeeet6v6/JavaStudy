package ch07_array;

/*
 * class Name : ArrayMain
 * Author : KIM
 * Created Date : 2025. 2. 3.
 * Version : 1.0
 * Purpose : [JAVA 기초]
 * Description : [array 배열 선언 및 사용법]
 */

public class ArrayMain {

	public static void main(String[] args) {
		String samjang = "삼장";
		String ogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";
		
		// 배열(array)
		// String[] 문자열 배열
		String [] seoyugi = new String[4];  // 첨자는 배열의 크기
		System.out.println(seoyugi.length); // 배열의 길이 리턴
		System.out.println(seoyugi[0]);     // null은 값이 없음을 뜻함.
		System.out.println(seoyugi);

		seoyugi[0] = samjang;
		seoyugi[1] = ogong;
		seoyugi[2] = saojeong;
		seoyugi[3] = palgye;
		
		printArr(seoyugi);
		
		int [] numbers = new int[3];
		System.out.println(numbers[0]);
		
		boolean [] bools = new boolean[5];
		System.out.println(bools[0]);
		
		// 배열 수정
		for(int i = 0; i < seoyugi.length; i++) {
			seoyugi[i] = "서유기 " + seoyugi[i];
		}
		printArr(seoyugi);
		
		// 오공이 포함되어 있는 배열의 요소를 찾아서 '서유기' -> '드래곤볼'로 변경
		for(int i = 0; i < seoyugi.length; i++) {
			// 포함 문자열이 있으면 true, 없으면 false 리턴
			if(seoyugi[i].contains("오공")) {
				//.replace("찾는 문자열", "변경 문자열")
				// 만약 변경하고자 하는 동일 문자열이 많다면 replaceAll
				seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
			}
		}
		
		printArr(seoyugi);
		
		// 값을 할당하여 배열 선언
		String [] students = {"팽수", "길동", "동길", "길수"}; // 아래와 동일
//		String [] students = new String[] {"팽수", "길동", "동길", "길수"};
		printArr(students);
		
		String subjects = "JAVA, DB, JS, HTML";
		// ',' 을 구분으로 배열에 담기
		String [] subArr = subjects.split(",");
		printArr(subArr);
		// trim 양쪽 공백 제거
		for(int i = 0; i < subArr.length; i++) {
			subArr[i] = subArr[i].trim();
		}
		
		printArr(subArr);
		
		// 배열의 복사 1. 얇은 복사 shallow copy(주소값 복사)
		printArr(seoyugi);
		String [] sinSeoyugi = seoyugi; // 단순 할당은 주소가 복사됨
		printArr(sinSeoyugi);
		sinSeoyugi[0] = "강호동";
		printArr(seoyugi);
		printArr(sinSeoyugi);
		
		// 배열의 복사 2. 깊은 복사(deep copy)
		String [] newSeoyugi = seoyugi.clone();
		newSeoyugi[2] = "은지원";
		printArr(seoyugi);
		printArr(newSeoyugi);
		
		// clone 생각 안 날 때 ㅋㅋ
		// 새로운 배열을 복사 -> 대상 배열 길이만큼으로 선언
		String [] copy = new String[seoyugi.length];
		for(int i = 0; i < seoyugi.length; i++) {
			copy[i] = seoyugi[i];
		}
		
		// 일차원 배열
		int [] oneD = {1, 2, 3};
		System.out.println(oneD[1]);
		
		// 다차원 배열
		int [][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(twoD[0][1]);
		int [][][] threeD = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10,11}}};
		System.out.println(threeD[0][0][1]);
		
		System.out.println("==== 2차원 ====");
		for(int i = 0; i < twoD.length; i++) {
			for(int j = 0; j < twoD[i].length; j++) {
				System.out.println(twoD[i][j]);
			}
		}
		
		System.out.println("==== 3차원 ====");
		for(int i = 0; i < threeD.length; i++) {
			for(int j = 0; j < threeD[i].length; j++) {
				for(int x = 0; x < threeD[i][j].length; x++) {
					System.out.println(threeD[i][j][x]);	
				}
			}
		}
		
	}
	
	// 배열 출력하는 메서드. 매개 변수로 문자열 배열을 받는다.
	public static void printArr(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");
//			if(i < arr.length - 1) {
//				System.out.print(", ");
//			}
			}
		}
}
