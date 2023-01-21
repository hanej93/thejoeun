package day0317.abstractEx.ex01;

public abstract class Animal {
	// 추상클래스
	// 실제 내용이 없는 메소드를 갖는 클래스
	// 키워드 : abstract
	// 접근지정자 abstract class 클래스명
	
	protected String name;
	
	public String getName() {
		return name;
	}
	
	public abstract void bark();
	
}
