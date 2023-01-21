package spring03.aop.ex02.ex;

import java.util.Random;

public class Gugu {
	public String printGugu() throws Exception {
		Random random = new Random();

		for (int i = 1; i <= 9; i++) {
			int num = random.nextInt(4);

			if (num == 0) {
				throw new Exception();
			}
			System.out.println("5 x " + i + " = " + (i * 5));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return "success";
	}
}
