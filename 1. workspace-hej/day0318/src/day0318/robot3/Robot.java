package day0318.robot3;

public class Robot {

	private String name;
	protected Attackable attack;
	protected Movable move;

	public Robot(String name) {
		this.name = name;
	}

	public void fight() {
		System.out.println(name + " 전투를 시작합니다.");
		attack();
		move();
		attack();
		System.out.println(name + " 전투를 종료합니다.");
	}

	public void attack() {
		attack.attack();
	}

	public void move() {
		move.move();
	}

}
