package day0323.stringEx01;

public class Ex04 {
	public static void main(String[] args) {
		// 일정 규칙이 있는 문자 추출
		// <div>hello world!</div>
		// <html><span>test</span><div>Im groot</div></html>
		// <html><span>test</span><div>Fire it up!</div></html>
		// <html><section><div>Ready to roll out!</div></section></html>

		String[] sArr = new String[4];

		sArr[0] = "<div>hello world!</div>";
		sArr[1] = "<html><span>test</span><div>Im groot</div></html>";
		sArr[2] = "<html><span>test</span><div>Fire it up!</div></html>";
		sArr[3] = "<html><section><div>Ready to roll out!</div></section></html>";

		// 위 코드에서 <div></div> 사이에 있는 글자를 추출하여 출력하시오!!
		String startStr = "<div>";
		String endStr = "</div>";
		for (int i = 0; i < sArr.length; i++) {
			System.out
					.println(sArr[i].substring(sArr[i].indexOf(startStr) + startStr.length(), sArr[i].indexOf(endStr)));
		}

	}
}
