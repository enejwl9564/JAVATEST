package TEST6;

//접근 한정자
//public	: 모든 클래스에서 접근 가능
//default	: 동일 패키지에 속한 클래스에서만 접근가능
//private	: 현재 클래스에서만 접근 가능
//protected : 동일 패키지에 속한 클래스 or 상속관계에서 하위클래스에서만 접근가능

class T01Person{
	//속성
	public String name;
	private String id;
	private int age;
	private float weight;
	private double height;
	private int salary;
	
	//생성자
	public T01Person(String name, String id, int age, float weight, double height, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	//Setter 함수 지정
	public void setId(String id) {
		this.id = id;
	}
	
	//Getter 함수 지정
	public String getId() {
		return id;
	}
	
	
}

public class T01InfoHide {

	public static void main(String[] args) {
		
		T01Person hong = new T01Person("홍길동","1111-1111",44,70.2f,177.5,5000);
		hong.name = "남길동";
		hong.setId("2222-2222");
		System.out.println("ID : "+ hong.getId());

	}

}
