package TEST13;

interface T01Remocon{
	//필드 (final static)
	int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	//기능 (추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);	
}

class TV implements T01Remocon{
	int vol;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolumn(int vol) {
		if(MAX_VOLUMN <= vol) {
			this.vol = MAX_VOLUMN;
		}else if(MIN_VOLUMN >= vol) {
			this.vol = MIN_VOLUMN;
		}else {
			this.vol = vol;
		}
		System.out.println("현재 TV 볼륨 : "+ this.vol);
	}
}

class Radio implements T01Remocon{
	int vol;
	
	@Override
	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio를 끕니다.");
	}

	@Override
	public void setVolumn(int vol) {
		if(MAX_VOLUMN <= vol) {
			this.vol = MAX_VOLUMN;
		}else if(MIN_VOLUMN >= vol) {
			this.vol = MIN_VOLUMN;
		}else {
			this.vol = vol;
		}
		System.out.println("현재 Radio 볼륨 : "+ this.vol);
	}
}

public class T01InterfaceMain {

	public static void turnOn(T01Remocon Controller) {
		Controller.turnOn();
	}	
	public static void turnOff(T01Remocon Controller) {
		Controller.turnOff();
	}	
	public static void Setvol(T01Remocon Controller,int num) {
		Controller.setVolumn(num);
	}	
	public static void main(String[] args) {
		TV tv = new TV();
		Radio radio = new Radio();
		turnOn(tv);
		turnOn(radio);
		turnOff(tv);
		turnOff(radio);
		Setvol(tv,7);
		Setvol(radio,11);
	}
}
