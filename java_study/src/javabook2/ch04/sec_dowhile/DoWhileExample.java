package javabook2.ch04.sec_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr;
		do {
			System.out.println("메시지를 입력하세요.");
			inputStr = sc.nextLine();		// 입력(문자열) 수행
			System.out.println(inputStr);
		} while(!inputStr.equals("q"));		
				//'q' 아니면 true, 'q' 맞으면 false
				// 논리 연산자 ! 사용 ▶ q가 아니면 계속 실행
		
		sc.close();
	}

}
