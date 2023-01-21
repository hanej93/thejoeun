package day0317Ex;

public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phoneArr = new Phone[3];
		
		phoneArr[0] = new Telephone("닭", "치킨");
		phoneArr[1] = new CellPhone("멍멍이", "왈왈이");
		phoneArr[2] = new FolderPhone("야옹이", "냐옹이");
		
		for (int i = 0; i < phoneArr.length; i++) {
			System.out.println(phoneArr[i]);
			phoneArr[i].call();
			System.out.println();
		}
		
		
		Telephone tel = null;
		CellPhone cell = null;
		FolderPhone folder = null;
				
		if(phoneArr[0] instanceof Telephone ) {
			tel = (Telephone)phoneArr[0];
		}
		if(phoneArr[1] instanceof CellPhone ) {
			cell = (CellPhone)phoneArr[1];
		}
		if(phoneArr[2] instanceof FolderPhone ) {
			folder = (FolderPhone)phoneArr[2];
		}
		
		tel.hit();
		cell.setKakaotalkId("나비");
		cell.sendEmoticon("😎");
		folder.saveNumber("111-111-1111");
		
		
		
	}

}
