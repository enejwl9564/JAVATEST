package TEST14;

public class T05StringBuffer {

	public static void main(String[] args) {
//		String str1 = "Hello";
//		String str2 = " World";
//		str1 = str1.concat(str2);
////		str1 = str1 + str2;
//		System.out.println(str1);
//		
//		System.out.println("str1 : " + System.identityHashCode(str1));
//		System.out.println("str2 : " + System.identityHashCode(str2));

		long start = (long)System.currentTimeMillis();
//		System.out.println("start : " + start + "ms");
		String str = "";
		//1.Stromg cpmcat함수나 +연산자를 통한 문자열 덧붙이기
//		for(int i = 0; i < 100000; i++) {
//			str += "H";
//		}
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < 100000; i++) {
			buffer.append("H");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " +(end - start) + "ms");
//		System.out.println(buffer);
	}

}
