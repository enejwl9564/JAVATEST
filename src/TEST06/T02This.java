package TEST06;

// this
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보를 가져오는데 사용

// 멤버변수 vs 매개변수 구별
// this.name = name;

// 오버로딩된 다른 생성자 호출 가능

class T02Simple{
	int x, y;
	
	T02Simple(){
//		x = 10; y = 10;
		this(10,10);	// T02Simple(int x, int y) 생성자 호출
		System.out.println("디폴트 생성자 호출!");
	}
	T02Simple(int x){
//		this.x = x; y= 10;
		this(x,10);		// T02Simple(int x, int y) 생성자 호출
		System.out.println("int x 생성자 호출!");
	}
	T02Simple(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("int x, int y 생성자 호출");
	}
	
	void setX(int x) {
		this.x = x;
	}
	
	T02Simple getthis() {
		return this;
	}
}

public class T02This {

	public static void main(String[] args) {
		
//		T02Simple ob = new T02Simple();
//		System.out.println(ob);
//		System.out.println(ob.getthis());
		
		T02Simple ob1 = new T02Simple();
//		T02Simple ob2 = new T02Simple();
//		T02Simple ob3 = new T02Simple();
		
	}

}
