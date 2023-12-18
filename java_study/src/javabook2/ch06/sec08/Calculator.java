package javabook2.ch06.sec08;

public class Calculator {
	// 필드
	// 생성자
	// 메소드
	
	// 켜기
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		System.out.println("디스플레이를 실행합니다.");
	}
	
	// 나누기
	int divide(int x, int y) {
		return x/y;
	}
	
	// 더하기
	int sum(int x, int y) {
		powerOn();
		return x+y;
	}
	
	// 곱하기
	int multiply(int x, int y) {
		return x*y;
	}
		
	// 끄기
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
		
		
		
}
