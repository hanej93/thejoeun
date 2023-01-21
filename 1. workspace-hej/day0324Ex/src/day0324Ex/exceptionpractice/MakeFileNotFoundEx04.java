package day0324Ex.exceptionpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MakeFileNotFoundEx04 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("test.txt")) {
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d 단\n",i);
				System.out.println("--------------------");
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d x %d = %2d\n", i , j, i*j);
				}
				System.out.println();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
