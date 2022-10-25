package TEST14;

import java.util.Objects;

class T04Simple{
	int x, y;
	T04Simple(int x, int y){
		this.x = x; this.y = y;
	}
	@Override
	public int hashCode() {
		// JAVA 6버전 이상
		return Objects.hash(this.x, this.y);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof T04Simple) {
			T04Simple down = (T04Simple)obj;
			return this.x == down.x && this.y == down.y;
		}
		return false;
	}
	
	
}

public class T04ObjectHashCode {

	public static void main(String[] args) {
		T04Simple obj1 = new T04Simple(10,20);
		T04Simple obj2 = new T04Simple(10,20);
		
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
