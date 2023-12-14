package javabook2.ch05.array;

public class ArrayInArray_exam {

	public static void main(String[] args) {
		// 평가 예제
		// : 반별 학생별 점수 생성 및 합계와 평균 구하기
		int[][] scores = { { 80, 90, 96 }, // 1반 3명
				{ 76, 88 } // 2반 2명
		};

		// 1반 2번째 학생의 점수 출력
		System.out.println(scores[0][1]);
		// 2반 1번째 학생의 점수 출력
		System.out.println(scores[1][0]);
		System.out.println("================================");

		// 1차원 배열 길이
		System.out.println(scores.length);
		// 2차원 0번 인덱스 배열 길이(1반의 학생수)
		System.out.println(scores[0].length);
		// 2차원 1번 인덱스 배열 길이(2반의 학생수)
		System.out.println(scores[1].length);
		System.out.println("================================");

		for (int i = 0; i < scores[0].length; i++) {
			System.out.println("1반 " + i + "번째 학생 점수는 " + scores[0][i] + "점이다.");
		}

		for (int i = 0; i < scores[1].length; i++) {
			System.out.println("2반 " + i + "번째 학생 점수는 " + scores[0][i] + "점이다.");
		}
		System.out.println("================================");
		
		// 문제1 : 각반 학생들의 점수 총합
		
		// 1반 학생들 점수 총합
		int sum1 = 0;
		System.out.print("1반 학생들 점수 총합 : ");
		for (int i = 0; i < scores[0].length; i++) {
			sum1 += scores[0][i];
		}
		System.out.println(sum1+"점");
		
		// 2반 학생들 점수 총합
		int sum2 = 0;
		System.out.print("2반 학생들 점수 총합 : ");
		for (int i = 0; i < scores[1].length; i++) {
			sum2 += scores[1][i];
		}
		System.out.println(sum2+"점");
		System.out.println("================================");
		
		// 문제 2 : 각 반 학생들 점수 평균
		
		// 1반 학생들 점수 평균
		int sum3 = 0;
		System.out.print("1반 학생들 점수 평균 : ");
		for(int i = 0; i<scores[0].length;i++) {
			sum3 += scores[0][i];
		}
		double avg1 = (double)sum3/scores[0].length;
		System.out.println(avg1+"점");
		
		// 2반 학생들 점수 평균
		int sum4 = 0;
		System.out.print("2반 학생들 점수 평균 : ");
		for(int i = 0; i<scores[1].length;i++) {
			sum4 += scores[1][i];
		}
		double avg2 = (double)sum4/scores[1].length;
		System.out.println(avg2+"점");
		System.out.println("================================");
		
		
		
		// 문제3 : 전체 학생들 점수 총합과 평균
		/*
		for(int i = 0; i<scores[0].length;i++) {
			System.out.println(scores[0][i]);
		}
		for(int i = 0; i<scores[1].length;i++) {
			System.out.println(scores[0][i]);
		}
		*/
		int sum5 = 0;
		int count = 0;
		System.out.print("전체 학생들 점수 총합 : ");
		for (int i = 0; i < scores.length; i++) {			// 2번 반복 : 행 개수
			for (int j = 0; j < scores[i].length; j++) {	// 3번 반복 : 열 개수
				sum5 += scores[i][j];
				count++;
			}
		}
		System.out.println(sum5+"점");
		
		System.out.print("전체 학생들 점수 평균 : ");
		double avg3 = (double)sum5/count;
		System.out.println(avg3+"점");
		System.out.println("================================");
	}

}
