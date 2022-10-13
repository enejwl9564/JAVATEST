package TEST5;

//	생성자 Method
//	객체 생성시에 호출되는 특수한 메서드
//	객체 생성시에 1회 호출
//	객체 생성시 필요한 초기값을 부여
//	클래스 내에 생성자 함수가 명시되지(코드삽입x) 않을경우 디폴트 생성자가 자동으로 주입되어서 사용

//	함수 = 메소드(Method)
//	생성자 함수 특징
//	생성자 함수는 클래스 이름과 동일해야 한다.
//	생성자 함수는 반환자료형을 가지지 않는다.

class T13Simple{
	//속성
	int x;		// 0
	double y;	// 0.0
	char z;		// ' '
	boolean b;	// false
	String str;	// null
	
	//디폴트 생성자
	T13Simple(){
		System.out.println("디폴트 생성자 호출!");
	}
	//생성자 함수 오버로딩
	T13Simple(int x){
		this.x = x;
		System.out.println("T13Simple(int) 생성자 호출!");
	}
	T13Simple(int x, double y){
		this.x = x;
		this.y = y;
		System.out.println("T13Simple(int,double) 생성자 호출!");
	}

	@Override
	public String toString() {
		return "T13Simple [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + ", str=" + str + "]";
	}
	
}

public class T13ConstructorMain { // 생성 하다

	public static void main(String[] args) {
		
		T13Simple obj = new T13Simple();		//디폴트 생성자
		System.out.println(obj.toString());
		T13Simple obj2 = new T13Simple(101);	//int받는 생성자
		System.out.println(obj2.toString());
	}

}
