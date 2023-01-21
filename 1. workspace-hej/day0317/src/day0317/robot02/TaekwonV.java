package day0317.robot02;

public class TaekwonV extends Robot {

	public TaekwonV() {
		name = "태권브이";
	}

	public void fight() {
		System.out.println(name + "가 전투를 시작합니다.");
		attack();
		move();
		attack();
		System.out.println(name + "가 전투를 종료합니다.");
	}

	public void attack() {
		System.out.println("펀치 공격!");
	}
	
	public void move() {
		System.out.println("날아서 이동!");
	}
	
	
}
