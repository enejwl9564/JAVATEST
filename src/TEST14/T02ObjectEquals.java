package TEST14;

class T02Simple{
	int n;
	T02Simple(int n){
		this.n = n;
	}
	@Override
	public boolean equals(Object obj) {	//Object obj = ob2; 업캐스팅
		if(obj instanceof T02Simple) {		//받은 객체가 T02Simple 클래스형이 맞는지 확인 
			T02Simple down = (T02Simple)obj;	//다운캐스팅
			return this.n == down.n;
		}
		return false;
	}
	
	
}

public class T02ObjectEquals {

	public static void main(String[] args) {
		T02Simple ob1 = new T02Simple(10);
		T02Simple ob2 = new T02Simple(10);
		T02Simple ob3 = new T02Simple(13);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob1.equals(ob2));	//기준 : ob1 대상 : ob2
		System.out.println(ob1.equals(ob3));
		
		//String
		String str1 = new String("Hello World");
		String str2 = new String("Hello World");
		System.out.println(str1.toString());		//String 클래스는 toString() 재정의됨
		System.out.printf("%x",System.identityHashCode(str1));
		System.out.println(str1.equals(str2));		//String 클랫는 equals() 재정의

	}

}
