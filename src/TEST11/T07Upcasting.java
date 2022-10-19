package TEST11;

class T07Super{
	int num1;
	public void sound() {
		System.out.println("Super's Sound1()");
		}
}
class T07Sub extends T07Super{
	int num2; //확장
	public void move() {	// 확장
		System.out.println("Sub1 move1()");
		}
	public void sound() {	// 재정의
		System.out.println("Sub's Sound1()");
		}
}

public class T07Upcasting {

	public static void main(String[] args) {
		
		T07Super ob = new T07Sub();	//확장된 num2에 접근가능?
									//확장된 move()를 사용할 수 있는지?
									//재정의된 sound()를 사용할 수 있는지?
		ob.num1 = 10;
		ob.sound();

	}

}
