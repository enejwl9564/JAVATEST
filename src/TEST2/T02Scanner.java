package TEST2;

import java.util.Scanner;

public class T02Scanner {

	public static void main(String[] args) {
		
		System.out.println("----------Sacnner Test ----------");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : "+num1);
		
		System.out.print("실수 입력: " );
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값: "+num2);
		
		System.out.print("문자열 입력: ");
		String str1 = sc.next();
		System.out.println("입력된 문자열 : " + str1);
		System.out.print("입력 : ");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		System.out.printf("문자열 : %s %s %s \n", s1,s2,s3);
		
		sc.nextLine();	//버퍼 공간에 남아있는 데이터값을 초기화
		
		System.out.print("문자열 입력(띄어쓰기포함 문자열) : ");
		String str2 = sc.nextLine();
		System.out.println("입력된 문자열 : "+str2);
		sc.close();
		

	}

}
