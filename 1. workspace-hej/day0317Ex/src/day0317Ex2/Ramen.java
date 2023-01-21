package day0317Ex2;

public abstract class Ramen {
	protected String noodle;
	protected int amountWater;
	protected String[] ingredient;
	protected boolean isEgg = false;
	private int i = 0;

	public void recipe() {

		System.out.println(++i + ". 불을 켠다.");
		System.out.println(++i + ". 물 " + amountWater + "ml를 넣는다.");
		System.out.println(++i + ". 스프를 넣는다.");
		System.out.println(++i + ". " + noodle + "을 넣는다.");
		for (String ingre : ingredient) {
			addIngredient(ingre);
		}
		if (isEgg) {
			System.out.println(++i + ". 계란을 넣는다.");
		}
		System.out.println(++i + ". 불을 끈다.");
	}

	public void addIngredient(String ingre) {
		System.out.println(++i + ". " + ingre + "를 넣는다.");
	}

	public void setEgg(boolean egg) {
		this.isEgg = egg;
	}

}
