package TEST5;

class T05Car{
	String owner, model;
	int speed, fuel;
	
	//기능
	//가속함수
	void Accel() {
		//1 fuel 확인
		//2 speed 10증가
		//3 200km/h 제한
		//4 fuel 5감소
		if(fuel-5<=0) {
			fuel = 0;
			System.out.println("[ERR]가속 불가 - 연료량이 바닥입니다.");
		}else {
			fuel -=5;
			if(speed+10>=200) {
				speed += 200;
				System.out.println("[WARN]최대속도입니다. 200km/h");
			}else {
				speed += 10;
				System.out.println("[INFO]가속합니다. 현재속도 : "+speed+"km/h");
			}
		}
	}
	//감속 함수
	void Break() {
		//1 속도체크
		//2 속도감속(-5)
		if(speed-5 <= 0) {
			speed = 0;
			System.out.println("[INFO]감속불가 합니다. 현재속도 : 0km/h");
		}else {
			speed -= 5;
			System.out.println("[INFO]감속합니다. 현재속도 : "+speed+"km/h");
		}
		
	}
	//정보 확인
	void ShowInfo() {
		
	}
}

public class T05CarMain {

	public static void main(String[] args) throws InterruptedException {
		
		T05Car hong = new T05Car();
		hong.owner = "홍길동";
		hong.speed = 0;
		hong.fuel = 100;
		hong.model = "아반떼xd";
		
		while(true) {
//			hong.Accel();
			hong.Break();
			Thread.sleep(500);
		}
		
	}

}
