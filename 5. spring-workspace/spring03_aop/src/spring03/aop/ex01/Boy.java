package spring03.aop.ex01;

//핵심 기능을 갖는 클래스
public class Boy {
	public void doSomething() {
		System.out.println("문을 열고 집에서 들어간다.");
		System.out.println("집에서 빨래를 한다."); // 핵심
		System.out.println("문을 닫고 집을 나온다.");
	}
}
