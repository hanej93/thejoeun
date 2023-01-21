package spring03.aop.ex02;

// 핵심 기능을 갖는 클래스
public class Girl {
	
	public String doSomething() {
		//System.out.println("문을 열고 집에서 들어간다.");
		System.out.println("집에서 티비를 본다."); // 핵심
		//System.out.println("문을 닫고 집을 나온다.");
		
		
		
		 
		// 1/2 확률로 예외를 발생시키기 위함 -> 예외테스트 목적
		int num = (int)(Math.random()*2); // 0, 1이 약 50% 
		if(num == 0) {
			throw new ArithmeticException();
		}
		
		return "I am a Girl";
		
	}
}
