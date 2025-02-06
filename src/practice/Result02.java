package practice;

import java.util.Random;
import java.util.Scanner;

public class Result02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInt;
		// 난수 생성
		Random random = new Random();
		int randomInt = random.nextInt(50) + 1;
		
		System.out.println(randomInt);
		
		for(int i = 5; i > 0; i--) {
			// 입력 받기
			System.out.print("숫자를 입력해주세요: ");
			userInt = Integer.parseInt(scan.nextLine());
			
			if(userInt == randomInt) { // 정답인 경우
				System.out.println("정답입니다.");
				break;				
			}
			
			if((i - 1) == 0) { // 기회 소진 -> 실패
				System.out.println("실패하였습니다. 정답은" + randomInt + "입니다.");
				break;
			}
			
			if(userInt > randomInt) {
				System.out.println("다운!! 기회가 " + (i - 1) + "번 남았습니다.");
			}else if(userInt < randomInt) {
				System.out.println("업!! 기회가 " + (i - 1) + "번 남았습니다.");
			}
			
		}
		
		scan.close();

	}

}
