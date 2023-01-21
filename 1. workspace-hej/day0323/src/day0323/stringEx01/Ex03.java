package day0323.stringEx01;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 글자의 위치를 판단하는 메서드

		String s1 = "I'm groot and I'm groot!";

		// groot의 시작 위치는? 문자열로도 입력가능!

		System.out.println("groot의 시작위치: " + s1.indexOf("groot"));

		// .indexOf("문자열")은
		// 찾는 값이 없다면 -1을 반환한다!

		// 찾는 위치를 지정하는 방식!
		System.out.println("2번째 groot의 위치는? " + s1.indexOf("groot", 5));

		String s2 = "아기 상어 (뚜 루루 뚜루)" + "귀여운 (뚜 루루 뚜루)" + "바닷속 (뚜 루루 뚜루)" + "아기 상어" + "엄마 상어 (뚜 루루 뚜루)"
				+ "어여쁜 (뚜 루루 뚜루)" + "바닷속 (뚜 루루 뚜루)" + "엄마상어" + "아빠 상어 (뚜 루루 뚜루)" + "힘이 센 (뚜 루루 뚜루)" + "바닷속 (뚜 루루 뚜루)"
				+ "아빠상어" + "할머니 상어 (뚜 루루 뚜루)" + "자상한 (뚜 루루 뚜루)" + "바닷속 (뚜 루루 뚜루)";

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// 엄마 상어라는 글자의 위치는?
		// 바닷속 글자의 위치는 어디? 모두 찾으시오.
		int sharkIndex = 0;
		int num = 0;
		String str = "뚜 루루 뚜루";
		while (true) {
			sharkIndex = s2.indexOf(str, sharkIndex);
			System.out.println(++num + "번째 \"" + str + "\" 문자열은 " + sharkIndex + "번째에 있습니다.");
			if (s2.indexOf(str, ++sharkIndex) == -1) {
				break;
			}
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		// 문자열을 특정 기준으로 나누는 메서드
		String s3 = "300,400,500,125,200";
		// 쉼표를 기준으로 나누어 배열에 담는 메서드
		String[] nums = s3.split(",");  //regex -> 정규식
		int stringNumTot = 0;
		for (String string : nums) {
			System.out.println(string);
			stringNumTot += Integer.parseInt(string);
		}
		
		// 전달받은 문자들의 총합은??
		System.out.println("총합은?? " + stringNumTot);
		
		String s4 = "300+400+500";
		String[] num2 = s4.split("\\+");  // +는 정규식이 있는 기호
		for (String string : num2) {
			System.out.println(string);
		}
		
		
		
	}
}
