package day0407Ex.bufferedEx02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaFileCopyEx01 {

	public static void main(String[] args) {
		File oriFile = new File("../day0407/src/day0407/bufferedEx02/FileCopyEx01.java");
		
		byte[] byteBuf = new byte[1000];
		LocalTime nowTime = LocalTime.now();
		String date= nowTime.format(DateTimeFormatter.ofPattern("mm-ss"));
		
		File newFile = new File("src/day0407/bufferedEx02/Copy" + date+".java");
		newFile = new File("src/day0407/bufferedEx02");
		newFile.mkdirs();
		newFile = new File("src/day0407/bufferedEx02/Copy" + date+".java");
		
		try (FileInputStream fin = new FileInputStream(oriFile);
				BufferedInputStream binput = new BufferedInputStream(fin);
				FileOutputStream fout = new FileOutputStream(newFile);
				BufferedOutputStream boutput = new BufferedOutputStream(fout)) {
			
			
			while(binput.available()>0) {
//				boutput.write(byteBuf, 0, binput.read(byteBuf, 0, byteBuf.length));
				int intTemp = binput.read();
				boutput.write(intTemp);
				System.out.print((char)intTemp);
			}
			
			System.out.println("카피 완료");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
