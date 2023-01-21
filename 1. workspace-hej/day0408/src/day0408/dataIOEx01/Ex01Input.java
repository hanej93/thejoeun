package day0408.dataIOEx01;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01Input {
	public static void main(String[] args) {
		File file = new File("src/day0408/dataIOEx01","Ex01Data");
		
		try(DataInputStream din = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(file)))){
			// 실제로 적힌 그 순서로 읽어야 함!
			byte b = din.readByte();
			char c = din.readChar();
			int i = din.readInt();
			double d = din.readDouble();
			String s = din.readUTF();
			
			System.out.println("byte: " + b);
			System.out.println("char: " + c);
			System.out.println("int: " + i);
			System.out.println("double: " + d);
			System.out.println("String: " + s);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
