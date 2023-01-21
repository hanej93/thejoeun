package spring.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("protoss")
public class Alien {
	@Value("프로토스")
	private String name;
	@Autowired
	@Qualifier("drinkCola")
	private Drink drink;
	
	public void action() {
		System.out.print(name +"이 ");
		drink.drink();
	}
}
