package mySpring.ex02;

import java.util.List;

public class FavoriteFoods {
	private List<String> foods;
	
	public FavoriteFoods(List<String> foods) {
		this.foods = foods;
	}
	
	public List<String> getFoods() {
		return foods;
	}
}
