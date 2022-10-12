package TEST3;

import java.util.Scanner;

public class T04for {

	public static void main(String[] args) {
		
//		int i = 0;
//		while(i<=10) {
//			System.out.println("Hello World");
//			i++;
//		}
		
		// 같은거
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println("Hello World");
//		}
		
		//1부터 10까지 합
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);
		
		//1부터 N까지 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= n; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);
		
		//N부터 M까지 합
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int n = sc.nextInt();
//		for(int m = sc.nextInt(); n <= m; n++) {
//			sum += n;
//		}
//		System.out.println(sum);
		
		//구구단 2단
//		for(int i = 2; i < 10; i++) {
//			System.out.printf("2 x %d = %d\n",i,2*i);
//		}
		
		//구구단 N단
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i = 2; i < 10; i++) {
//			System.out.printf("%d x %d = %d\n",n,i,n*i);
//		}		
		
		//구구단 전체
//		for(int i = 2; i < 10; i++) {
//			for(int j = 2; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n",i,j,i*j);
//			}
//		}
		
		//별찍기
		//1
				//*****
				//*****
				//*****
				//*****
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//2
				//*
				//**
				//***
				//****
//		for(int i = 0; i <= 4; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//3
				//****
				//***
				//**
				//*
//		for(int i = 0; i <= 3; i++) {
//			for(int j = 0; j <= 3-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//4
				//   *		0
				//  ***		2
				// *****	4
				//*******	6
		
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 3-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k <= i*2; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//5
				//*******	6
				// *****	4
				//  ***		2
				//   *		0
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j <= i-1; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k <= 6-i*2; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//6
				//   *
				//  ***
				// *****
				//*******
				// *****
				//  ***
				//   *
		
		
		
	}
}
