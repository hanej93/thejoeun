package day0317.robot02;

public class Gundam extends Robot {

	public Gundam() {
		name = "건담이";
	}

	@Override
	protected void attack() {
		System.out.println("펀치로 공격!");
	}

	@Override
	protected void move() {
		System.out.println("걸어서 이동!");
	}

}
