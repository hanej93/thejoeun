package day0317.abstractEx.ex01;

public class Dog extends Animal {

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void bark() {
		System.out.println(name + "는 왈왈!! 하며 웁니다.");
	}
	

}
