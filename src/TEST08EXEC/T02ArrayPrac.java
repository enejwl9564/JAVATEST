package TEST08EXEC;

import java.util.Scanner;

public class T02ArrayPrac {

	public static void main(String[] args) {
		//5명의 학생의 국/영/수 점수를 입력받아 출력해 봅시다.
		//이차월배열 int score[5][3]
		//반복문을 이용해서 값을 입력받기
		//각 행의 합 과 전체 합 // 각행의 평균 전체 평균을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3];
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = sc.nextInt(); // 이차원 배열 각 요소에 값 넣기
			}
		}
		//학생별 총점 구하기
		int std[] = new int[5];		// 학생별 총점
		int cnt = 0;
		for(int tmp[] : score) {
			for(int n : tmp) {
				std[cnt] += n;
			}
			cnt++;
		}
		
		//학생별 평균 구하기
		//생략
		
		//과목별 총점 구하기
		int subject[] = new int[3]; //0 : 국어총점/ 1 : 영어총점/ 2 : 수학총점
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < score.length; j++) {
				subject[i] += score[i][j];
			}
		}
		System.out.println(subject[1]);
		//과목별 평균 구하기
		//생략
		
		
//		for(int i = 0; i < std.length; i++) {
//			System.out.println(i+"번째 학생 총점 : " + std[i]);
//		}
		
	}

}
