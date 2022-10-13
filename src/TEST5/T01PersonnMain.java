package TEST5;

public class T01PersonnMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T01Person hong = new T01Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s %d %f %f\n",hong.name, hong.age, hong.height, hong.weight);
	}

}
