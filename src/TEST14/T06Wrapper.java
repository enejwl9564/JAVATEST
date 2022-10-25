package TEST14;

import java.util.ArrayList;
import java.util.List;

//기본자료형을 객체형으로 바꿔줄때 사용함

public class T06Wrapper {

	public static void main(String[] args) {
		//Boxing(자료 -> Integer 정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		//UnBoxing(Integer자료 -> 일반자료형)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//자동 Boxing
		Integer obj = 100;
		int n1 = obj + 10;
		System.out.println(n1);
		
		List<Integer> list = new ArrayList();

	}

}
