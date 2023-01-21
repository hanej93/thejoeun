package day0324.execeptionEx02;


public class ThorwException {
	public static void main(String[] args) {
		// 예외는 오류상황이 발생할 때 생기는 것임
		// 이 예외를 직접 만들 수도 있다.
		
		int x = 1;
		int y = 0;
//		System.out.println(x/y);
		
		// 의도적으로 예외가 발생
		throw new ArithmeticException(); 
//		System.out.println("실행종료");
		
	}
}
