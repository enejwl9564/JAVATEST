package TEST22;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class T01Client {

	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("192.168.3.9",5050);
		
		InputStream in = client.getInputStream();
		DataInputStream Din = new DataInputStream(in);
		
		System.out.println("----- 서버 메시지 START -----");
		System.out.print(Din.readUTF()+"\n");
		System.out.println("----- 서버 메시지 END -----");

	}

}
