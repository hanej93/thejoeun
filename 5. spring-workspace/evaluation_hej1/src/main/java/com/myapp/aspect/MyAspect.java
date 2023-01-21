package com.myapp.aspect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	// 핵심 모듈 시작전에 파일에 기록을 남기는 기능
	//@Around("execution(public String com.myapp.message.MessageService.*)") -> 참조
	@Before("execution(* com.myapp.message.MessageService.*(..))")
	public void writelog(JoinPoint jp) {
		File file = new File("message_log.txt");
		try (BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"))) {

			String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " - [" + jp.getSignature().getName() + "()]\n";
			System.out.println("에스펙트 실행 확인: " + str);

			bw.write(str);
			bw.flush();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Before(value = "execution(public void *.addMessage(..))")
//	public void beforeSomething() {
//		System.out.println("비포 에스펙트 확인");
//	}
	
	
}
