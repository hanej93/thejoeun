package day0408.objectIOEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01OutPut {
	public static void main(String[] args) {
		Person p = new Person("빈센조", 40);
		
		
		File file = new File("src/day0408/objectIOEx01","person");
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))){
			
			oos.writeObject(p);
			System.out.println("객체를 파일에 작성했음");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
