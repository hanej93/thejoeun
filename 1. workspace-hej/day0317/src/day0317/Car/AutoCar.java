package day0317.Car;

public class AutoCar extends Car {

	public AutoCar(String name) {
		super(name);
	}
	
	@Override
	protected void startCar() {
		System.out.println(name+ "의 스타트 버튼으로 시동을 겁니다.");
	}

	@Override
	protected void drive() {
		System.out.println("자율 주행으로 운전을 합니다.");
	}

	@Override
	protected void stop() {
		System.out.println("자동으로 차가 멈춥니다.");
	}

	@Override
	protected void turnOff() {
		System.out.println(name+"의 스타트 버튼으로 시동을 끕니다.");
	}

}
