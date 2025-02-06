package ch09_class.students;

import ch09_class.util.UtilClass;

/*
 * class Name : Student
 * Author : KIM
 * Created Date : 2025. 2. 5.
 * Version : 1.0
 * Purpose : [Java 기초]
 * Description : [Class 기초]
 */

public class Student {
	// 1. 필드, 속성값
	// public: 공개, 프로젝트 어디서든 사용 가능
	// private: 비공개, 현재 클래스 내에서만 접근 가능
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	
	// 2. 생성자(Class는 생성자를 정의하지 않아도 무조건 클래스명의 생성자가 있다)
	// 단축키 Shift + Alt + S
	public Student(String name) { // 이름 있게 생성
		this.name = name;
		save();
	}
	
	// 생성자 오버로딩
	// 해당 객체를 다양하게 만들 수 있음
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}

	public Student() { // 이름 없이도 생성 가능
	}
	
	
	

	// 3. toString 출력
	// 부모의 기능을 재정의하는 기능
	// 오버라이드 (부모에게 toString 메서드가 있음)
	@Override 
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	
	// 4. getter, setter 
	// private 변수에 외부 클래스에서 접근하기
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		setAvg(); // 점수 변경이 발생하면 평균 계산
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setAvg();
	}
	
	private void setAvg() {
									// this.kor 동일
		this.avg = UtilClass.weRound((kor + eng + math) / 3.0, 2);
		// static 메서드라 샤용 가능
	}
	
	public void nm() {
		System.out.println(name + " 입니다.");
	}
	
	public void save() {
		System.out.println(name + " 등록됨.");
	}
	
	public static void check() {
		System.out.println("student의 static method명.check로 호출가능");
	}
	// static이 없으면 인스턴스화 된 객체를 대상으로만 메서드 사용 가능??

	public double getAvg() {
		return avg;
	}
	

	
}
