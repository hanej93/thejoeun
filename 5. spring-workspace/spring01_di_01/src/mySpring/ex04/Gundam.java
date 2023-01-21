package mySpring.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("gundaaaaaaaaaaaaaam")
public class Gundam {
	
	@Value("건담")
	private String name;
	
	@Autowired
	@Qualifier("missileAttack")
	private Attack attack;
	
	public void fight() {
		System.out.print(name +"의 ");
		attack.attack();
	}
}
