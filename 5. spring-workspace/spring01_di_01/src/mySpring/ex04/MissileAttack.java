package mySpring.ex04;

import org.springframework.stereotype.Component;

@Component
public class MissileAttack implements Attack{

	@Override
	public void attack() {
		System.out.println("미사일 공격");
		
	}

}
