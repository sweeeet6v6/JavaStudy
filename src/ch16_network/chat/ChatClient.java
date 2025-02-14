package ch16_network.chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==== sayclub ====");
		System.out.println("입장하려면 닉네임을 입력하세요: ");
		System.out.println(">>");
		String nm = scan.nextLine();
		try {
			Socket soc = new Socket("192.168.0.12", 5000);
			System.out.println("접속 성공!!");
			
			// 데이터 송수신
			SendThread send = new SendThread(soc, nm);
			ReceiveThread receive = new ReceiveThread(soc);
			send.start();
			receive.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
