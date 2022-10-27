package TEST23;

public class T02Worker2 implements Runnable{
		
		public void run() {
			for(int i = 0; i < 5; i++) {
				System.out.println("TASK2");
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

