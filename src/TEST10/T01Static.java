package TEST10;

class T01Simple{
	//멤버변수
	static int Num1 = 0;	//공유변수
	int Num2;
	//멤버함수
	void ShowNum() {
		System.out.printf("NUM1 : %d NUM2 : %d\n", Num1,Num2);
	}
}


public class T01Static {

	public static void main(String[] args) {
		
		T01Simple obj1 = new T01Simple();
		T01Simple obj2 = new T01Simple();
		obj1.Num1 = 10;
		obj1.Num2 = 20;
		obj1.ShowNum();
		obj2.ShowNum();
		System.out.println();
		
		T01Simple.Num1 = 1234;
		System.out.println(T01Simple.Num1);
		
		
	}

}
