package spring03.aop.ssy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GugudanAspect {
	
	// hh 오후 11시 -> 11
	// HH 오후 11시 -> 23
//	2021-06-01T23:34:20:333
//   "yyyy-MM-ddTHH:mm:ss:SSS"
	public void beforeTime() {
		System.out.println("메서드 시작: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
	}
	public void afterTime() {
		System.out.println("메서드 종료: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
	}
	
	public void afterTimeReturn(String msg) {
		System.out.println("메서드 성공: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
		System.out.println(msg); // 에러없이 성공적으로 수행하면 success라고 출력됨 성공하면
	}
	
	public void afterTimeThrowing(Throwable th) {
		File file = new File("error.txt");
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))) {
			
			System.out.println("에러발생!!");
			bf.write(th + "Error: " 
				+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH시 mm분 ss초 : SSS")));
			bf.newLine();
			bf.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//파일로 기록하도록 구현.
		//기록 내용 (예외 명 - 발생시간)
		System.out.println(th);
	}
}
