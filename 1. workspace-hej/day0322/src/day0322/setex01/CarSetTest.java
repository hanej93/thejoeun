package day0322.setex01;

import java.util.HashSet;
import java.util.Set;

public class CarSetTest {

	public static void main(String[] args) {
		
		Set<Car> carSet = new HashSet<Car>();
		
		carSet.add(new Car("영선카", 100));
		carSet.add(new Car("진출카", 90));
		carSet.add(new Car("명주카", 80));
		
		System.out.println(carSet);

		System.out.println();
		System.out.println();
		System.out.println();
		
		carSet.add(new Car("영선카", 100));
		
		System.out.println(carSet);

		System.out.println();
		System.out.println();
		System.out.println();
		
		Car c = new Car("의진", 100);
		Car c1 = new Car("의진", 100);
		System.out.println(c);
		System.out.println(c1);
		
		c.equals(c1);
		if( c == c1) {
			System.out.println("두 객체는 같다.");
		}
		
		String str1 = new String("하이");
		String str2 = new String("하이");
		if( str1 == str2) {
			System.out.println("참인가?");  // 거짓
		}
		if( str1.equals(str2)) {
			System.out.println("이퀄즈는 참인가?"); // 참
		}
		
	}

}
