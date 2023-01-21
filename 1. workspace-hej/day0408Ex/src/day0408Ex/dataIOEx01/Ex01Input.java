package day0408Ex.dataIOEx01;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01Input {
	
	public static void main(String[] args) {
		File file = new File("src/day0408Ex/dataIOEx01/Ex01Data");
		
		try(DataInputStream din = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(file)))){
			
		
			
			
			System.out.println("UTF: " + din.readUTF());
			System.out.println("short: " + din.readShort());
			System.out.println("long: " + din.readLong());
			System.out.println("int: " + din.readInt());
			System.out.println("float: " + din.readFloat());
			System.out.println("double: " + din.readDouble());
			System.out.println("char: " + din.readChar());
			System.out.println("byte: " + din.readByte());
			System.out.println("boolean: " + din.readBoolean());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
