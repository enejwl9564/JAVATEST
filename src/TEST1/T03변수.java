package TEST1;

public class T03변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;	//4byte 정수공간생성 + num1 이름 부여
		num1 = 10;	//10상수값을 num1공간에 대입
		
		int num2 = 4;	//4상수값을 4byte 정수 num2공간에 초기화
		
		int num3 = num1 + num2;	//num1값 + num2값을 4byte정수 num3공간에 초기화
		
		System.out.println(num3);	//함수의 인자로 변수명이 사용되면 값으로 해석
									//num3안의 값을 println으로 출력
	}

}
