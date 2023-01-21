package spring03.aop.ssy;


public class Gugudan {
	
	// 2단에서 5단까지 출력하던 것을 5단만 출력되도록 수정하였음
	// 리스트로 리턴하던 것을 Sysout으로 출력하도록 변경
	// 5 1 은 오 5 2는 십 
	// 할 때마다 1 / 4 확률로 에러가 발생   
	
	// [해결해야할 문제]
	// 1. 1초에 하나씩 출력
	
	public String gugudanPrint() {
		for (int i = 1; i <= 9; i++) {
			System.out.println("5 x " + i + " = " + i * 5);
			
			try {
				Thread.sleep(1000); // 1초동안 잠수탄다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			int num = (int) (Math.random() * 4);
			if (num == 0) {
				throw new ArithmeticException();
			}
		}
		return "success";
	}

}
