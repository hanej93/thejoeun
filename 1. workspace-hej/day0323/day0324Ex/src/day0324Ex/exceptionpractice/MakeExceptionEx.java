package day0324Ex.exceptionpractice;

import java.io.IOException;

public class MakeExceptionEx {

	public void makeArithmeticException() {
		throw new ArithmeticException();
	}

	public void makeIOException() throws IOException {
		throw new IOException();
	}
}
