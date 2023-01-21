package day0408Ex.dataIOEx01;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {

		File file = new File("src/day0408Ex/dataIOEx01/Ex01Data");

		try (DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {

			dout.writeUTF("안녕하세용가리");
			dout.writeShort(222);
			dout.writeLong(44444444444L);
			dout.writeInt(333333);
			dout.writeFloat(0.222f);
			dout.writeDouble(3.14564567);
			dout.writeChar('호');
			dout.writeByte(123);
			dout.writeBoolean(true);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
