package ch08_collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * class Name : CollectionMap
 * Author : KIM
 * Created Date : 2025. 2. 5.
 * Version : 1.0
 * Purpose : [Java 기초]
 * Description : [Map]
 */

public class CollectionMap {

	public static void main(String[] args) {
		// Map 가장 많이 사용하는 데이터 구조 중 하나
		// Key와 Value 한 쌍인 데이터
		HashMap<String, String> stuMap = new HashMap<>();
		
		// <Key 문자열, Value 문자열>
		stuMap.put("첫째", "길동");
		stuMap.put("둘째", "동길");
		stuMap.put("셋째", "길수");
		System.out.println(stuMap);
		System.out.println(stuMap.get("둘째")); // Key로 Value 가져오기
		stuMap.put("둘째", "동수"); // 동일 Key면 수정된다. Key -> Unique함
		System.out.println(stuMap.size()); // 순서는 보장하지 않지만 사이즈는 가져옴
		System.out.println(stuMap.containsKey("첫째")); // 해당 Key가 있으면, True 없으면 False
		System.out.println(stuMap.containsValue("동길")); // 해당 Value가 있으면 True, 없으면 False
		
		// Map은 KeySet으로 for문 사용
		Set<String> keys = stuMap.keySet(); // .keySet(); 키 정보만 반환
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(stuMap.get(key));
		}
		
		// entrySet -> for문 사용
		// 위에 건 key만, 이건 한 쌍으로 가져오기
		Set<Entry<String, String>> entrySet = stuMap.entrySet(); 
		for(Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 142872834);
		coinMap.put("이더리움", 3468439);
		
		for(String coin : coinMap.keySet()) {
			System.out.println(coin + ":" + coinMap.get(coin));
		}
		
	}

}
