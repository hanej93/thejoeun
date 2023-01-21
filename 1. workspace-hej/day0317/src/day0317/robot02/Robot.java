package day0317.robot02;

public abstract class Robot {
	
	protected String name;
	
	//fight라는 기능을 구현하는데 구체적 내용이 아직 정해지지 않아서 추상으로 만듦
	public void fight() {
		System.out.println(name + "가 전투를 시작합니다.");
		attack();
		move();
		attack();
		System.out.println(name + "가 전투를 종료합니다.");
	}
	
	protected abstract void attack();
	protected abstract void move();

}
