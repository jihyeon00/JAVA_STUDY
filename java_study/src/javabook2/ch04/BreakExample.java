package javabook2.ch04;

public class BreakExample {

	public static void main(String[] args) {
		// while 문법 =====================
//		변수 초기화 ex) int sum=0;
//		while(조건식) {
//			실행문;
//		}
		
//		int i = 0;		// 1
//		while (i<10) {
//			System.out.println(i); // 0 1 2 3 ... 9
//			i++;
//		}
//		===================================
//		[문제] 항상 반복하도록 만들고 싶다.
//		int i = 0;		
//		while (true) {
//			int num = 1; // 공간만 만들어놓은 상태(int num;) -> 변수 초기화 (int num = 숫자;)
//			System.out.println(num);
//			num++;
//			// => while 내 변수 선언할 시 증감식을 사용해도 변수를 초기화하기 때문에 같은 값이 나온다.
//
//		}
		int num = 0;		
		while (true) {
			System.out.println(num);
			// 만약, num가 10이 되면 반복문을 빠져나오게 하고 싶다.
			if(num == 10) {
				break;
			}
			num++;
			
		}
		
		
		
		
		// for문 문법======================
//		for(초기화식;조건식;증감식) {
//			실행문;
//		}
		
		
//		for(int i = 0; i<10; i++){
//			System.out.println(i);
//		}
//		===================================
				
		
		
		
	}

}
