package TEST19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class T08Jsoup {

	public static void main(String[] args) throws Exception {
		
		//URL과 연결된 Jsoup.connection
		Connection conn = Jsoup.connect("https://www.naver.com");
		
		//DOM객체를 꺼내와 저장
		Document document = conn.get();
		
		//DOM객체 안에서 img태그요소만 추출
		Elements elements = document.getElementsByTag("img");
		System.out.println(elements);
		
		for(int i = 0; i < elements.size(); i++) {
				if(elements.get(i).toString().contains("http")) {
					// "공백"을 기준으로 요소안의 내용을 문자열로 바꾼뒤 잘라내기
					String str[] = elements.get(i).toString().split(" ");
					int start = str[1].indexOf("\"");
					int end = str[1].lastIndexOf("\"");
					String imgUrl = str[1].substring(start+ 1,end);
			
//				System.out.println(imgUrl);		//잘라낸거 확인용
			
					//URL연결
					URL url = new URL(imgUrl);
					InputStream in = url.openStream();
					
					BufferedInputStream bin = new BufferedInputStream(in);
					byte [] buff = new byte[4096];
					String filename = "imageFile";
					OutputStream out = new FileOutputStream("c:\\iotest\\"+filename+i+".png");
					int data = 0;
					while(true) {
						data = bin.read();
						if(data == -1) {
							break;
						}
						out.write(buff,0,data);
						out.flush();
					}
				}	
		}

	}

}
