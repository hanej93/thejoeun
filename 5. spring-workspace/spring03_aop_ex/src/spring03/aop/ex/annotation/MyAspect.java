package spring03.aop.ex.annotation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	
//	@Before("execution(public String *.printFiveDan())")
//	public void beforeTime() {
//		System.out.println("메서드 실행 전: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss SSS")));
//	}
//	
//	@After("execution(public String *.printFiveDan())")
//	public void afterTime() {
//		System.out.println("메서드 실행 후: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss SSS")));
//	}
//	
//	@AfterReturning(pointcut = "execution(public String *.printFiveDan())", returning = "rt")
//	public void afterReturning(String rt) {
//		System.out.println("실행 " + rt + ": " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss SSS")));
//	}
//	
//	@AfterThrowing(pointcut = "execution(public String *.printFiveDan())", throwing = "th")
//	public void afterThrowing(Throwable th) {
//		System.out.println("에러 " + th + ": " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss SSS")));
//	}
	
	@Around("execution(public String *.printFiveDan())")
	public void around(ProceedingJoinPoint jp) {
		
		long startTime = System.currentTimeMillis();
		try {
			jp.proceed();
		} catch (Throwable e) {
			System.out.println(e);
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println((endTime-startTime)/1000.0 +"초");
		}
		
	}
}
