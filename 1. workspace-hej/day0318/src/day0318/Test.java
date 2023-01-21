package day0318;

public class Test {

	public static void main(String[] args) {
		// TV를 켜고 꺼보자
		
		Televison tv = new Televison();
		tv.turnOn();
		tv.turnOff();
		
		System.out.println();
		System.out.println();
		System.out.println();

		Aircon aircon = new Aircon();
		aircon.turnOn();
		aircon.turnOff();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("리모컨 클래스를 이용하여 TV를 작동");
		Remotecontroller remocon = new Remotecontroller(tv);
		remocon.on();
		remocon.off();
		
		
	}

}
