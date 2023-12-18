package javabook2.ch06.sec08;

public class CalculatorExample {

	// 필드 
	static String country = "한국";
	
	// 공통적으로 사용
	// 메소드
	public static void main(String[] args) {
		
		// 내 계산기 생성
		Calculator myCal = new Calculator();
		int result;
		myCal.powerOn();
		
		result = myCal.divide(12, 2);
		System.out.println(result);
		
		myCal.powerOff();
		
		// kenneth 계산기 생성
		Calculator kennethCal = new Calculator();
		
		// 20 더하기 7
		System.out.println(kennethCal.sum(20, 7));

		
		myCal.powerOff();
		
	}
	

}
