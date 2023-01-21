package day0406.fileEx01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		// ���Ͽ� �������ؼ� �ʿ��� ����
		FileOutputStream fout = null;
		
		try {
			// new FileOutputStream("������ �ϴ� ��� ���� �ּ� or ���� ��ü");
			// ���� �ּҴ� ��� �ּ� �Ǵ� ���� �ּҷ� �־��� �� �ִ�.
			// ����δ� ���� ������Ʈ�� �������� �ϴ±���~
			
//			fout = new FileOutputStream("../../test1.txt");
			// -> ������ ������ ������� FileNotFoundException�� ó������
		
			// ���� ���
			fout = new FileOutputStream("C:/Users/tjoeun/new_test.txt");
			
			
			// outputStream��ü.write(�� ������);
			fout.write(65);
			System.out.println("�ۼ� �Ϸ�!");
			
			Thread.sleep(100000);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					// �ݵ�� �ݾ��ִ� �ڵ带 ����Ѵ�.
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
