package day0318.lambdaEx01;

public class Test {

	public static void main(String[] args) {
		Sum mySum = new MySumCalc();
		int result = mySum.sum(10, 5);
		System.out.println("두 수의 합은? " + result);

		// 한 번만 저 기능을 쓸 건데.... 그러면 .. 클래스로 구현하기가 아깝다..
		// 무명 클래스 -> 인터페이스로 객체를 구현하면서 사용

		Sum myInterfaceSum = new Sum() {
			@Override
			public int sum(int n1, int n2) {
				return n1 + n2;
			}
		};
		result = myInterfaceSum.sum(20, 10);
		System.out.println("두 수의 합은? " + result);

		// 람다 표현식(인터페이스 하나에 하나의 메소드만 있을 때만 가능)
//		Sum myLambdaSum = (a, b) -> {return a + b;};
		Sum myLambdaSum = (a, b) -> (a + b);
		result = myLambdaSum.sum(15, 3);
		System.out.println("두 수의 합은? " + result);
		
	}

}
