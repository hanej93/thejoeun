package mySpring.test02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component -> Phone phone = new Phone();
// @Value("애플") -> phone.setBrand("apple");  -> brand = "apple";
// @Value("100") -> phone.setPrice(100);      -> price = 100;


@Component
public class Phone {
	
	
	
	@Value("애플")
	private String brand;
	
	@Value(value = "100")
	private int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
