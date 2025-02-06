package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Result03 {

	public static void main(String[] args) {
		// Q.01
		ArrayList<Integer> weekLotto = null;
		weekLotto = makeLotto();
		System.out.println("Q.01");
		System.out.println(weekLotto.toString());
		System.out.println();
		
		// Q.02
		String [] numArr = {"11", "25"};
		weekLotto = makeLotto(numArr);
		System.out.println("Q.02");
		System.out.println(weekLotto.toString());
		System.out.println();
		
		// Q.03
		System.out.println("Q.03");
		makeLuckyLotto();
	}
	
	public static ArrayList<Integer> makeLotto(){
		Set<Integer> setLotto = new HashSet<>();
		while(setLotto.size() < 6) {
			// 1 ~ 45 사이의 랜덤값 6개 생성
			int num = (int)((Math.random() * 45) + 1);
			setLotto.add(num);
		}
		
		// 정렬하기
		ArrayList<Integer> lotto = new ArrayList<>(setLotto);
		Collections.sort(lotto);
		
		return lotto;
	}
	
	public static ArrayList<Integer> makeLotto(String [] numArr){
		// 로또 번호를 담을 Set
		Set<Integer> setLotto = new HashSet<>();
		
		// 사용자 입력을 미리 넣어주기
		for(int i = 0; i < numArr.length; i++) {
			//numArr(String) -> Int 변경하기
			setLotto.add(Integer.parseInt(numArr[i]));
		}
		
		while(setLotto.size() < 6) {
			// 1 ~ 45 사이의 랜덤값 6개 생성
			int num = (int)((Math.random() * 45) + 1);
			setLotto.add(num);
		}
		
		// 정렬하기
		ArrayList<Integer> lotto = new ArrayList<>(setLotto);
		Collections.sort(lotto);
		
		return lotto;
	}
	
	public static ArrayList<Integer> makeLuckyLotto(){
		// 로또 번호를 담을 Set
		Set<Integer> setLotto = new HashSet<>();
		
		// 사용자 입력 받을 준비
		Scanner scan = new Scanner(System.in);
		
		// 시작 문구 출력
		System.out.println("===================================");
		System.out.println("행운의 로또 번호 생성기 입니다.");
		System.out.println("입력 값이 있으면 'y', 전체 자동 선택하려면 'n'을 선택하세요 >>>>");
		String userYN = scan.nextLine();
		
		if(userYN.equalsIgnoreCase("y")){
			System.out.println("번호를 한 칸씩 띄워서 입력해주세요(최대 6개)");
			// 사용자의 숫자 입력 담기
			String userNum = scan.nextLine();
			System.out.println("선택하신 번호는 ");
			System.out.println(userNum);
			
			System.out.println("이번주 행운의 번호는 ♥ ");
			String [] userArr = userNum.split(" ");
			System.out.println(makeLotto(userArr));
			System.out.println("GOOD LUCK ♥");
			System.out.println("===================================");
			
		}else if(userYN.equalsIgnoreCase("n")) {
			System.out.println("이번주 행운의 번호는 ♥ ");
			System.out.println(makeLotto());
			System.out.println("GOOD LUCK ♥");
			System.out.println("===================================");
		}
		
		// 정렬하기
		ArrayList<Integer> lotto = new ArrayList<>(setLotto);
		Collections.sort(lotto);
		
		scan.close();
		
		return lotto;
	}

}
