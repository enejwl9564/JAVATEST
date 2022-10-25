package TEST18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class T04OutputStream {

	public static void main(String[] args) throws Exception {
		
		OutputStream out = new FileOutputStream("c:\\iotest\\test.exe");
		out.write('a');
		out.write('b');
		out.write('c');
		out.flush();

	}

}
