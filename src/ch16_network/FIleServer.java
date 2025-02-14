package ch16_network;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * class Name : FIleServer
 * Author : KIM
 * Created Date : 2025. 2. 14.
 * Version : 1.0
 * Purpose : JAVA 기초
 * Description : socket 통신 file server
 */

public class FIleServer {
	public static void main(String[] args) {
		int port = 5000;
		
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("서버 포트: " + port + "에서 실행중...");
			while(true) {
				System.out.println("클라이언트의 연결을 기다리는 중...");
				Socket socket = server.accept(); // 대기 상태
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				System.out.println("클라이언트와 연결됨");
				// 파일 이름과 크기 읽기
				String fileName = dis.readUTF();
				long fileSize = dis.readLong();
				System.out.println("받는 파일: " + fileName + ", 크기: " + fileSize);
				// 파일 저장
				FileOutputStream fos = new FileOutputStream(fileName);
				byte[] buffer = new byte[4096];
				int read = 0;
				long totalRead = 0;
				int remaining = (int) fileSize;
				while((read = dis.read(buffer, 0, Math.min(buffer.length, remaining))) > 0) {
					totalRead += read;
					remaining -= read;
					System.out.println("파일 수신 중: " + totalRead + "바이트(" + (totalRead * 100 / fileSize) + "%)");
					fos.write(buffer, 0, read);
				}
				System.out.println("파일 수신 완료: " + fileName);
				fos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 수신 중 문제가 발생!" + e.getMessage());
		}
	}
}
