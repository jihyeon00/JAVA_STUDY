package javabook2.ch06.sec10;

// 사람 실행 클래스
// 관계 : 사람[사용] 계산기
public class Person {

	public static void main(String[] args) {
		
		System.out.println(Calculator.pi);
		Calculator.getCircleArea(5);
		
		Calculator myCal = new Calculator();
		System.out.println(myCal.color);
		myCal.getInfo();
		
		
		
	}

}
