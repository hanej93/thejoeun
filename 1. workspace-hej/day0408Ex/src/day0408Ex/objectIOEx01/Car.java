package day0408Ex.objectIOEx01;

import java.io.Serializable;

public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4376226729476830481L;

	private String name;
	private int miles;

	public Car(String name, int miles) {
		super();
		this.name = name;
		this.miles = miles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

}
