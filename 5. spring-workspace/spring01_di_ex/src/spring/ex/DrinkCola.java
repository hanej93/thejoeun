package spring.ex;

import org.springframework.stereotype.Component;

@Component
public class DrinkCola implements Drink{

	@Override
	public void drink() {
		System.out.println("콜라를 마신다.");
	}

}
