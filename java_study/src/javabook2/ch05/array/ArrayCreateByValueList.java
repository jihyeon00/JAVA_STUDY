package javabook2.ch05.array;

public class ArrayCreateByValueList {

	public static void main(String[] args) {
		
		// 문제 : 3명의 학생의 점수의 합계를 구하시오.
		// int 배열
		int [] scores = {83,90,87}; // 배열 선언
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);

		System.out.println("===========================");
		for(int i = 0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("===========================");
		
		int sum = scores[0] + scores[1] + scores[2];
		System.out.println(sum);
		
		double avg = (double)sum/3;
		System.out.println(avg);
		
		// 배열 길이 확인 => 변수명.length
		System.out.println("배열길이: " + scores.length);
		
		System.out.println("===========================");
		// String 배열
		String[] season = {"spring", "summer", "fall", "winter"};
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		System.out.println("배열길이: " + season.length);
		
		System.out.println("===========================");
		// 배열을 사용할 때 반복문을 사용하면 좋다.
		for(int i = 0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		
		System.out.println("===========================");
		
		// boolean 배열
		boolean[] is_winner = {true, false, true, true};
		
		System.out.println(is_winner[0]);
		System.out.println(is_winner[1]);
		System.out.println(is_winner[2]);
		System.out.println("배열길이: " + is_winner.length);
		
		System.out.println("===========================");
		// 배열을 사용할 때 반복문을 사용하면 좋다.
		for(int i = 0; i<is_winner.length; i++) {
			System.out.println(is_winner[i]);
		}
		
		boolean[] in_value = {true, true, false};
		System.out.println("===========================");
		System.out.println(in_value[0]);
		System.out.println(in_value[1]);
		System.out.println(in_value[2]);
		System.out.println("배열길이: " + in_value.length);
		
		System.out.println("===========================");
		// 배열을 사용할 때 반복문을 사용하면 좋다.
		for(int i = 0; i<in_value.length; i++) {
			System.out.println(in_value[i]);
		}
		
	}

}
