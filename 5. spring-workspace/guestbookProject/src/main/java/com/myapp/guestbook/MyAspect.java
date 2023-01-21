package com.myapp.guestbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//공통모듈 , 모든 핵심기능이 수행될 때 핵심기능 시작 전에 파일에 기록을 남기는 기능


@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* com.myapp.guestbook.MessageService.*(..))")
	public void writelog(JoinPoint jp) {
		
		File file = new File("message_log.txt");
		
		try (BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"))) {

			String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " - [" + jp.getSignature().getName() + "()]\n";
			bw.write(str);
			bw.flush();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	//파일명 message_log.txt
	//로그형식 : 예 ) " 2021-05-26 10:10:10 - [getMessage()]"
}
