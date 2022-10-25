package TEST13;

interface T03Remocon{
	//필드 (final static)
	int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	//기능 (추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);	
}

class T03TV implements T03Remocon{
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

interface SearchURL{
	void Search(String url);
}

class T03SmartTV extends T03TV implements SearchURL{

	@Override
	public void Search(String url) {
		System.out.println(url+" 검색 시작합니다.");
		
	}
}

public class T03InterfaceMain {

	public static void turnOn(T03Remocon Controller) {
		Controller.turnOn();
	}	
	public static void turnOff(T03Remocon Controller) {
		Controller.turnOff();
	}	
	public static void Setvol(T03Remocon Controller,int num) {
		Controller.setVolumn(num);
	}
	public static void Search(SearchURL product, String url) {
		product.Search(url);
	}
	public static void main(String[] args) {
		
		T03SmartTV tv = new T03SmartTV();
		turnOn(tv);
		Setvol(tv,5);
		Search(tv, "www.naver.com");
		turnOff(tv);

	}
}
