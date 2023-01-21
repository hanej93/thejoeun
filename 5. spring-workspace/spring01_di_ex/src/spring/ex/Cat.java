package spring.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
	
	private String name;
	private Drink drink;
	
	public void action() {
		System.out.print(name +"이 ");
		drink.drink();
	}
	
	@Value("냥냥")
	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	@Qualifier("drinkJuice")
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	
	
}
