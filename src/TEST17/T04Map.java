package TEST17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T04Map {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap();
		map.put("aaa",1111);
		map.put("bbb",2222);
		map.put("ccc",3333);
		map.put("ddd",4444);
		map.put("ddd",1234);		//id 중복인 경우 ( 나중 요청된 k:V 저장 )
		map.put("fff",1234);		//pw 중복인 경우 ( 문제없이 저장 )
		
		//개수
		System.out.println("저장 수 : " +map.size());

		//조회
		Set<String> set = map.keySet();//map안의 모든 key를 Set형태로 반환
		for(String key : set) {
			int value = map.get(key);
			System.out.println("Key : "+ key +" Value : "+ value);
		}
	}

}
