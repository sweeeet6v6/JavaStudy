package cafe;

import java.beans.Customizer;
import java.util.ArrayList;

public class Cafe {
	
	private static String name; // 카페 이름
	private static ArrayList<Coffee> menuList = new ArrayList<>(); // 메뉴
	
	public Cafe() {
	}

	public Cafe(String name, ArrayList<Coffee> menuList) {
		this.name = name;
		this.menuList = menuList;
	}
	
	// 메뉴 출력
	private static void printMenu() {
		System.out.println("어서오세요! " + name + " 입니다.");
		for(int i = 0; i < menuList.size(); i++) {
			System.out.println((i + 1) + " " + menuList.get(i));			
		}
	}
	
	// 커피 구매 기능
	private static void buyCoffee(int inputNum) {
		int cutomerChoice;
		
		for(int i = 0; i < menuList.size(); i++) {
			
		}
		
	}
	
	// 메뉴를 추가하는 기능
	
	
}
