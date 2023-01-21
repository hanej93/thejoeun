package day0317.Car;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new NormalCar("오빠");
		Car car2 = new AutoCar("아빠");
		
		car1.run();
		System.out.println();
		System.out.println();
		car2.run();
	}

}
