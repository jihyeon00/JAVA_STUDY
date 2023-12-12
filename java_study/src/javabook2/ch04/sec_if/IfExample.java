package javabook2.ch04.sec_if;

public class IfExample {

	public static void main(String[] args) {
		// 제어문(조건문) : if문
		/*
		int score;		// 변수 선언
		score = 90;		// 변수 할당
		
		if(score >= 90) {
			System.out.println("A등급");
		}
		
		if(score >= 80 && score < 90) {
			System.out.println("B등급");
		}
		
		if(score >= 70 && score < 80) {
			System.out.println("C등급");
		}
		*/
		
		/*
		if(score >= 90) {
			System.out.println("자동차를 선물로 받음");
		} else {
			System.out.println("어머니께 용돈을 100만원을 드림");
		}
		*/

		int score;		// 변수 선언
		score = 89;		// 변수 할당
		
		if(score >= 90) {
			System.out.println("자동차를 선물로 받음");
		} else if(score >= 80){
			System.out.println("핸드폰을 선물로 받음");
		} else if(score >= 70){
			System.out.println("맛있는 음식 사줄게");
		} else {
			System.out.println("어머니께 용돈을 100만원을 드림");
		}
		
		
	}

}
