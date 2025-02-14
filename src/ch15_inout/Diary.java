package ch15_inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Diary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("오늘의 기록을 남겨주세요(종료는 q)");
		
		while(true) {
			String message = scan.nextLine();
			if(message.equalsIgnoreCase("q")) {
				System.out.println("종료합니다");
			}
			myDiary(message);
		}
		
	}
	
	// input: String
	// output: void
	// 내용을 입력받아서 해당 날짜의 20250213.txt 파일에 내용이 기록되는 메소드 작성
	// 단 동일한 날짜라면 개행되고 append 되도록, 폴더는 워크스페이스 아래 diary 폴더에, 없다면 생성 
	// myDiary("어쩌고 궁시렁");
	public static void myDiary(String userMessage) {
		String path = System.getProperty("user.dir");
		String basePath = path + "\\Diary"; // 저장하고자 하는 위치
		
		// 1. 폴더가 없다면 생성
		File baseDir = new File(basePath);
		if(!baseDir.exists()) {
			baseDir.mkdir(); // 디렉토리가 없으면 생성
		}
		
		// 파일 만들기
		// 파일명 만들기(날짜)
		// 2. root 경로 + diary + 해당날짜.txt -> File 객체 인스턴스화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String currentDate = sdf.format(new Date());
		File file = new File(basePath + "\\" + currentDate + ".txt");
//		File file = new File(basePath, currentDate + ".txt");
		
		// 3. 사용자 메시지 write(append)
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file, true);
			fos.write((userMessage + "\n").getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 4. 종료
			try { 
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		


	} // method }
} // class }
