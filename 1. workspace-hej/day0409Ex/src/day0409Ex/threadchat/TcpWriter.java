package day0409Ex.threadchat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class TcpWriter extends Thread {

	BufferedWriter bw;

	public TcpWriter(BufferedWriter bw) {
		this.bw = bw;
	}

	@Override
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
//			System.out.print("클라이언트: ");
			while (true) {
				bw.write(sc.nextLine() + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
