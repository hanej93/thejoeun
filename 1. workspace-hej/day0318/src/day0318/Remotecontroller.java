package day0318;

public class Remotecontroller {
	 
	Televison tv;
	public Remotecontroller(Televison tv) {
		this.tv = tv;
	}
	
	public void on() {
		tv.turnOn();
	}
	
	public void off() {
		tv.turnOff();
	}
	
}
