package TEST05;

class T10Person{
	//속성( = 필드, 멤버변수)
	String name, addr;
	int age;
	//기능(멤버매서드)
	void setPerson(String x) {
		this.name = x;
		
	}
	void setPerson(String x, int y) {
		this.name = x;
		this.age = y;
		
	}
	void setPerson(String x, int y, String z) {
		this.name = x;
		this.age = y;
		this.addr = z;
		
	}
	void ShowInfo() {
		System.out.printf("이름 : %s 나이 : %d 주소 : %s\n",name,age,addr);
	}
}

public class T10PersonMain {

	public static void main(String[] args) {
		
		T10Person obj = new T10Person();
		obj.setPerson("홍길동");	//멤버변수 name에 "홍길동" 저장
		obj.ShowInfo();
		obj.setPerson("서길동",10); // 멤버변수 name, age에 각각 저장
		obj.ShowInfo();
		obj.setPerson("강호동",55,"서울"); // 멤버변수 name, age, addr에 각각 저장
		obj.ShowInfo();
	}

}
