package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * class Name : CollectionList
 * Author : KIM
 * Created Date : 2025. 2. 4.
 * Version : 1.0
 * Purpose : [Java 기초]
 * Description : [ArrayList]
 */

public class CollectionList {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크는 데이터를 보다 쉽게 다룰 수 있도록 재사용 가능한 컬렉션 클래스를 제공한다.
		 * List, Set, Map,
		 * 1. List: 순서대로 객체를 저장하는 구조, 중복된 원소룰 허용
		 * 			원소에 접근하기 위헤 인덱스를 사용(ArrayList, LinkedList)
		 * 
		 * 2. Map : Key와 Value 쌍으로 이루어진 객체를 저장하는 구조
		 * 			Key는 중복될 수 없으며 각 키는 하나의 값을 가리킴.(HashMap, TreeMap)
		 * 
		 * 3. Set : 중복을 허용하지 않는 객체의 모음. 원소의 순서는 보장하지 않음(HashSet, TreeSet) 
		 * */
		
		// 동적 배열(크기가 자유롭다)
		ArrayList<String> students = new ArrayList<>();
		students.add("팽수"); // .add() 요소 추가
		students.add("길동");
		students.add("동길");
		
		System.out.println(students);
		System.out.println(students.get(1)); // .get(index) -> 데이터 접근
		students.set(1,  "팽순");  			 // .set(인덱스, 변경값) -> 수정
		System.out.println(students.size()); // 리스트 요소 수
		System.out.println(students.isEmpty()); // 리스트가 비어있는지(T/F)
		students.remove("동길"); // 해당값이 있으면 삭제, 없으면 아무 일도 일어나지 않음
		students.clear(); // 리스트 비우기
		System.out.println(students);
		
		students.add("강지석");
		students.add("김도래");
		students.add("김병준");
		students.add("김서영");
		students.add("김소연");
		students.add("김원진");
		students.add("박정단");
		students.add("박종욱");
		students.add("송은호");
		students.add("신미정");
		students.add("이예성");
		students.add("이예은");
		students.add("정지나");
		students.add("최보석");
		students.add("한수정");
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		// 향상된 for문(value만 필요할 때)

		System.out.println("=======================");
		for(String str: students) {
			System.out.println(str);
		}
		
		// 1. 리스트 복사(얕은 복사)
		ArrayList<String> stu = students;
		stu.set(0,  "지석");
		System.out.println(students);
		System.out.println(stu); // 얕은 복사는 주소를 복사(공유)하는 것이기 때문에 둘이 같음
		
		// 2. 깊은 복사(1)
		ArrayList<String> stu2 = new ArrayList<>(students);
		
		// 3. 깊은 복사2
		ArrayList<String> stu3 = new ArrayList<>();
		stu3.addAll(students);
		stu2.set(0, "kang ji suk");
		stu3.set(0, "ki suk");
		System.out.println(students);
		System.out.println(stu2);
		System.out.println(stu3);
		
		// 정렬
		// default 오름차순 숫자 - ABC - abc - 가나다 ~
		Collections.sort(stu3);
		System.out.println(stu3);
		// 내림차순 정렬
		Collections.sort(stu3, Comparator.reverseOrder());
		System.out.println(stu3);
		
		// 선언 & 값 할당
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 11, 190, 90, 1));
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
	}

}
