package day0318Ex;

public class Commander {

	private CommanderInterface cm;

	public Commander(CommanderInterface cm) {
		this.cm = cm;
	}

	public void atk() {
		cm.attack();
	}

	public void avd() {
		cm.avoid();
	}

}
