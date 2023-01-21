package spring03.aop.ex02;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void beforeDoSomething() {
		System.out.println("문을 열고 집에서 들어간다.");
	}
	
	public void afterDoSomething() {
		System.out.println("문을 닫고 집을 나온다.");
	}
	
	public String afterReturn(String msg) {
		System.out.println("리턴은 언제발생하는가??");
		return "애프터 리턴:" +msg;
	}
	
	public String afterThrowing(Throwable th) {
		System.out.println("집이 터졌슈!!");
		return "예외 발생";
	}
	
	// 핵심기능을 감싸서 실행함
	public String myAround(ProceedingJoinPoint jp) {
		
		//핵심기능의 실행하려던 메서드
		try {
			
			// 비포
			System.out.println("앞에다 쓰면 비포");
		
			// 핵심 사항
			String result = (String)jp.proceed();
			
			// 애프터
			System.out.println("뒤에다 쓰면 에프터");
			
			// 애프터-리턴
			System.out.println("joinPoint procced() 결과: " + result);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 애프터-쓰로우
			System.out.println("익셉션에 쓰면 애프터쓰로우");
		}
		
		return "test";
	}
	
}
