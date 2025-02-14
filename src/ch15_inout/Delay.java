package ch15_inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Delay {

	public static void main(String[] args) {
		// 지각자 작성 프로그램
		Scanner sc = new Scanner(System.in);
		
		// 날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(new Date());
		String filePath = "delay.txt";
		File file = new File(filePath);
		FileOutputStream fos = null; 
		
		try {
			fos = new FileOutputStream(file, true);
			fos.write((currentDate + " 오늘의 지각자--- \n").getBytes());
			while(true) {
				System.out.println("오늘의 지각자를 기록하세요.(exit를 입력하면 종료됨)");
				String msg = sc.nextLine();
				if("exit".equalsIgnoreCase(msg)) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				fos.write((msg + "\n").getBytes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
