package spring.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
	private String name;
	private Drink drink;
	
	
	public Human(
			@Value("인간") String name,
			@Autowired
			@Qualifier("drinkCola")
			Drink drink) {
		this.name = name;
		this.drink = drink;
	}
	
	public void action() {
		System.out.print(name +"이 ");
		drink.drink();
	}
	
}
