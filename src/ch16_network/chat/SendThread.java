package ch16_network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread{
	private Socket soc; // 일대일 
	private String name;
	
	public SendThread(Socket soc, String name) {
		this.soc = soc;
		this.name = name;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			PrintWriter writer = new PrintWriter(soc.getOutputStream());
			// 닉네임 전송
			writer.println(name); // 서버에 보내기
			writer.flush();
			while(true) {
				System.out.println("입력: ");
				String msg = reader.readLine();
				if(msg == null || msg.equals("")) {
					break;
				}
				writer.println(name + ": " + msg);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(soc != null) soc.close();				
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
	}

}
