package day0324Ex.exceptionpractice;

import java.util.Scanner;

public class MakeArithMeticEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 10;

		int y = sc.nextInt();
		if (y != 0) {
			System.out.println(x / y);
		}

	}

}
