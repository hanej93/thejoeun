package spring03.aop.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyAspect {

	public void beforeTime() {
		System.out.println("비포: " + LocalDateTime.now());
	}

	public void afterTime() {
		System.out.println("애프터: " + LocalDateTime.now());
	}

	public void afterReturnTime(String msg) {
		System.out.println("애프터리턴: " + msg + LocalDateTime.now());
	}

	public void afterThrowTime(Throwable th) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("errorlog.txt"), true))) {

			bw.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss.SSS초")) + ": " + th);
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("예외발생!!");
	}
}
