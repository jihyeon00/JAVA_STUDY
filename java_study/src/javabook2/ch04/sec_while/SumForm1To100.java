package javabook2.ch04.sec_while;

public class SumForm1To100 {

	public static void main(String[] args) {
		// 문제 : 1부터 100까지 합 구하기(while문 사용)
		
		int i=1;
		int sum = 0;
		while (i<101) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
	}

}
