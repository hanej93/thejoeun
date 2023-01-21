package day0402Ex.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Practice3 {

	public static void main(String[] args) {
		URL url = null;
		URLConnection conn = null;
		InputStream is = null;
		BufferedReader br = null;

		try {
			url = new URL("https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=C_A_1_2");
			conn = url.openConnection();

			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is, "euc-kr"));

			String s = null;
			String docs = "";
			
			for (int i = 0; i < 10000; i++) {
				s = br.readLine();
				if( i >=3972 && i <= 3977) {
					System.out.println(s);
					docs +=s+"\n";
				}
			}
			System.out.println(docs);
			
			while(true) {
				s = br.readLine();
				if(s == null) {
					break;
				}else {
					docs += s;
				}
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
