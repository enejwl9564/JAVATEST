package TEST3;

import java.util.Scanner;

public class T01while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//탈출요건
		//1. 탈출 변수
		//2. 탈출 조건식
		//3. 탈출 연산식
		
//		int i = 0; // 1. 탈출 변수
//		while(i<10) // 2. 탈출 조건식
//		{
//			System.out.println("Hello World");
//			i++; // 3. 탈출 연산식
//		}
//		int i = 1; // 1. 탈출 변수
//		int sum = 0; // 누적 합 저장 변수
//		while(i<=10) // 2. 탈출 조건식
//		{
//			System.out.println("i : "+i);
//			sum += i;
//			i++; // 3. 탈출 연산식
//		}
//		System.out.println("1부터 10까지 합 : "+sum);
		
		//1번 문제
		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt() , sum = 0;
//		int i = 1;
//		while(i<=num)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.println("하아아압 : "+sum);
		
		//2번 문제
//		int n = sc.nextInt(), m = sc.nextInt(), sum = 0;
//		
//		if(n<=m) {
//			while(n<=m)
//			{
//				sum += n;
//				n++;
//			}
//			System.out.println("하아압 : "+sum);
//		}else {
//			while(m<=n)
//			{
//				sum += m;
//				m++;
//			}
//			System.out.println("하아압 : "+sum);
//		
//		}
		// 2번 문제 or
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int i =n;
//		int sum = 0;
//		while(i <= m) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d까지의 합 : %d\n",n,m,sum);
		
		// 3번 문제
//		int n = 2;
//		int i = 2;
//		int t = 1;
//		while(i<10) {
//			t = n * i;
//			System.out.printf("2 x %d = %d\n",i,t);
//			i++;
//		}
		
		// 4번 문제
//		int n = 2;
//		int i = 9;
//		int t = 1;
//		while(i>1) {
//			t = n * i;
//			System.out.printf("2 x %d = %d\n",i,t);
//			i--;
//		}
		
		// 5번 문제
//		int n = sc.nextInt(), i = 2, t = 1;
//		
//		while(i<10) {
//			t = n * i;
//			System.out.printf("%d x %d = %d\n",n,i,t);
//			i++;
//		}
		
		// 6번 문제
//		int n = sc.nextInt(), i = 9, t = 1;
//		
//		while(i>1) {
//			t = n * i;
//			System.out.printf("%d x %d = %d\n",n,i,t);
//			i--;
//		}
		
		// 7번 문제
//		int n = sc.nextInt(), i = 1, t = 0;
//		while(i<=n) {
//			t += 3;
//			System.out.printf("%d ",t);
//			i++;
//		}
		
		// 8번 문제
//		int j = 1, h, i = 1, jsum = 0, hsum = 0;
//		while(i <= 100)
//		{
//			if(i%2==0) {
//				jsum +=i;
//			}else if(i%2==1) {
//				hsum +=i;
//			}
//			i++;
//		}
//		h = jsum + hsum;
//		System.out.println("합은 : "+h);
		
		// 9번 문제
//		int h, i = sc.nextInt(), jsum = 0, hsum = 0, t = 1;
//		while(t <= i)
//		{
//			if(t%2==0) {
//				jsum +=t;
//			}else if(t%2==1) {
//				hsum +=t;
//			}
//			t++;
//		}
//		h = jsum + hsum;
//		System.out.println("합은 : "+h);
		
		// 10번 문제
//		int i = 1;
//		int sum = 0;
//		while(i<=100) {
//			
//			if(i%3!=0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
		//11번 문제
		//문제 
		//문자열을 입력받아서 각문자를 거꾸로 출력해봅시다(같이 풉니다)
		//입력 : apple
		//출력 : elppa
		
		String str1 = sc.nextLine();
		String reverse="";
		int len = str1.length()-1;
		System.out.println("길이 : " +len);
		while(len>=0) {
			//System.out.print(str1.charAt(len));
			reverse+=str1.charAt(len);
			len--;	
		}
		System.out.println(reverse);
		
	}
}
