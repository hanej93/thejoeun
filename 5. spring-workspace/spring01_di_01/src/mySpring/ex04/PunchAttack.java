package mySpring.ex04;

import org.springframework.stereotype.Component;

@Component
public class PunchAttack implements Attack{

	@Override
	public void attack() {
		System.out.println("펀치공격!!");
		
	}
	

}
