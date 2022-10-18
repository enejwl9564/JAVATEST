package TEST05;

class T02Person{
	String name, addr;
	int age;
}

public class T02PersonMain {

	public static void main(String[] args) {
		
		T02Person hong = new T02Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.addr = "대구대구대구";
		
		System.out.printf("%s %d %s\n",hong.name, hong.age, hong.addr);
		
	}

}
