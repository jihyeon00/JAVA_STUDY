package javabook2.ch06.sec10;

// 계산기 라이브러리 클래스
public class Calculator {
	// 정적 필드
	static double pi = 3.14159;
	
	// 정적 메서드(정적 필드를 사용)
	// 기능 : 원 넓이 구하기 = 반 * 반 * 3.14

	// 리턴타입 모르겠으면 일단 void로 선언
	// void getCircleArea () {}
	 
	public static void getCircleArea (int radius) {
		System.out.println(radius * radius * pi);
	}

	// [인스턴스] 필드
	String color = "red";

	// [인스턴스] 메소드
	void getInfo() {
		System.out.println("계산기 컬러: " + color);
	}

}
