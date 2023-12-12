package javabook1.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// 문제 : 구구단 2단을 출력하는 프로그램을 작성하시오.
		// for문
//		for(int i=1;i<10;i++) {
//			System.out.println("2 * " + i + " = " + i*2);
//		}
		
		// while문
//		int i = 1;
//		while(i<10) {
//			System.out.println("2 * " + i + " = " + i*2);
//			i++;
//		}
		
		// 문제 : 구구단 9단까지 전부 출력하는 프로그램을 작성하시오.
		// for문
//		for(int i=2;i<10;i++) {
//			System.out.println(i + "단");
//			for(int j=1; j<10; j++) {
//				System.out.println(i + " * " + j + " = " + i*j);				
//			}
//		}
		
		// while문
		int i = 2;
		int j = 1;
		while (i<10) {
			System.out.println(i + "단");
			while (j<10) {
				System.out.println(i + " * " + j + " = " + i*j);				
				j++;
			}
			i++;
			j = 1;
			
		}
			
		
	}

}
