package TEST3;

import java.util.Scanner;

public class T02whilewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전체 구구단 출력하기
//		int dan = 2;
//		while(dan<10) {
//			int i = 2;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		//전체 구구단 출력하기 ( 단만 역순 출력 )
//		int dan = 9;
//		while(dan>1) {
//			int i = 2;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		
		//전체 구구단 출력하기 ( 전체 역순 출력 )
//		int dan = 9;
//		while(dan>1) {
//			int i = 9;
//			while(i>1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		//N부터 9단 까지 전체 출력
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		while(dan<10) {
//			int i = 2;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
//		int i = 0;
//		while(i<4) {
//			int t = 0;
//			while(t <5) {
//				System.out.print("*");
//				t++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		int i = 0;
//		while(i<4) {
//			int t = 0;			
//			while(t<i+1) {
//				System.out.print("*");
//				t++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		int i = 0;
//		while(i<4) {
//			int t = 4;
//			while(t>i) {
//				System.out.print("*");
//				t--;
//			}
//			System.out.println();
//			i++;
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int i = sc.nextInt(), k = 0;
//		while(k<i) {
//			int t = 0;
//			while(t<5) {
//				System.out.print("*");
//				t++;
//			}
//			System.out.println();
//			k++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("넓이 : ");
//		int i = sc.nextInt(), k = 0;
//		while(k<4) {
//			int t = 0;
//			while(t<=i) {
//				System.out.print("*");
//				t++;
//			}
//			System.out.println();
//			k++;
//		}
		
//		int i = 0;	//행
//		int j;		//공백
//		int k;		//별
//		
//		while(i<4) {
//			j = 0;
//			k = 0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		int i = 0;	//행
//		int j;		//공백
//		int k;		//별
//		
//		while(i<4) {
//			j = 0;
//			k = 0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 0;	//행
//		int j;		//공백
//		int k;		//별
//		
//		while(i<n) {
//			j = 0;
//			while(j<=(n-2)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			while(k<=i*2) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 0;	//행
//		int j;		//공백
//		int k;		//별
//		
//		while(i<n) {
//			j = 0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			k = 0;
//			while(k<=(n-1)*2-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//6
				//   *
				//  ***
				// *****
				//*******
				// *****
				//  ***
				//   *
//		int i = 0 , k , j;
//		
//		while(i<7) {
//			if(i<4) {
//				j = 0;
//				while(j<=2-i) {
//					System.out.print(" ");
//					j++;
//				}
//				k = 0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			else {
//				j = 0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				k = 0;
//				while(k<=12-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}		
		
		
		
		int i = 0 , k , j;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(i<n) {
			
			if(i<=n/2) {
				j = 0;
				while(j<=(n/2-1)-i) {
					System.out.print(" ");
					j++;
				}
				k = 0;
				while(k<=i*2) {
					System.out.print("*");
					k++;
				}
			}//6   1   
			else {
				j = 0;
				while(j<=i-(n/2+1)) {
					System.out.print(" ");
					j++;
				}
				k = 0;
				while(k<=(n-1)*2-2*i) {
					System.out.print("*");
					k++;
				}
			}
			System.out.println();
			i++;
		}
		
		
	}

}
