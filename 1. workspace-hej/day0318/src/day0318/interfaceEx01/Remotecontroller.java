package day0318.interfaceEx01;

public class Remotecontroller {
	 
	// 인터페이스를 이용해서 구현한다!!
	private RemoteInterface re;
	
	public Remotecontroller(RemoteInterface re) {
		this.re = re;
	}
	
	public void on() {
		re.turnOn();
	}
	
	public void off() {
		re.turnOff();
	}
	
}
