package TEST5;

import java.util.Scanner;

class Sum{
	//속성
	Scanner sc = new Scanner(System.in);
	//기능
	//반환 o 매개변수 o
	int sum1(int x,int y) {
		return x+y;
	}
	
	//반환 o 매개변수 x
	int sum2() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	//반환 x 매개변수 o
	void sum3(int x, int y) {
		System.out.println("sum3(x,y) = " + (x+y));
	}
	
	//반환 x 매개변수 x
	void sum4() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("sum4() = " + (x+y));
	}
}

public class T07SimpleMethodTest {

	public static void main(String[] args) {
		
		Sum calc = new Sum(); //Sum객체 생성 이후  calc 참조변수에 연결
		int r1 = calc.sum1(10, 20);
		System.out.println("sum1(x,y) = "+r1);
		
		int r2 = calc.sum2();
		System.out.println("sum2() = "+r2);		
		
		calc.sum3(10,20);
		
		calc.sum4();
		
	}

}
