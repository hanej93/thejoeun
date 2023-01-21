package mySpring.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
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

	// type이 같은 아이가 빈으로 등록되어있으면
	// 해당되는 객체를 주입시켜준다.
	@Autowired
	@Qualifier("missileAttack") //특정 객체를 지정(아이디 - 변수명 -> "클래스의 앞글자를 소문자로 자동으로 변경시켜줌")
	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Transformer [name=" + name + ", attack=" + attack + "]";
	}
	
	
	
}
