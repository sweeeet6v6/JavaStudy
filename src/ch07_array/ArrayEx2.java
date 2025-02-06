package ch07_array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 월리를 찾아라
		// findWally 문자열에 '월리'가 총 몇 개 있는지 출력
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int cnt = 0;
		
		for(int i = 0; i < findWally.length() - 1; i++) {
			String wally = "월리";
			if(wally.equals(findWally.substring(i, i+2))) {
				cnt ++;
			}
		
			
			
		}
		
		int all = findWally.length();
		int after = findWally.replaceAll("월리", "").length();
		System.out.println(all + " - " + after);
		
		int cnt_2 = (all - after) / 2;
		
		
		System.out.println("월리는 총: " + cnt);
		System.out.println("월리는 총: " + cnt_2);
		
	}

}
