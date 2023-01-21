package day0408Ex.objectIOEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex01Input {

	public static void main(String[] args) {
		File file = new File("src/day0408Ex/objectIOEx01","Car");
		
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
			
			Car c = (Car)ois.readObject();
			System.out.println(c.getName());
			System.out.println(c.getMiles());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
