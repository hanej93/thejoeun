package mySpring.ex02;

public class User {
	private String name;
	private int age;
	private FavoriteFoods favoriteFoods;
	
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
	public FavoriteFoods getFavoriteFoods() {
		return favoriteFoods;
	}
	public void setFavoriteFoods(FavoriteFoods favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
	}
	public User() {
		super();
	}
	public User(String name, int age, FavoriteFoods favoriteFoods) {
		super();
		this.name = name;
		this.age = age;
		this.favoriteFoods = favoriteFoods;
	}
	
}
