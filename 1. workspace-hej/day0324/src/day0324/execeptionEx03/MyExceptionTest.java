package day0324.execeptionEx03;

public class MyExceptionTest {

	public static void main(String[] args) {
		int num = (int)(Math.random() *2);
		
		
		try {
			if(num == 1) {
				throw new MyException("하하하하하하");
			}
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("종료");
		
	}

}
