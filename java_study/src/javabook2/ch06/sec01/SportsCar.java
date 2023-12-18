package javabook2.ch06.sec01;

//라이브러리 클래스 (main이 없는 클래스)
//(누구나 볼 수 있는) 스포츠카 설계도
public class SportsCar {

	
	// 1. 필드
	int wheelNum=4; // 바퀴 수
	
	// 2. 생성자(기본생성자)
	// 는 자동으로 만들어져있기 때문에 
	// 사용자 생성자를 만들것이 아니면 생성하지 않아도 된다.)
	SportsCar(){
		System.out.println("바퀴개수 : " + wheelNum);		// 필드 사용
		run();												// 메서드 호출(사용)
	}
	
	// 3. 메소드(기능)
	// 기능 : [주행하다.]를 출력하다.
	void run() {
		System.out.println("바퀴개수 : " + wheelNum);		// 필드 사용
		System.out.println("주행하다.");
	}
//	System.out.println("바퀴개수 : " + wheelNum);		// 불가능
	
	
}

// 클래스 선언
class Tire{
	
}
