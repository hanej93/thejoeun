package spring03.aop.ex03.annotation;

import org.springframework.stereotype.Component;

//핵심 기능을 갖는 클래스
@Component
public class Boy {
	public String doSomething() {
		// System.out.println("문을 열고 집에서 들어간다.");
		System.out.println("집에서 빨래를 한다."); // 핵심
		// System.out.println("문을 닫고 집을 나온다.");

		return "I am a Boy";
	}
}
