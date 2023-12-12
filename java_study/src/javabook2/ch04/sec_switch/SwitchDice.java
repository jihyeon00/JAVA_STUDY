package javabook2.ch04.sec_switch;

public class SwitchDice {

	public static void main(String[] args) {
		// 문제 : 주사위 프로그램 구현
		// => 임의의 정수 (1부터 6까지) 정수 출력(random)
		// Math.random() : 랜덤 실수 생성
		//	=> 실수 생성 범위 : 0.0 <= [실수] < 1.0 
//				0.0 * 6 <= [실수] * 6   < 1.0*6
//				0.0 + 1 <= [실수] * 6+1 < 6.0 +1
//				1.0     <= [실수] * 6+1 < 7.0
		
//		int num = (int)(Math.random()*[최댓값]+[최솟값]);

		int num = (int)(Math.random()*6+1);
//		System.out.println(Math.random()+1);
//		System.out.println(num);
		System.out.println("던져진 주사위 값 : ");
		
		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("6");
			break;
		}
		
	}

}
