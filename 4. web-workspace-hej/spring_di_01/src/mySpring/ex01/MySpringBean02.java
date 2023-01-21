package mySpring.ex01;

import java.util.List;

public class MySpringBean02 {
	private List<String> foods;

	@Override
	public String toString() {
		return "MySpringBean02 [foods=" + foods + "]";
	}

	public List<String> getFoods() {
		return foods;
	}

	public void setFoods(List<String> foods) {
		this.foods = foods;
	}

	public MySpringBean02() {
		super();
	}

	public MySpringBean02(List<String> foods) {
		super();
		this.foods = foods;
	}
}
