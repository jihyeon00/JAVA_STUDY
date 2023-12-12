package javabook2.ch04.sec_for;

public class ForPrint {

	public static void main(String[] args) {

		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("=====================");
		
		// 문제 : 1부터 15까지의 합
		int sum = 0;

		for(int i = 1; i<16; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
