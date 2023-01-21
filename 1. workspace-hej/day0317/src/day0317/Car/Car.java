package day0317.Car;

public abstract class Car {

	protected String name;

	public Car(String name) {
		this.name = name;
	}

	protected abstract void startCar();

	protected abstract void drive();

	protected abstract void stop();

	protected abstract void turnOff();

	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
