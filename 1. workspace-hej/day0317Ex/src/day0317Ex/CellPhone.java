package day0317Ex;

public class CellPhone extends Phone {

	private String kakaotalkId;

	public CellPhone(String owner, String target) {
		this.owner = owner;
		this.target = target;
	}

	public void setKakaotalkId(String kakaotalkId) {
		this.kakaotalkId = kakaotalkId;
	}
	
	public String getKakaotalkId() {
		return kakaotalkId;
	}
	
	

	@Override
	public void call() {
		System.out.println(owner + "가 " + target + "에게 카톡을 보냅니다.");
	}

	public void sendEmoticon(String emoticon) {
		System.out.println(kakaotalkId + ": " + emoticon);
	}

}
