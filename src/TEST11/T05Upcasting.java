package TEST11;

class Super{
	int num1;
	public void sound() {
		System.out.println("Sound1()");
		}
}
class Sub extends Super{
	int num2; //확장
	public void move() {
		System.out.println("Sub1 move1()");
		}
	public void sound() {
		System.out.println("Sound1()");
		}
}

public class T05Upcasting {

	public static void main(String[] args) {
		//정상범위
		Super ob1 = new Super();
		Super ob2 = new Super();
		Sub ob3 = new Sub();
		
		//Upcasting(상위클래스 참조변수 = 하위객체)
		Super ob4 = new Sub();

	}

}
