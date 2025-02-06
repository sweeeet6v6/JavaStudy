package ch07_array;

public class ArrayEx {

	public static void main(String[] args) {
		// 1. 우리반 학생들의 이름이 담긴 String [] 선언
		// Shift + alt + a
		// Ctrl + Shift + F : 자동 정렬
		String[] students = { "강지석", "김도래", "김병준", "김서영", "김소연", "김원진", "박정단", "박종욱", "송은호", "신미정", "이예성", "이예은", "정지나", "최보석", "한수정" };
		
		// 학생 출력
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		// 학생들의 이름에 출석부 순번을 붙여 출력하기
		for(int i = 0; i < students.length; i++) {
			System.out.println((i + 1)+ "." + students[i]);
		}
		
		// 같은 성 찾기 메소드
		// input : String, String[]
		// output : 없음
		// 호출: searchNm("이", students);
		// 출력: '이'씨 성을 가진 학생은 총 2명 있습니다.
		//		이 ~~ 주루룩 나오게
			
		searchNm("김", students);
		
	}

	// 4. 반복이 종료되고 성과 카운트 출력
	// 1. 비어있는 메서드 만들기
	public static void searchNm(String lastNm, String [] arr) {
		int total = 0;
		String nm = "";
		
		// 2. 반복문
		for(int i = 0; i < arr.length; i++) {
			// 3. 각 이름의 첫자리가 찾고자하는 성과 같은지 확인(문자열 인덱스 접근 or substring) -> 같으면 카운트 증가(변수로 선언)
			if(arr[i].substring(0, 1).equals(lastNm)) {
				total += 1;
				nm += arr[i] + "씨 ";
			}
		}
		
		System.out.println(lastNm + "씨 성을 가진 동기분은 총 " + total + "명 있습니다.");
		System.out.println(nm);
		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].substring(0, 1).equals(lastNm)) {
//				System.out.print(arr[i] + "씨 ");
//			}
//		}

		System.out.println("\n=================================");
	}
	
}
