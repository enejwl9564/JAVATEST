package TEST1;

public class T04변수 {
	public static void main(String[] args) {
		//정수
		//int : 4byte 정수, 기본자료형
		
//		int n1 = 0b10101101;	//2진수
//		int n2 = 173;			//10진수
//		int n3 = 0255;			//8진수
//		int n4 = 0xad;			//16진수
//		
//		System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);
		
		//byte : 1byte 정수, 부호 o
		
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		byte n5 = (byte)128; // (byte) = 강제 형 변환
//		
//		System.out.printf("%d",n5);
		
		//short vs char 비교
		//char	: 2byte 정수 부호 x , 단일 문자 저장용으로 주로 사용
		//short : 2byte 정수 부호 o
		
//		char n1 = 60000;	// 0 ~ (2^16 - 1) / 0 ~ 65535
//		short n2 = 32767;	// -2^15 ~ (2^15 - 1) / -32768 ~ 32767
//		
//		char n3 = 60000;
//		short n4 = (short)n3;
//		
//		System.out.printf("%d",n4);
		
		//실수
		//float	: 4byte 실수
		//double: 8byte 실수(기본값)
		
		float n1 = 3.14f;	//리터럴접미사 F,f : float 자료형
		double n2 = 3.14;	//리터럴접미사x - > 기본자료형(double)
		
		//정밀도 확인
		float n3 = 0.123456789123456789F;
		double n4 = 0.123456789123456789;
		System.out.println(n3);
		System.out.println(n4);
		
		//고정 소수점 방식 		: 소수점의 위치가 고정
		//부동 소수점 방식(기본)  : 소수점의 위치가 동적
		
		
	}

}
