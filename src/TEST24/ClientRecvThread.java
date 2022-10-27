package TEST24;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements Runnable {

	Socket client;
	DataInputStream Din;
	public ClientRecvThread(Socket client) {
		this.client = client;
	}
	
	public void run() {
		try {
			Din = new DataInputStream(client.getInputStream());
			String recv;
			while(true) {
				recv = Din.readUTF();
				if(recv == null || recv.equals("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(-1);
				}
				System.out.println("\r[Client] : " + recv);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

