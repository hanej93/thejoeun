package day0316.object.ex01;

public class Student {
	private String name;
	
	public void setName(String name) {
		// 자료 검증 가능
		if(!name.equals("바보")) {
			this.name = name;
		}
	}
	public String getName() {
		return name;
	}
}
