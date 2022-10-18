package TEST10;

class T02Simple{
	int n1;
	static int n2;
	
	void Func1() {
		n1 = 10;
		n2 = 20;
		
	}
	static void Func2() {
//		n1 = 10;	//문제발생 - static메서드에서는 기본멤버변수 사용 불가능
		n2 = 20;
		int num = 10;
	}
}


public class T02Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
