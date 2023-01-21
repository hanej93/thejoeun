package day0402Ex.practic;

import java.util.Scanner;

public class CompareLotto {
	
	private String[] lottoNum;
	private String bonus;
	private String[] userNum;
	
	public CompareLotto(String[] lottoNum, String bonus) {
		
		this.lottoNum = new String[6];
		this.userNum = new String[6];
		
		for (int i = 0; i < lottoNum.length; i++) {
			this.lottoNum[i] = lottoNum[i];
		}
		this.bonus = bonus;
	}
	
	
	public String[] getLottoNum() {
		return lottoNum;
	}
	
	public int inputAndRun() {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lottoNum.length; i++) {
			userNum[i] = sc.next();
		}
		
		for (int i = 0; i < lottoNum.length; i++) {
			for (int j = i; j < lottoNum.length; j++) {
				
			}
		}
		
		
		return 0;
	}
	
	
}
