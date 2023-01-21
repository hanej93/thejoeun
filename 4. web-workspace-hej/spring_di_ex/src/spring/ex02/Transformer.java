package spring.ex02;

public class Transformer {
	private String name;
	private Attack attack;
	
	public Transformer(String name, Attack attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

	public Transformer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "TaekwonV [name=" + name + ", attack=" + attack + "]";
	}
	
	
	
}
