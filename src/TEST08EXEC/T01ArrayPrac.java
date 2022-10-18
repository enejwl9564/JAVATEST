package TEST08EXEC;

import java.util.*;

public class T01ArrayPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar1 = new int[10]; 
		int max, min, sum = 0;
		double avg = 0.0;
		//값 입력 받기
		for(int i = 0; i < ar1.length; i++) {
			ar1[i] = sc.nextInt();
			System.out.println(ar1[i]);
		}
		//최대 최소 합
		max = ar1[0];	//기본값
		min = ar1[0];	//기본값
		for(int num : ar1) {
			 if(max<num) {
				 max = num;
			 }
			 if(min>num) {
				 min = num;
			 }
			 sum += num;
		}
		avg = (double)sum/ar1.length;
		
		System.out.printf("최대 : %d, 최소 : %d , 합 : %d 평균 : %f\n",max,min,sum,avg);
		
	}

}
