package TEST23;

public class T01ThreadMain {

	public static void main(String[] args) throws Exception {
		
		//메인스레드에서의 실행흐름
		for(int i = 0; i < 5; i++) {
			System.out.println("TASK1");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("TASK2");
			Thread.sleep(500);
		}

	}

}
