package cafe;

import java.util.ArrayList;

public class Cafe {
	
	private String name; // 카페 이름
	private ArrayList<Coffee> menuList; // 메뉴
	
	public Cafe() {
		this.menuList = new ArrayList<>();
	}

	public Cafe(String name) {
		this.name = name;
		this.menuList = new ArrayList<>();
	}

	// 메뉴 추가
	public void addMenu(Coffee menu) {
		menuList.add(menu);
	}
	
	// 메뉴 출력
	public void printMenu() {
		System.out.println("어서오세요! " + name + " 입니다!");
		for(int i = 0; i < menuList.size(); i++) {
			System.out.println((i + 1) + " " + menuList.get(i));			
		}
	}
	
	// 커피 구매 기능
	public void buyCoffee(int inputNum) {
		// 메뉴 선택을 잘못했을 경우
		if(inputNum < 1 || inputNum > menuList.size()) {
			System.out.println("다시 입력해주세요");
			return;
		}
		
		Coffee selectedMenu = menuList.get(inputNum - 1);
		
		// 인덱스는 0부터 시작하므로 1 빼주기
		System.out.println(selectedMenu.getKorBeverage() + "을(를) " + selectedMenu.getPrice() + "원에 구매했습니다.");
		
	}
	
	
}
