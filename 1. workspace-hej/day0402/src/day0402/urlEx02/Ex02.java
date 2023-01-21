package day0402.urlEx02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {
	public static void main(String[] args) {
		URL url = null;
		URLConnection conn = null;
		InputStream is = null;
		BufferedReader br = null;
		
		try {
			// 동행복권 url // 회차별 당첨번호
			url = new URL("https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=C_A_1_2");
			conn = url.openConnection();
			System.out.println("크기 : " + conn.getContentLength());

			// 문서를 가져와보자
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is,"euc-kr"));

			String s = null;
			String docs = null;
			// . readLine() 한줄씩 읽어드림
			for (int i = 0; i < 26; i++) {
				System.out.println(br.readLine());
			}
			
//			while ((s = br.readLine()) != null) {
//				docs +=s;
//			}
			
//			System.out.println(docs.substring(0, 10000));
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
