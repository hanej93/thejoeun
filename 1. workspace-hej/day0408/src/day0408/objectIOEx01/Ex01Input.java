package day0408.objectIOEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex01Input {

	public static void main(String[] args) {
		// 좀 전에 만든 빈센조를 가져와보자!
		// 역직렬화해서 가져오자
		
		File file = new File("src/day0408/objectIOEx01","person");
		
		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))
			){
			
			Person p = (Person)oin.readObject();
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getHeight());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
