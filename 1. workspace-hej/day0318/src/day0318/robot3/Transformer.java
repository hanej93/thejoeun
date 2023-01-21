package day0318.robot3;

public class Transformer extends Robot {

	public Transformer(String name, Attackable attack, Movable move) {
		super(name);
		this.attack = attack;
		this.move = move;
	}

}
