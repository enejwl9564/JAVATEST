package TEST11;

class T05Super{
	int num1;

}
class T05Sub extends T05Super{
	int num2; //확장

}

public class T04MethodInfo {

	public static void main(String[] args) {
		//Nocasting - 자료형이 같은 형태일 경우
		T05Super ob1 = new T05Super();
		ob1.num1 = 100;
		T05Sub ob2 = new T05Sub();
		ob2.num1 = 10; ob2.num2 = 20;
		//Upcasting - 상위클래스 참조변수 = 하위객체
		T05Super ob3 = new T05Sub();
		ob3.num1 = 10;	//가능
//		ob3.num2 = 20;	//불가(참조변수가 num2를 못찾음)
		
		//Downcasting - Upcasting로 생성된 객체에서 하위객체의 메소드를 사용하기 위함?
		T05Sub down = (T05Sub)ob3;
		down.num2 = 10;
		
	}

}
