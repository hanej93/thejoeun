package day0409HW.multiChat;

import java.io.IOException;

public class ServerTest {
	public static void main(String[] args) {
		Server server;
		try {
			server = new Server(8888);
			server.runServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
