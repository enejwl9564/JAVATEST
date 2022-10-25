package TEST14;

public class T03ObjectHashCode {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("----------------------");
		System.out.printf("%x\n", obj1.hashCode());
		System.out.printf("%x\n", obj2.hashCode());
		System.out.println("----------------------");
		System.out.printf("%x\n", System.identityHashCode(obj1));	//해시코드값을 제정의 했을때 실제 해시코드값을 보는 문법
		System.out.printf("%x\n", System.identityHashCode(obj2));

	}

}
