package ch12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExMethod {

	public static long detailMillSec(String date) throws ParseException { 
		// throws: 오류 날 수도 있는데 ... 호출한 쪽에서 알아서 하라고 시키기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		
		return temp.getTime();
	}
	
	// 직접 예외처리
	public static long detailMillSec2(String date) { 
		// throws: 오류 날 수도 있는데 ... 알아서 해
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp;
		Long result = 0l;
		try {
			temp = sdf.parse(date);
			result = temp.getTime();
		}catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void PrinterName(String nm) throws BizException {
		// 컴파일, 런타임 오류는 아니지만
		// 우리 엄부에서는 오류로 보는 상황에 대한 예외 처리 방법
		if(nm.length() == 0) {
			throw new BizException("001", "이름에 empty가 들어옴");
		}else if(nm.length() == 1) {
			throw new BizException("002", "외자는 불가!!!");
		}
	}

}
