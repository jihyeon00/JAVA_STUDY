package javabook2.ch05.sec_enum;

import java.util.Scanner;

public class MonthExample {

	public static void main(String[] args) {
		// 변수 선언
		// 타입 변수명;
		int a = 1;
		
		// 상수는 대문자로 사용한다.
		// => JAN 과 같은 상수가 대문자로 사용되는 이유이다.
		Month m1 = Month.JAN;
		Month m2 = Month.DEC;
		
		// 문제 해당 월에 해야할 일을 스케줄링하는 프로그램을 작성하시오
		// 11월 : DB
		// 12월 : JAVA
		// 1월 : HTML
		// 2월 : JSP
		// 3월 : 스마트팩토리
		// 4월 : SPRING
		
		Month today = Month.JAN;
		Month afterDec = Month.JAN;

		switch (today) {
		case NOV: 
			System.out.println("DB");
			break;
		case DEC:
			System.out.println("JAVA");
			break;
		case JAN:
			System.out.println("HTML");
			break;
		case FRB:
			System.out.println("JSP");
			break;
		case MAR:
			System.out.println("스마트팩토리");
			break;
		case APR:
			System.out.println("SPRING");
			break;
		default:
			break;
		}
		
		// 월을 입력받아 찍는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		System.out.println(month);

		switch (month) {
		case 11: 
			System.out.println("DB");
			break;
		case 12:
			System.out.println("JAVA");
			break;
		case 1:
			System.out.println("HTML");
			break;
		case 2:
			System.out.println("JSP");
			break;
		case 3:
			System.out.println("스마트팩토리");
			break;
		case 4:
			System.out.println("SPRING");
			break;
		default:
			System.out.println("없습니다.");
			break;
		}
		
		sc.close();		
	}

}
