package javabook2.ch04.sec_switch;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		// 문제 1 : 점수를 입력받아 성적 등급을 부여하는 프로그램 작성
		// 단, switch 문을 사용할 것. 등급 변수는 char 사용할 것.
		// 힌트1 : Scanner 입력 사용
		// 힌트2 : 점수 영역별 등급 산정
		// (예: 90점대(A), 80점대(B), 70점대(C), 60점대이하(F))
		
		/*
		// 내 풀이 : Scanner를 이용하여 점수를 입력받은 후 switch문 사용하여 등급을 출력
		Scanner sc = new Scanner(System.in);

		// int score; 이렇게 선언할 필요없이 아래처럼 변수 선언과 값 할당을 한번에 해준다.

		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		System.out.print("입력한 점수는 " + score);
		
		
		switch((int)score/10) { // int로 강제형변환을 하여 소수점 등 방지
		
		    case 10 : 
		        System.out.print(", 그리고 등급은 A등급입니다." );
		        break;
		    case 9 : 
		        System.out.print(", 그리고 등급은 A등급입니다." );
		        break;
		    case 8 : 
		        System.out.print(", 그리고 등급은 B등급입니다." );
		        break;
		    case 7 : 
		        System.out.print(", 그리고 등급은 C등급입니다." );
		        break;
		    default : 
		        System.out.print(", 그리고 등급은 F등급입니다." );
		        break;
		    
		}
		
		sc.close();
		*/
		
		// 교수님 풀이
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력: ");
		int score = sc.nextInt();	// 정수 입력
		score /= 10;				// score = score/10;
		// System.out.println(score);
		
		sc.close();
		
		System.out.print("등급은 ");
		
		char grade; 				// 변수 선언
		
		switch(score) { 
		    case 10 : 
		    case 9 : 
		    	grade = 'A';			// 변수 할당
//		        System.out.println("A");
		        break;
		    case 8 : 
		    	grade = 'B';			// 변수 할당
//		        System.out.print("B");
		        break;
		    case 7 : 
		    	grade = 'C';			// 변수 할당
//		        System.out.print("C");
		        break;
		    default : 
		    	grade = 'F';			// 변수 할당
//		        System.out.print("F");
		        break;
		}
		
		
		// 문제2 : 점수에 따라 부여된 등급을 char 변수로 사용하여
		// 재수강 여부를 결정(출력)하는 Switch 문을 작성하시오.
		
		System.out.println(grade);
		
		
		switch(grade) {
			case 'F':
				System.out.println("F등급 시 재수강 함");
				break;
			default:
				System.out.println("A,B,C 등급 시 재수강 안함");
				break;
		}
	
	}

}
