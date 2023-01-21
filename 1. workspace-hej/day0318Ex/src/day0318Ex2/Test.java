package day0318Ex2;

public class Test {
	public static void main(String[] args) {

		int x = 20, y = 4;

		Sub interSub = new Sub() {
			@Override
			public int sub(int a, int b) {
				return a - b;
			}
		};
		Mul interMul = new Mul() {
			@Override
			public int mul(int a, int b) {
				return a * b;
			}
		};
		Div interDiv = new Div() {
			@Override
			public int div(int a, int b) {
				return a / b;
			}
		};
		System.out.println(interSub.sub(x, y));
		System.out.println(interMul.mul(x, y));
		System.out.println(interDiv.div(x, y));

		System.out.println();
		System.out.println();
		System.out.println();

		Sub lambdaSub = (a, b) -> (a - b);
		System.out.println(lambdaSub.sub(x, y));
		Mul lambdaMul = (a, b) -> (a * b);
		System.out.println(lambdaMul.mul(x, y));
		Div lambdaDiv = (a, b) -> (a / b);
		System.out.println(lambdaDiv.div(x, y));

		/*
		 * ====================================================
		 */

		System.out.println();
		System.out.println();
		System.out.println();

		Gugudan interGugu = new Gugudan() {
			@Override
			public void gugudan(int dan) {
				for (int i = 1; i < 10; i++) {
					System.out.printf("%2d x%2d =%3d\n", dan, i, dan * i);
				}
			}
		};

		interGugu.gugudan(5);

		System.out.println();
		System.out.println();
		System.out.println();
		
		Gugudan lambdaGugu = (dan) -> {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%2d x%2d =%3d\n", dan, i, dan * i);
			}
		};
		
		lambdaGugu.gugudan(7);
		

	}

}
