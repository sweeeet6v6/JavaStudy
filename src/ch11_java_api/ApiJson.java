package ch11_java_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiJson {

	public static void main(String[] args) throws Exception {
		// upbit rest api 코인 종목 리스트를 제공함. get 방식에 json 데이터 형태로
		// json(JavaScript Object Notation)
		// 데이터를 저장하고 교환하는데 사용되는 경량 데이터 형식. 속성 - 값 쌍으로 이루어져 있음
		String coinInfoUrl = "https://api.upbit.com/v1/market/all";

		URL url = new URL(coinInfoUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

		// 요청 방식 설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000); // 5초까지 기다리기
		int resCode = conn.getResponseCode(); // 응답에 따른 요청 코드 리턴(200 정상)
		if (resCode == 200) {
			System.out.println(resCode);
			// 실시간 스트리밍 데이터를 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			// 내용이 없을 때까지 담기
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response);

			// Json 데이터 형태로 읽어서 객체화 하기
			JSONParser parser = new JSONParser();
			JSONArray jsonArr = (JSONArray) parser.parse(response.toString());
			for (Object object : jsonArr) {
				JSONObject obj = (JSONObject) object;
				System.out.println("market: " + obj.get("market"));
				System.out.println("kor: " + obj.get("korean_name"));
			}
		}

	}

}
