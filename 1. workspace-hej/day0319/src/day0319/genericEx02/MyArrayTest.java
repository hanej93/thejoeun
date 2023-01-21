package day0319.genericEx02;

public class MyArrayTest {
	public static void main(String[] args) {

		// 앞에 자료형을 정해줬으면 뒤에 빈칸으로 적어줘도 된다!
		MyArray<Car> myCars = new MyArray<>();
		Car c1 = new Car("아반떼", 20000000);
		myCars.add(c1, 0);

		Car c2 = new Car("아이오닉5", 45000000);
		myCars.add(c2, 5);

		Car c3 = new Car("벤츠s", 500000000);
		myCars.add(c3, 10);
		
	}
}
