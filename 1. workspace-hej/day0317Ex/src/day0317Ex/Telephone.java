package day0317Ex;

public class Telephone extends Phone {
	
	
	public Telephone(String owner, String target) {
		this.owner = owner;
		this.target = target;
	}
	
	
	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public void call() {
		System.out.println(owner + "가 " + target + "에게 전화를 겁니다.");
	}
	
	public void hit() {
		System.out.println(owner + "이 " + target + "을 수화기로 가격했습니다.");
	}

}
