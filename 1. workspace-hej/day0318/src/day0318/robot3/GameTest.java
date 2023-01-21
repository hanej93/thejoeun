package day0318.robot3;

public class GameTest {
	public static void main(String[] args) {
		Game gm = new Game();
		
		gm.setRobot(new TaekwonV("태권브이", new MissileAttack(), new FlyingMove()));
		gm.playGame();
		
		gm.setRobot(new Transformer("트랜스포머", new PunchAttack(), new WalkingMove()));
		gm.playGame();
		
	}
	
}
