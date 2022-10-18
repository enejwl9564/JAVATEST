package TEST10;

class T03Company{
	//멤버변수
	int x,y;
	private static T03Company instance;
	//생성자
	private T03Company() {
		x = 10; y = 20;
	}
	
	//멤버함수
	public static T03Company getInstance() {
		if(instance == null) {
			instance = new T03Company();
		}
		return instance;
	}
}

public class T03SingleTonMain {

	public static void main(String[] args) {
		
		T03Company myCompany1 = T03Company.getInstance();
		T03Company myCompany2 = T03Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
		System.out.println(myCompany1.x);
		System.out.println(myCompany2.y);

	}

}
