package javabook2.ch06.sec01;

// class 클래스명 {} : 클래스(설계도) 생성
// public : 공공의. 누구나 사용 가능 <-> 캡슐화 와 반대된다.

// static void 자리에 타입 작성이 가능하다. 
// public String 함수명(인수) {
//		return 값;
//}

// 라이브러리 클래스 (main이 없는 클래스)
// (누구나 볼 수 있는) 자동차 설계도
public class Car {
	
	// 문제 : 자동차 설계도를 작성하시오
//			자동차가 가지는 속성을 하나 필드로 작성하시오.
//			자동차가 가지는 기능을 하나 메서드로 작성하시오
//	/*
	// 1. 필드
	String carName = "SUV";
	
	// 2. 생성자
	Car(){
		carName = carName;
	}
	Car(String carName){
		carName = carName;
		System.out.println(carName);
		carDetail(carName);
	}
//	*/
	// 3. 메소드
	String carDetail(String subject) {
		System.out.println("차종은 " + subject + "이다.");
		return subject;
	}
	
	/*
	// 교수님 예시
	// 1. 필드
	String Company = "현대자동차";
	String model = "tusan";
	int maxSpeed = 300;
	
	// 2. 생성자
	
	
	// 3. 메소드
	// 기능 : 주행하다.
	void run() {
		System.out.println("주행하다.");
	}
	// 기능 : 속도를 표시하다.
	void displaySpeed() {
		System.out.println("속도를 표시하다.");
	}
	*/
}
