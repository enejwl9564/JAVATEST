package TEST05;

public class T03CarMain {

	public static void main(String[] args) {
		
		T03Car hong = new T03Car();
		hong.owner = "홍길동";
		hong.speed = 0;
		hong.fuel = 100;
		hong.kind = "아반떼xd";
		System.out.printf("차주 : %s 현재속도 : %d 연료량 : %d 차종 : %s\n",hong.owner, hong.speed, hong.fuel, hong.kind);
		
	}

}
