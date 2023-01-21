package day0324Ex.exceptionpractice;

import java.io.IOException;

public class MakeExceptionTest {

	public static void main(String[] args) {
		
		MakeExceptionEx test = new MakeExceptionEx();
		
		test.makeArithmeticException();
		try {
			test.makeIOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
