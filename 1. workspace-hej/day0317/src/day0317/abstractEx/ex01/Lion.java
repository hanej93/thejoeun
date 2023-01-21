package day0317.abstractEx.ex01;

public class Lion extends Animal {
	// abstract 클래스를 상속받으면, 빨간색 줄이 나옴
	// 추상 클래스르 상속받은 클래스는 반드시 추상 메소드를 구현해야 한다.
	// 또는 자기 자신이 추상 클래스가 되면 된다.
	// The type Lion must implement the inherited abstract method Animal.bark()
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void bark() {
		System.out.println("어흥!!");
	}

}
