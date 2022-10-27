package TEST25;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements Runnable{

	Socket client;
	DataInputStream Din;
	CGUI gui;
	
	public ClientRecvThread(Socket client,CGUI gui) {
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
					gui.area.append("서버와 연결을 종료합니다.\n");
					System.exit(-1);
				}
				gui.area.append("[Server] : " + recv +"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}