package TEST1;

public class T01진수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10진수로 변환
		System.out.printf("10진수 : %d\n", 0b10101101);	//0b	:2진수
		System.out.printf("10진수 : %d\n", 173); 		// 		:10진수
		System.out.printf("10진수 : %d\n", 0255);		//0		:8진수
		System.out.printf("10진수 : %d\n", 0xAD);		//0x	:16진수
		System.out.println();
		
		//8진수로 변환
		System.out.printf("8진수 : %o\n", 0b10101101);	//0b	:2진수
		System.out.printf("8진수 : %o\n", 173); 		// 		:10진수
		System.out.printf("8진수 : %o\n", 0255);		//0		:8진수
		System.out.printf("8진수 : %o\n", 0xAD);		//0x	:16진수
		System.out.println();
		
		//16진수로 변환
		System.out.printf("16진수 : %x\n", 0b10101101);	//0b	:2진수
		System.out.printf("16진수 : %x\n", 173); 		// 		:10진수
		System.out.printf("16진수 : %x\n", 0255);		//0		:8진수
		System.out.printf("16진수 : %x\n", 0xAD);		//0x	:16진수
		System.out.println();
	}

}
