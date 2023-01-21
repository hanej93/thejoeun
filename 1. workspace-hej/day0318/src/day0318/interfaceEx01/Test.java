package day0318.interfaceEx01;

public class Test {

	public static void main(String[] args) {
		// TV를 켜고 꺼보자

		Televison tv = new Televison();
		tv.turnOn();
		tv.turnOff();

		System.out.println();
		System.out.println();

		Aircon aircon = new Aircon();
		aircon.turnOn();
		aircon.turnOff();

		System.out.println();
		System.out.println();
		System.out.println();

		
		// 서로 다른 자료형이 인터페이스로 묶인다.
		Remotecontroller remocon = new Remotecontroller(tv);
		remocon.on();
		remocon.off();

		System.out.println();
		System.out.println();

		Remotecontroller remocon1 = new Remotecontroller(aircon);
		remocon1.on();
		remocon1.off();
	}

}
