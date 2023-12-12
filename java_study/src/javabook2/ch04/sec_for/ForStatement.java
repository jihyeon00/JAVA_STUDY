package javabook2.ch04.sec_for;

import java.util.Iterator;

public class ForStatement {
	public static void main(String[] args) {
		
		/*
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		
		for(초기화식; 조건식; 증감식) {
		// ex) for(int i = 0; i<[반복횟수]; i++) {
			
		}

		int i = 0;
		i = i + 1;
		System.out.println(i);
		i = i + 1;
		i++;
		++i;
		System.out.println(i);
		*/
		
		/*
		for(int i = 0; i<6; i++) {
			System.out.println(i);
		}
		*/
		
		// 문제1. 다음과 같이 숫자를 출력하시오.
		// 5 , 4 , 3 , 2 , 1 , 0
		for(int i = 5; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		// 문제2. 다음과 같이 숫자를 출력하시오.
		// 0 , 2 , 4 , 6 , 8
		for(int i = 0; i<=8; i=i+2) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		
		for(int i = 0; i<=4; i++) {
			System.out.println(i*2);
		}
		System.out.println("-----------------");
		
		
		// 문제3. 1부터 5까지 합을 구하는 프로그램을 작성하시오.
		int sum = 0;

		for(int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("-----------------");
	}
}
