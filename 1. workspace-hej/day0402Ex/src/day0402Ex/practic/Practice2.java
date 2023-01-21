package day0402Ex.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		URL url = null;
		URLConnection conn = null;
		InputStream is = null;
		BufferedReader br = null;

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("회차 입력(숫자)>> ");
			String lottoStr = sc.next();

			System.out.println();
			System.out.println(lottoStr + "회차 당첨 번호");
			System.out.println("---------------------");

			String urlStr = "https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo=" + lottoStr;
			url = new URL(urlStr);

			conn = url.openConnection();

			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is, "euc-kr"));

			String s = null;

			String startFindStr = "<h4><strong>" + lottoStr + "회</strong> 당첨결과</h4>";
			int startLine = 0;

			while ((s = br.readLine()) != null) {
				startLine++;
				if ((s.indexOf(startFindStr)) != -1) {
					break;
				}
			}

			for (int i = 0; i < 5; i++) {
				s = br.readLine();
				startLine++;
			}

			String startStr = "\">";
			String endStr = "</span>";
			String[] lottoNum = new String[6];
			for (int i = 0; i < 6; i++) {
				s = br.readLine();
				lottoNum[i] = s.substring(s.indexOf(startStr) + startStr.length(), s.indexOf(endStr));
				System.out.println("당첨번호 " + (i + 1) + "번째 : " + lottoNum[i] + "\n");
			}

			for (int i = 0; i < 4; i++) {
				s = br.readLine();
			}

			startStr = "\">";
			endStr = "</span>";
			s = br.readLine();
			String bonus = s.substring(s.indexOf(startStr) + startStr.length(), s.indexOf(endStr));
			System.out.println("보너스: " + bonus);

//			CompareLotto cl = new CompareLotto(lottoNum, bonus);
//			lottoNum = cl.getLottoNum();
//			for (int i = 0; i < lottoNum.length; i++) {
//				System.out.println(lottoNum[i]);
//			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
