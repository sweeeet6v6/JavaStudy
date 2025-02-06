package ch06_method;

public class MethodEx {

	public static void main(String[] args) {
		// 이름, 국어 수학 영어 점수를 입력 받아 평균과 등급을 출력하는 메소드를 작성하시오
		// input: String, int, int, int
		// output: 없음
		// method name: makeCard
		// 등급은 90 이상 A, 80 이상 B 나머지 C
		// 출력: XXX님의 평균은 95.0으로 A등급 입니다.
		
		makeCard("팽수", 100, 90, 100);

	}

	public static void makeCard(String name, int kor, int math, int eng) {
		double avg;
		String grade;
		
		avg = (kor + math + eng) / 3.0;
		
		if(avg >= 90.0) {
			grade = "A";
		}else if(avg >= 80.0) {
			grade = "B";
		}else {
			grade = "C";
		}
		
		System.out.println(name + "님의 평균은 " + avg + "점으로 " + grade + "등급 입니다.");
		System.out.printf("%s님의 평균은 %.2f점으로 %s등급 입니다.", name, avg, grade);
		
	}
	
}
