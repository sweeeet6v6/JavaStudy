package ch16_network;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/*
 * class Name : FileClient
 * Author : KIM
 * Created Date : 2025. 2. 14.
 * Version : 1.0
 * Purpose : JAVA 기초
 * Description : 소켓 통신(파일 전송)
 */

public class FileClient {

	public static void main(String[] args) {
		String host = "192.168.0.26";
		int port = 5000;
		String filePath = "C:\\tools\\soyeon.zip";
		
		try {
			Socket socket = new Socket(host, port);
			System.out.println("서버에 연결됨");
			// 파일 전송을 위한 출력 스트림
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			FileInputStream fis = new FileInputStream(filePath);
			File file = new File(filePath);
			
			// 우선 파일 이름과 크기 전송
			dos.writeUTF(file.getName());
			dos.writeLong(file.length());
			
			byte[] buffer = new byte[4096]; // 4KB -> 많은 시스템에서 기본적인 메모리 페이지 크기
			int read;						// 너무 크지도 작지도 않은 크기로, 관용적으로 사용된다.
			while((read = fis.read(buffer)) > 0) {
				dos.write(buffer, 0, read);
			}
			
			System.out.println("파일 전송 완료 " + filePath);
			fis.close();
			dos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
