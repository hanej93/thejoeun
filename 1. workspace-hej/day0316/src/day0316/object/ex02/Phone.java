package day0316.object.ex02;

public class Phone {
	private String brand;
	private int price;
	
	// 생성자
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	// 필드값을 반환하는 메소드
	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "브랜드: " + brand + " \n가격: " + price;
	}

}
