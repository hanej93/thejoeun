package day0324.execeptionEx03;

// 사용자 정의 예외는 Exception을 상속받아 만들게 된다.
public class MyException extends Exception {
	
	public MyException(String msg) {
		super(msg);
	}
	
	
}
