package day0317.robot02;

public class RobotTest {

	public static void main(String[] args) {
//		// a
//		// TaekwonV t = new TaekwonV();
//		Robot t = new TaekwonV();
//		t.fight();
//
//		// b
//		// Transformer tr = new Transformer();
//		Robot tr = new Transformer();
//		tr.fight();
//
//		// c
//		Robot g = new Gundam();
//		g.fight();
		
		Game game = new Game(new TaekwonV());
		game.playGame();

	}

}
