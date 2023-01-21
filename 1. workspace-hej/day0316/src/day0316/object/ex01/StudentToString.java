package day0316.object.ex01;

public class StudentToString {

	private String name;

	public void setName(String name) {
		// 자료 검증 가능
		if (!name.equals("바보")) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	// Object를 상속한 상태!!
	// Object에 있는 메소드를 상속할 수 있다.
	@Override
	public String toString() {
		System.out.println("StudentToString 클래스의 toString()");
		return super.toString();
	}

}
