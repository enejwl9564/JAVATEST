package 조건문문제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
		if(n1<=90) {
			System.out.println("A");
		}else if(n1<=89) {
			System.out.println("B");
		}else if(n1<=79) {
			System.out.println("C");
		}else{
			System.out.println("F");
		}
	}

}
