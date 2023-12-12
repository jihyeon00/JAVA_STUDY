package javabook2.ch02;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// Scanner 변수 선언 + 라이브러리 임포트(컨+쉬+o)
		Scanner sc = new Scanner(System.in);
		
		// 입력받을 변수 선언
		// String str;
		int money; 
	
		// 입력 문자열 할당
		System.out.println("입금하시겠어요?(입금 금액을 입력): ");
		// str = sc.nextLine(); 	// 문자열 입력
		money = sc.nextInt();		// 정수 입력
	
		
		System.out.print("입금 금액은 ");
		// 입력받은 문자열 출력
		// System.out.print(str + "원 입니다.");
		System.out.print(money + "원 입니다.");
		
		// 변수 할당 해제
		sc.close();
	}

}
