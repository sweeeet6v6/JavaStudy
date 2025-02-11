package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CoinMain {

	public static void main(String[] args) throws IOException, ParseException {
		Date dateToday = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Scanner scan = new Scanner(System.in);
		System.out.println("========== 코인 정보 시스텝입니다. ==========");
		// 1. 코인 종목코드 출력(한 줄에 5~7개 정도 출력하기)
		allCoinInfo();

		while (true) {
			System.out.println("\n어떤 종목을 보여드릴까요?(종료:q)");
			String msg = scan.nextLine();
			if (msg.equalsIgnoreCase("q")) {
				System.out.println("========== 종료 ==========");
				break;
			} else {
				System.out.println(sdf.format(dateToday) + " 현재");
				coinPriceInfo(msg);

			}
			// 2. 해당 코인의 최저가(low), 최고가(high), 현재가(trade) 출력
		}
	}

	// 코인 가격을 불러오는 함수
	// input: 코인 코드 - output: 최저가, 최고가, 현재가
	public static void coinPriceInfo(String coinCode) throws IOException, ParseException {
		String coinInfoUrl = "https://api.upbit.com/v1/ticker?markets=" + coinCode;

		URL url = new URL(coinInfoUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

		// 요청 방식 설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000); // 5초까지 기다리기
		int resCode = conn.getResponseCode(); // 응답에 따른 요청 코드 리턴(200 정상)
		if (resCode == 200) {
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			// 내용이 없을 때까지 담기
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			DecimalFormat format = new DecimalFormat("#,###.##");

			// Json 데이터 형태로 읽어서 객체화 하기
			JSONParser parser = new JSONParser();
			JSONArray jsonArr = (JSONArray) parser.parse(response.toString());
			for (Object object : jsonArr) {
				JSONObject obj = (JSONObject) object;
				System.out.println("현재가(trade): " + format.format(obj.get("trade_price")) + "원");
				System.out.println("최저가(low): " + format.format(obj.get("low_price")) + "원");
				System.out.println("최고가(high): " + format.format(obj.get("high_price")) + "원");
			}
		}

	}

	// 코인 종목을 보여주는 함수...
	// input: coin(코인코드) - output: JSONObject(해당 코인 현재 정보)
	public static void allCoinInfo() throws IOException, ParseException {
		String coinInfoUrl = "https://api.upbit.com/v1/market/all";

		URL url = new URL(coinInfoUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

		// 요청 방식 설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000); // 5초까지 기다리기
		int resCode = conn.getResponseCode(); // 응답에 따른 요청 코드 리턴(200 정상)
		if (resCode == 200) {
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			// 내용이 없을 때까지 담기
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
//			System.out.println(response);

			// Json 데이터 형태로 읽어서 객체화 하기
			JSONParser parser = new JSONParser();
			JSONArray jsonArr = (JSONArray) parser.parse(response.toString());
//			for (Object object : jsonArr) {
//			JSONObject obj = (JSONObject) object;
//				System.out.println(obj.get("korean_name")+" : "+obj.get("market"));
//			}
		}

	}
}