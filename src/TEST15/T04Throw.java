package TEST15;

public class T04Throw {
	
	public static void Ex1() {
		try {
		throw new ArithmeticException();
		}catch(ArithmeticException e) {
			System.out.println("Ex1의 예외처리");
		}
	}
	public static void Ex2() throws ArithmeticException {
		throw new ArithmeticException();
	}
	public static void Ex3() {
	
	}
	public static void main(String[] args) {
		Ex1();
		try {
			Ex2();
		}catch(Exception e) {
			System.out.println("MAIN에서 예외처리");
		}

	}

}
