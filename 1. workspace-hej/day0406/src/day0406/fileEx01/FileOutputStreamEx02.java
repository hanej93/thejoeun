package day0406.fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx02 {

	public static void main(String[] args) {
		// day0406.fileEx01 ��Ű�� �ȿ� ���� a~z���� �ۼ��� test.txt

		// ������ ���� ���� FileOutputStream ��ü �ʿ�
		// �����ּ� �Ǵ� ���ϰ�ü�� �ʿ�

		// ���ϰ�ü�� ����
		// new File("���� �ּ�");
		File file = new File("src/day0406/fileEx01/test.txt");

		// ���Ͼƿ�ǲ ��Ʈ���� ������ �����Ͽ� ��ü�� ����
		// try-resource ������� ����� �ڵ����� close����

		try (FileOutputStream fout = new FileOutputStream(file)) {

			// ���Ͽ� �����͸� ����.
			// a-z ���� ����
			for (char i = 'a'; i <= 'z'; i++) {
				fout.write(i);
			}
			System.out.println("�ۼ� �Ϸ�!");
			// ���� �ƿ�ǲ ��Ʈ���� �ݴ´�. -> �̹� try-resource ������� �̹� �ݾ������� ó����

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
