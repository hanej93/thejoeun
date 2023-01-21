package day0324Ex.exceptionpractice;

import java.util.Scanner;

public class MakeArithMeticEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 10;

		int y = sc.nextInt();
		try {
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println("\"0\"으로 나눌 수 없습니다.");
		}
			
		
	}

}
