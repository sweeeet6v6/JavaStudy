package ch11_java_api;

public class ApiString {

	public static void main(String[] args) {
		String nm = "길동";
		System.out.println(nm);
		System.out.println(nm.hashCode()); // 주소
		
		nm = "팽수"; // 값 재할당
		System.out.println(nm.hashCode()); // 주소
		// nm에 다른 값을 넣었지만 다른 주소가 출력됨
		
		/* String은 불변(immutable)으로 한 번 초기화되면 그 값이 변경되지 않는다.
		 * 변수에서 값 재할당 시 바뀌는 건 새로운 객체를 만든 것
		 * 메모리 영역에서 매번 새로운 String 객체를 만들면 가비지컬렉터(메모리 관리)에서 할 일이 많아짐
		 * 그래서 문자열 변경이 많다면 StringBuffer 클래스 사용
		 */
		
		StringBuffer str = new StringBuffer();
		str.append("길수");
		System.out.println(str.hashCode());
		str.append("동길");
		System.out.println(str.hashCode());
		// 문자열 가져오기
		String msg = str.toString();
		System.out.println(msg);
	}

}
