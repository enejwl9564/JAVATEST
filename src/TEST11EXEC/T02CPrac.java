package TEST11EXEC;


class Employee	//직원
{
	String name;
	String age;
	String addr;
	
	public Employee(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
}
class Parttimer extends Employee	//시간제
{
	int hourpay;
	
	Parttimer(String name,String age,String addr,int hourpay) {
		super(name,age,addr);
		this.hourpay = hourpay;
	}
}
class Regular extends Employee	//정규직
{
	int salary;
	
	Regular(String name, String age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}

	
}
public class T02CPrac {

	public static void ShowInfo(Employee emp) {
		//다운캐스팅을 통해서 parttimer or regular를 선별해서
		//모든 정보를 출력해보세요
		if(emp instanceof Parttimer) {
			Parttimer down = (Parttimer)emp;
			System.out.println(down.addr+" "+down.age+" "+down.hourpay+" "+down.name);
		}
		if(emp instanceof Regular){
			Regular down = (Regular)emp;
			System.out.println(down.addr+" " +down.age+" " +down.name+" "+down.salary);
		}
				
	}
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
		Regular emp2 = new Regular("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);

	}
	//1 상속관계 만들기
	//2 적절한 생성자 만들기( super예약어 사용)
	//3 ShowInfo함수 안에서 Downcasting을 통해서 모든 멤버변수정보 출력하기
	
}


