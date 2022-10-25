package TEST17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T05Map {
	//저장 멤버 MAP
	private static Map<String, Integer> map = new HashMap();
	private static Object value;
	
	public static void Insert(String k, Integer v) {
		
		if(!map.containsKey(k)) {	// key가 map에 없다면
			map.put(k, v);		//key, value 저장
		}else {
			System.out.println("동일한 key가 존재합니다.");
		}
	}
	public static void ShowInfo() {
		//조회
		Set<String> set = map.keySet();//map안의 모든 key를 Set형태로 반환
		for(String key : set) {
			int value = map.get(key);
			System.out.println("Key : "+ key +" Value : "+ value);
		}
	}
	public static void Remove(String key) {
		Integer result= map.remove(key);
		if(result==null) {
			System.out.println("삭제실패..");
		}else {
			System.out.println("삭제성공!!");
		}
	}
	public static void Remove(Integer value) throws Exception{
		// 동일한 value을 가지는 모든 요소를 삭제
		
		Set<String> set = map.keySet();
		for(String key : set) {
			if(value.equals(map.get(key))) {
				boolean result = map.remove(key, value);
				if(result) {
					System.out.println("삭제 성공!!");
					set = map.keySet();
				}else {
					System.out.println("삭제 실패..");
				}
			} 
		}
	}
	
	public static void main(String[] args) {
		
		Insert("aaa",1111);
		Insert("bbb",2222);
		Insert("ccc",3333);
		Insert("ddd",4444);
		Insert("ddd",1234);		//id 중복인 경우 ( 나중 요청된 k:V 저장 )
		Insert("fff",1234);		//pw 중복인 경우 ( 문제없이 저장 )
		
		//개수
		System.out.println("저장 수 : " +map.size());

		//조회
		ShowInfo();
		
		//삭제
		Remove("aaa");
		Remove("abc");
		
		//개수
		System.out.println("저장의 수 : "+map.size());
//		Remove(1234); //Value전달 삭제
	}

}
