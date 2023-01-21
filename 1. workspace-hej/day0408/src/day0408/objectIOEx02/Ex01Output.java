package day0408.objectIOEx02;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex01Output {
	public static void main(String[] args) {
		// 3명의 학생 객체를 만들어 파일에 써보자

		List<Student> stList = new ArrayList<>();

		stList.add(new Student("정길", 30, 100, 100, 100));
		stList.add(new Student("상준", 29, 90, 90, 90));
		stList.add(new Student("명주", 28, 80, 80, 80));
		
		File file = new File("src/day0408/objectIOEx02","studentList");

		try(ObjectOutputStream oOut = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file)))){
			
			// 리스트를 직렬화해서 파일에 쓴다!
			oOut.writeObject(stList);
			oOut.flush();
			System.out.println("파일 작성 완료!");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
