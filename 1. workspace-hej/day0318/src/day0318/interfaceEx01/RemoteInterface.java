package day0318.interfaceEx01;

/* 인터페이스!! 
 * : class 대신 interface를 써준다.
 * : 몸체가 없는 메서드만 갖고 있는 아이!
 * 
 * public String name(parameter)
 *  -> 인스턴스변수를가질 수 없으나 상수를 갖을 수 있다.
 *  -> 인터페이스는 모든 메소드는 추상 클래스 ( 1.8까지 )
 *  -> 1.8 이후에는 몸체가 있는 메소드(default)도 가능!
 *  -> 1.9 이후 버전에는 private한 몸체가 있는 메소드도 가능하다!
 *  -> 최신버전 static 메소드도 가능
 */

public interface RemoteInterface {

	// 인터페이스는 상수를 사용가능함
	public static final int REMOTE_NUMBER = 12345;

	// 인터페이스의 추상 메소드는 public 이어야 한다!!
	// public abstract << 생략이 가능!!

	// 켜는 기능
	void turnOn();

	// 끄는 기능
	void turnOff();

}
