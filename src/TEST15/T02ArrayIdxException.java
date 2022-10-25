package TEST15;

public class T02ArrayIdxException {

	public static void main(String[] args) {
		int arr[] = {10,20,30};
		
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		System.out.println("실행코드1");
		System.out.println("실행코드2");
	}
}
