package day0408Ex.objectIOEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01Output {

	public static void main(String[] args) {
		
		Car c = new Car("오빠차", 1000);
		
		File file = new File("src/day0408Ex/objectIOEx01", "Car");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))){
			
			oos.writeObject(c);
			System.out.println("객체 파일에 복사 완료");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
