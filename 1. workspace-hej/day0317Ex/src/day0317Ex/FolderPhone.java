package day0317Ex;

public class FolderPhone extends Phone {

	
	private String number;

	public FolderPhone(String owner, String target) {
		this.owner = owner;
		this.target = target;
	}

	@Override
	public void call() {
		System.out.println(owner + "가 " + target + "에게 문자를 보냅니다.");
	}

	public String getNumber(String number) {
		return number;
	}

	public void saveNumber(String number) {
		this.number = number;
		System.out.println(this.number + "를 전화번호부에 저장했습니다.");
	}

}
