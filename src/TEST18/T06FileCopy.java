package TEST18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class T06FileCopy {
	public static void Main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("c:\\iotest\\댕댕이.jpg");
		OutputStream out = new FileOutputStream("c:\\iotest\\copy댕댕이.jpg");
		
		byte [] buff = new byte[4096];
		
//		while(true) {
//			int cnt=in.read(buff); //buff크기만큼 읽어와서 buff에저장,읽은개수를 리턴
//			if(cnt==-1) {
//				break;
//			}
//			out.write(buff,0,cnt);
//		}
		int cnt=0;
		while((cnt=in.read(buff)) !=-1) {
			out.write(buff,0,cnt);
		}
		

	}

}
