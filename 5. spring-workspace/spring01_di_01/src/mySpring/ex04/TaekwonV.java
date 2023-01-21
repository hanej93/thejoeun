package mySpring.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// @스프링에 bean으로 등록하기 위한 어노테이션

// @Component -> TaekwonV taekwonv = new TaekwonV(name,attack);

@Component
public class TaekwonV {
	private String name;
	private Attack attack;
	
	 
	public TaekwonV(
			@Value("태권브이") String name,
			@Autowired @Qualifier("punchAttack") Attack attack) {
		this.name = name;
		this.attack = attack;
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
