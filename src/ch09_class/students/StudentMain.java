package ch09_class.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student("팽수"); // new 클래스를 사용하기 위해 인스턴스화
		Student stu2 = new Student("팽순");
		Student stu = new Student();
		System.out.println(stu1);
		System.out.println(stu2);
		
		System.out.println(stu1.getName());
		stu1.setName("김팽수");
		System.out.println(stu1.getName());
		
		stu1.setKor(90);
		System.out.println(stu1);
		stu1.setEng(75);
		System.out.println(stu1);
		
		stu1.nm(); 
		Student.check(); // 정적메소드 호출
//		Student.nm(); -> Class의 기본 메소드는 인스턴스 메소드임(인스턴스화 이후 사용 가능)
		
		ArrayList<Student> classMate = new ArrayList<>();
		classMate.add(stu1);
		classMate.add(stu2);
		classMate.add(new Student("닉", 100, 90, 80));
		classMate.add(new Student("주디", 80, 90, 80));
		
		for(Student st : classMate) {
			System.out.println(st);
		}
		
		// 버블 정렬
		for(int k = 0; k < classMate.size() - 1; k ++) {
			for(int i = 0; i < classMate.size() - 1; i++) {
				// i < i + 1 -> 내림
				// i > i - 1 -> 오름
				if(classMate.get(i).getAvg() < classMate.get(i + 1).getAvg()) {
					Student temp = classMate.get(i);           // 임시 공간에 
					classMate.set(i,  classMate.get(i + 1));   // i번째와 순서 바꾸기
					classMate.set(i + 1, temp);
				}
			}
		}
		
		System.out.println(classMate);
		
		// Collections.sort 객체 사용
		// -1: 두 객체의 순서를 바꾸지 않음
		//  1: 두 객체의 순서를 바꿈
		//  0: 유지
		Collections.sort(classMate, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				double diff = o2.getAvg() - o1.getAvg();
				if(diff < 0) {
					return -1;
				}
				return 1; // 차이가 0보다 크면 o2가 더 크기 때문에 순서를 바꿈
			}
		});
		
		System.out.println(classMate);
		
		
		
	}

}
