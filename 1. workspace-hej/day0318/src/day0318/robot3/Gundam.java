package day0318.robot3;

public class Gundam extends Robot {

	public Gundam(String name, Attackable attack, Movable move) {
		super(name);
		this.attack = attack;
		this.move = move;
	}

}
