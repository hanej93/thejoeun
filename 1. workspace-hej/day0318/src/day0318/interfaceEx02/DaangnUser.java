package day0318.interfaceEx02;

/*
 * 클래스의 상속은 단일 상속만 가능하지만
 * 인터페이스는 여러 개를 받아서 구현 가능하다.
*/
public class DaangnUser implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void printInfo() {
		System.out.println("오버라이드해서 정의하기 때문에 인터페이스에 메서드가 겹쳐도 된다.");
	}

	@Override
	public void order() {
		// 디폴트 메소드가 두 인터페이스에 있다면 아래와 같이 사용가능함
		Buy.super.order();
		Sell.super.order();
	}

}
