package day0317.robot02;

public class Game {
	private Robot robot;
	
	public Game(Robot robot) {
		this.robot = robot;
	}
	
	public void playGame() {
		robot.fight();
	}
	
	
}
