package day0318.robot3;

public class Game {
	private Robot robot;

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public void playGame() {
		robot.fight();
	}

}
