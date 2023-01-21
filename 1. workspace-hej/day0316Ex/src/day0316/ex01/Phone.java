package day0316.ex01;

public class Phone {
	private String brand;
	private int price;
	private String PhoneName;
	
	public Phone(String brand, int price, String PhoneName) {
		this.brand = brand;
		this.price = price;
		this.PhoneName = PhoneName;
	}
	
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
	public String getPhoneName() {
		return PhoneName;
	}
	public void setPhoneName(String phoneName) {
		PhoneName = phoneName;
	}
}
