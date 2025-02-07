package ch10_extends_interface.ramen;

/*
 * class Name : Ramen
 * Author : KIM
 * Created Date : 2025. 2. 7.
 * Version : 1.0
 * Purpose : [java 기초]
 * Description : 추상 클래스, 추상 메소드 사용법
 */

// abstract 추상 클래스(미완성 클래스로 자체적으로 객체 생성이 불가함)
public abstract class Ramen {
	
	String name;
	int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// 추상 메소드(input, output, name 정의)
	public abstract void printRecipe(); // {}가 없음(로직을 만들지 않은)
	
}
