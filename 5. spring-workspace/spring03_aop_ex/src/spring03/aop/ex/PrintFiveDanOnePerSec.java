package spring03.aop.ex;

public class PrintFiveDanOnePerSec {

	public String printFiveDan() {

		for (int i = 1; i <= 9; i++) {
			System.out.println(" 5 x " + i + " = " + 5 * i);

			try {
				Thread.sleep(1000);
				int error = (int) (Math.random() * 4);
				if (error == 0) {
					throw new ArithmeticException();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		return "success";
	}
}
