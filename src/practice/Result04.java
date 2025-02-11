package practice;

import java.util.Scanner;

public class Result04 {

	public static void main(String[] args) {

		// Q.엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터가 이동하는 프로그램을 구현해 봅시다. 
		// ※사용자가 엘리베이터에 탑승하고 층을 입력하면 탑승 중인 엘리베이터가 해당 층으로 이동하도록 만드세요.

		Scanner scan = new Scanner(System.in);

		// 엘리베이터 층 할당(1층 ~ 10층)
		int ev_A = (int) ((Math.random() * 10) + 1);
		int ev_B = (int) ((Math.random() * 10) + 1);

		while (true) {
			System.out.println("========== 엘리베이터 ==========\n");
			System.out.println("승강기 A의 현재 위치: " + ev_A);
			System.out.println("승강기 B의 현재 위치: " + ev_B);
			System.out.print("몇 층에 계시나요?[종료:q 또는 exit]: ");
			String msg = scan.nextLine();
			// 4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit 중 하나를 입력한다.
			if (msg.equalsIgnoreCase("q") || msg.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				int userInput = Integer.parseInt(msg);
				// 1. 사용자의 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
				// 두 승강기 위치 갱신
				int[] newElevators = elevator(ev_A, ev_B, userInput);
				ev_A = newElevators[0]; // 변경된 A의 위치
				ev_B = newElevators[1]; // 변경된 B의 위치
//				elevator(ev_A, ev_B, userInput);
			}
		}

		scan.close();

	} // main

	public static int[] elevator(int ev_A, int ev_B, int user) {
		// 엘리베이터 층
		int evA = ev_A;
		int evB = ev_B;

		// 두 엘리베이터 층과 사용자 입력 층과 비교
		int diffA = Math.abs(evA - user);
		int diffB = Math.abs(evB - user);
		// 3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
		if (diffA < diffB) { // A가 더 가까운 경우
			evA = user;
			System.out.println("엘리베이터 A가 " + user + "층으로 이동하였습니다.\n");
		} else if (diffA > diffB) { // B가 더 가까운 경우
			evB = user;
			System.out.println("엘리베이터 B가 " + user + "층으로 이동하였습니다.\n");
		} else if (diffA == diffB) { // A와 B 위치 차이가 동일한 경우
			// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
			if (evA > evB) { // 위치 차이가 동일하고 A가 위에 있을 때(A가 이동)
				evA = user;
				System.out.println("엘리베이터 A가 " + user + "층으로 이동하였습니다.\n");
			} else if (evA < evB) { // 위치 차이가 동일하고 B가 위에 있을 때(B가 이동)
				evB = user;
				System.out.println("엘리베이터 B가 " + user + "층으로 이동하였습니다.\n");
			} else { // 위치 차이, 층 모두 동일한 경우
				evA = user;
				System.out.println("엘리베이터 A가 " + user + "층으로 이동하였습니다.\n");
			}
		}

		// 이동한 위치(층)를 갱신하기 위해 리턴
		return new int[] { evA, evB };
	} // method

} // class
