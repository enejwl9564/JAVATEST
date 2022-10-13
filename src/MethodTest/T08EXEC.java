package MethodTest;

import java.util.Scanner;

class Sub{
	Scanner sc = new Scanner(System.in);
	
	int sub1(int x,int y) {
		return x+y;
	}

	int sub2() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	void sub3() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x+y);
	}

	void sub4(int x, int y) {
		System.out.println(x+y);
	}
	
}

public class T08EXEC {

	public static void main(String[] args) {
		//다음 코드를 실행할수 있는 Sub클래스를 만드세요
		
		Sub calc = new Sub();
		int R1 = calc.sub1(10,20);
		System.out.println(R1);	
		int R2 = calc.sub2();
		System.out.println(R2);	
		calc.sub3();
		calc.sub4(10,20);

	}

}
