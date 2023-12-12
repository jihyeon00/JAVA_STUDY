package javabook2.ch04.sec_if;

public class ElseIf {
	public static void main(String[] args) {
		
		// 기본 if-else문
		/*
		if(조건식) {
			
		} else {
			
		}
		 */
		
		// else-if 문
		if(true) {
			// if 조건식이 참일 때 실행될 코드			:	1번
			System.out.println("if문의 조건식이 참일 경우 실행");
		} else if(true) {
			// else if 조건식이 참일 때 실행될 코드		:	2번
			System.out.println("else if문의 조건식이 참일 경우 실행");
		} else {
			//											:	3번
			System.out.println("if문과 else if문 조건식이 모두 거짓일 경우 실행");		
		}
		
		
	}
}
