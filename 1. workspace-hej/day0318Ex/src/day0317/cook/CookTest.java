package day0317.cook;

public class CookTest {

	public static void main(String[] args) {
		Kimchiggigae kim = new Kimchiggigae("김치찌개", new HalfCut(), new FeelTaste());
		Armyggigae army = new Armyggigae("김치찌개", new QuarteringCut(), new FeelSmell());
		kim.cooking();

		System.out.println();
		System.out.println();
		System.out.println();

		army.cooking();

	}

}
