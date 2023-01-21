package day0316.object.ex02;

public class Person {
	private String name;
	private int age;

	// has - a 관계
	// -> 다른 클래스를 필드로 갖고 있는 관계
	private Phone phone;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	
	
	
}
