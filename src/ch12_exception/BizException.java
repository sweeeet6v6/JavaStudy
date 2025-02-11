package ch12_exception;

/*
 * class Name : BizException
 * Author : KIM
 * Created Date : 2025. 2. 11.
 * Version : 1.0
 * Purpose : [JAVA 기초]
 * Description : [사용자 정의 예외처리 클래스]
 */
public class BizException extends Exception {

	private String errCode = "";

	public BizException() {
		
	}
	
	public BizException(String errCode) {
		super();
		this.errCode = errCode;
	}
	
	public BizException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}

	public String getErrCode() {
		return errCode;
	}

	
	
}
