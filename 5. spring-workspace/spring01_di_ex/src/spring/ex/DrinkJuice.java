package spring.ex;

import org.springframework.stereotype.Component;

@Component
public class DrinkJuice implements Drink{

	@Override
	public void drink() {
		System.out.println("쥬스를 마신다.");
	}

}
