package TEST2;
import java.util.Scanner;

public class T01Scanner {

	public static void main(String[] args) {
		//System.out	: 표준 출력 스트림 생성 - 모니터
		//System.in		: 표준 입력 스트림 생성 - 키보드
		//new Scanner(System.in)
		//키보드로 부터 전달되는 데이터를 받을 수 있는 Scanner장치를 생성
		//Scanner sc = new Scanner(System.in);
		//Scanner장치를 main함수내에서 제어(사용)할 수 있도록
		//참조변수 sc에 연결
		
		Scanner sc = new Scanner(System.in);
		//System.in : 표준 입력 스트림 키보드로 부터 JAVA프로그램으로 데이터통로
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1 + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d\n",num1,num2,num3,num4,sum);
		sc.close();

	}

}
