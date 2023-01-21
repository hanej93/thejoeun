package day0318.interfaceEx02;

public class DaangnTest {
	public static void main(String[] args) {
		DaangnUser user = new DaangnUser();

		// Buy, Sell을 상속했기 때문에
		// user는 반드시 buy와 sell이라는 메서드가 있다는 것을 알 수 있음
		user.buy();
		user.sell();
		user.order();

		Buy b = user;
		b.buy();
		Sell s = user;
		s.sell();

	}
}
