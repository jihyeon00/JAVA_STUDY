package javabook2.ch04.sec_while;

import java.util.Scanner;

public class KeyControl {

	public static void main(String[] args) {
		// 문제 : 키 입력을 통해 자동차의 속도를 제어하는 프로그램 작성
		
		// 1. 키 입력 구현
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력: ");
		String str;
		str = sc.nextLine();
		System.out.println(str);
		
		sc.close();
		
//		System.out.println(str=="가속");			// false
//		System.out.println(str.equals("가속"));		// true
		
		// 2. 입력된 키를 사용하여 속도 제어 : 1.가속 2. 감속 3. 정지
		// 자동차 시동 => 주행(달리다)
		int speed = 0;
		System.out.println("현재 속도 = " + speed);

		if(str.equals("가속")) {
			System.out.println("속도 증가");
			speed++;
		} else if(str.equals("감속")) {
			System.out.println("속도 감소");
			speed--;
		} else if(str.equals("정지")) {
			System.out.println("정지(속도=0)");
			speed = 0;
		}
		System.out.println("현재 속도 = " + speed);
		
		/*
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		*/
	}

}
