package day0318.interfaceEx01;

public class Televison implements RemoteInterface {

	// TV를 켜는 기능
	@Override
	public void turnOn() {
		// TV를 켜기 위한 로직이 수행됨
		System.out.println("티비를 어쩌구저쩌구 해서 켠다.");
	}

	// TV를 끄는 기능
	@Override
	public void turnOff() {
		System.out.println("티비를 끈다.");
	}

}
