package day0407Ex.FileEx01;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class CreateCurrentDateFile {
	public static void main(String[] args) {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String year = sdf.format(timestamp);
		sdf = new SimpleDateFormat("MM");
		String month = sdf.format(timestamp);
		sdf = new SimpleDateFormat("dd");
		String day = sdf.format(timestamp);

		File file = new File("day0407Ex/" + year + "/" + month + "/" + day +"/testMyFile");
		
		if(file.exists()) {
			System.out.println("파일 존재!");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
			file = new File("day0407Ex/" + year + "/" + month + "/" + day);
			file.mkdirs();
			file = new File("day0407Ex/" + year + "/" + month + "/" + day +"/testMyFile");
			try {
				file.createNewFile();
				System.out.println("파일을 생성하였습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
