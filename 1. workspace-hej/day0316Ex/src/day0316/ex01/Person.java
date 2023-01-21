package day0316.ex01;

public class Person {
	private String name;
	private int age;
	private Phone phone;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		String str = "이름: " + getName() + " , 나이: " + getAge() + " \nphone브랜드: " + phone.getBrand()
		+ " , phone가격: " + phone.getPrice() + "원 , phone단말기명: " +phone.getPhoneName();
		return str;
	}
	
	
}
