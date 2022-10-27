package TEST25;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerRecvThread implements Runnable{

	Socket client;
	DataInputStream Din;
	SGUI gui;
	
	public ServerRecvThread(Socket client,SGUI gui) {
		this.client = client;
		this.gui = gui;
	}
	
	@Override
	public void run() {
		try {
			Din = new DataInputStream(client.getInputStream());
			String recv;
			while(true) {
				recv = Din.readUTF();
				if(recv == null || recv.equals("q")) {
					gui.area.append("클라이언트와 연결을 종료합니다.\n");
					System.exit(-1);
				}
				gui.area.append("[Client] : " + recv +"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}