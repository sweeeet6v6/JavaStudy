package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// 행운의 로또 생성기 만들기
		// 1. 사용자에게 수량을 입력 받아서 해당 수량만큼 로또 번호를 만들기
		// input: int(수량)
		// output: ArrayList<Set<Integer>> (로또번호)

		System.out.println("===== ♣ 행운의 로또 번호 생성기 ♣ =====");
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개를 생성하시겠습니까?");
		System.out.println(">>>>");
		
		int cnt = Integer.parseInt(scan.nextLine());
		
		ArrayList<Set<Integer>> result = happyLotto(cnt);
		for(Set<Integer> sets : result) {
			ArrayList<Integer> lotto = new ArrayList<>(sets);
			Collections.sort(lotto);
			System.out.println(lotto);
		}
		
		scan.close();
		
	}
	
	public static Set<Integer> makeLotto(){
		Set<Integer> lotto = new HashSet<>();
		// 1 ~ 45 사이의 핸덤값 6개 생성
		while(lotto.size() < 6) {
			int num = (int)((Math.random() * 45) + 1);
			lotto.add(num);
		}
	
		return lotto;
	}
	
	public static ArrayList<Set<Integer>> happyLotto(int num){
		ArrayList<Set<Integer>> result =  new ArrayList<>();
		
		// 수량 만큼 로또 번호 넣기
		for(int i = 0; i < num; i++) {
			result.add(makeLotto());
		}
		
		return result;
	}

}
