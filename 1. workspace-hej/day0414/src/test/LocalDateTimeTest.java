package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
	public static void main(String[] args) {
//		LocalDateTime day = LocalDateTime.parse("2020-10-09T11:11:11");
		LocalDateTime day = LocalDateTime.parse("2020-10-09 11:11:11",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		
		System.out.println(day);
	}
}
