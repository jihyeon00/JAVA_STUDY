package javabook1.loop;

public class WhileDemo {

	public static void main(String[] args) {
//		// 문제 1 : Coding Everybody를 무한 반복해서 출력하시오.
//		while (true) {
//			System.out.println("Coding Everybody");
//		}
		
		// 문제 2 : 다음과 같이 출력하는 프로그램을 작성하시오. ( while 문 사용)
//		Coding Everybody0
//		Coding Everybody1
//		Coding Everybody2
//		Coding Everybody3
//		Coding Everybody4
		int i = 0;
		while (i<5) {
			System.out.println("Coding Everybody"+i);
			i++;
		}
	}

}
