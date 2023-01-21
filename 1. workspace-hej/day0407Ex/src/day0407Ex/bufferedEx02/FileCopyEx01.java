package day0407Ex.bufferedEx02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class FileCopyEx01 {
	public static void main(String[] args) {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd hhmmss");
		String date = sdf.format(timestamp);
		byte[] byteBuf = new byte[1024*8];
		try (FileInputStream fin = new FileInputStream(new File("image/night-view-6061251_1920.jpg"));
				BufferedInputStream binput = new BufferedInputStream(fin);
				FileOutputStream fout = new FileOutputStream("src/day0407Ex/bufferedEx02/copy_" + date + ".jpg");
				BufferedOutputStream boutput = new BufferedOutputStream(fout)) {
			
			long start = System.currentTimeMillis();

			while (binput.available() > 0) {
				boutput.write(byteBuf, 0, binput.read(byteBuf, 0, byteBuf.length));
			}
			long end = System.currentTimeMillis();
			
			boutput.flush();
			System.out.println("성능: " + (end-start));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
