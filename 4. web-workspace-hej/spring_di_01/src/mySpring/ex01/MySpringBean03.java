package mySpring.ex01;

public class MySpringBean03 {
	private String name;

	@Override
	public String toString() {
		return "MySpringBean03 [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MySpringBean03() {
		super();
	}

	public MySpringBean03(String name) {
		super();
		this.name = name;
	}
}
