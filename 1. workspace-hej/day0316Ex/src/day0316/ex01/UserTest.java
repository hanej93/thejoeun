package day0316.ex01;

public class UserTest {

	public static void main(String[] args) {
		User us1 = new User("홍길동", "gogosing", "password", 1000);
		User us2 = new User("춘향", "파이리", "9999", 55555);

		System.out.println(us1);

		System.out.println();
		System.out.println();
		System.out.println(us2);

		System.out.println();
		System.out.println();
		us1.setPoint(2000);
		System.out.println("변경된 포인트: " + us1.getPoint());
	}
	
}
