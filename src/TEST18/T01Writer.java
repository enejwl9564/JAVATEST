package TEST18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class T01Writer {

	public static void main(String[] args) throws IOException {
		
//		Writer out = new FileWriter("c:\\iotest\\test.txt");		//덮어쓰기
		Writer out = new FileWriter("c:\\iotest\\test.txt",true);	//추가하기
		out.write("apple\n");
		out.write("pineapple\n");
		out.write("watermelon\n");
		
		out.flush();	//버퍼 초기화
		out.close(); 	//스트림 제거

	}

}
