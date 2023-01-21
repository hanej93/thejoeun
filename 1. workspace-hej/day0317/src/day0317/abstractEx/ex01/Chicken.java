package day0317.abstractEx.ex01;

public class Chicken extends Animal {

	public Chicken() {
		name = "깐부";
	}

	@Override
	public void bark() {
		System.out.println(name + "는 꼬꼬댁 하며 웁니다.");
	}

	public boolean isFried() {
		return false;
	}
}
