package javabook2.ch06.sec01;

// 실행 클래스
public class SportsCarExample {

	public static void main(String[] args) {
		// 생성자를 사용하여 객체 생성	
		// SportsCar 설계도에 따라 내 차(myCar)를 생성
		SportsCar myCar = new SportsCar();	// 생성자 사용
		
		
		// 다른 클래스에서 사용하는 경우
		// 내 차의 바퀴 갯수를 출력하고 내 차의 기능인 주행을 수행한다.
		System.out.println(myCar.wheelNum);	// 필드 사용
		myCar.run();		// 메서드 호출(사용)
	}

}
