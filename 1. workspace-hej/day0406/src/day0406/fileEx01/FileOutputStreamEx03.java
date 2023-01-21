package day0406.fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamEx03 {
	public static void main(String[] args) {
		// ��? �׷��� �ۼ��ϴ°� ������ byte �����ΰǰ�?
		// �׷��� �ѱ���?
		File file = new File("src/day0406/fileEx01/ex03.txt");
		
		try(FileOutputStream fout = new FileOutputStream(file)){
			
			// �� �� ���� byte ������ �Ѿ�� byte�� ©���� �ȴ�.
//			fout.write(65);  //A
//			fout.write(321); //A
			
			String str = "��";
			byte[] strByteArr = str.getBytes();
			System.out.println(strByteArr.length);
			System.out.println(Arrays.toString(strByteArr));
			fout.write(strByteArr);
			
			
			System.out.println("�ۼ��Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
