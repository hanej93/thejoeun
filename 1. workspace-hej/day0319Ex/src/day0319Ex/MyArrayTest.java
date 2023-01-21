package day0319Ex;

public class MyArrayTest {
	public static void main(String[] args) {
		MyArray<Car> myCars = new MyArray<>();
		Car c1 = new Car("아반떼", 20000000);
		myCars.add(c1);

		Car c2 = new Car("아이오닉5", 45000000);
		myCars.add(c2);

		Car c3 = new Car("벤츠s", 500000000);
		myCars.add(c3);

		for (int i = 0; i < myCars.getArrLength(); i++) {
			System.out.println("차종: " + myCars.get(i).getName() + " , 가격:  " + myCars.get(i).getPrice());
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("지워진 차종: " + myCars.pop().getName());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < myCars.getArrLength(); i++) {
			System.out.println("차종: " + myCars.get(i).getName() + " , 가격:  " + myCars.get(i).getPrice());
		}
		
	}

}
