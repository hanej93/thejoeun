package day0319.genericEx02;

public class Car {
	private String name;
	private int price;

	// 생성자(파라미터 두개), getter, setter

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
