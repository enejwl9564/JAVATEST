package TEST17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class T02List {
	
	public static void main(String[] arg) {
		
//		List<String> list = new Vector();
		List<String> list = new LinkedList();
		
		//추가
		list.add("JAVA");			//0
		list.add("JDBC");			//1
		list.add("OracleDB");		//2
		list.add("JSP");			//3
		list.add("Servlet");		//4
		list.add("SpringFrameWork");//5
		
		//확인(저장 수)
		System.out.println("총 개체수 : "+ list.size());
		//조회(요소)
		System.out.println("확인 idx 2 : "+ list.get(2));
		System.out.println("---------------------------");
		//전체 조회
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------");
		List<String> set;
		//조회(간편)
		for(String tmp : set) {
			System.out.println(tmp);
		}
		System.out.println("---------------------------");
		//조회(복잡)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		//삭제
		for(String tmp : list) {
			System.out.println(tmp);
		}
		
	}

}
