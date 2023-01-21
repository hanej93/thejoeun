package day0318Ex;

public class Test {

	public static void main(String[] args) {

		Commander cm1 = new Commander(new Pikachu());
		Commander cm2 = new Commander(new Pairi());
		
		CommanderInterface cmd1 = new Pikachu();
		CommanderInterface cmd2 = new Pairi();
		cmd1.attack();
		cmd1.avoid();
		
		cmd2.attack();
		cmd2.avoid();
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("클래스 이용하여 사용");
		System.out.println("--------------------------");
		
		System.out.println("나와라 피카츄~");
		cm1.atk();
		cm1.avd();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("나와라 파이리~");
		cm2.atk();
		cm2.avd();
		
	}

}
