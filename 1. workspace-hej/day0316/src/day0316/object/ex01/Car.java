package day0316.object.ex01;

public class Car {
	private String brand;
	private int mileage;

	public Car(String brand, int mileage) {
		this.brand = brand;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		String str = "브랜드: " + brand + " , 주행거리: " + mileage;
		return str;
	}
}
