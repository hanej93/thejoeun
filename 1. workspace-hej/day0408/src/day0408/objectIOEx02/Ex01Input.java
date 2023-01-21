package day0408.objectIOEx02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex01Input {
	public static void main(String[] args) {
		
		// 파일에서 리스트를 읽어와 내용을 출력
		
		File file = new File("src/day0408/objectIOEx02","studentList");
	
		try(ObjectInputStream oIn = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(file)))){
			
			List<Student> stList = (List<Student>) oIn.readObject();
			
			for (Student student : stList) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("학생정보");
				System.out.println("------------");
				System.out.println("이름: " + student.getName() + " , 나이: " +student.getAge());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
}
