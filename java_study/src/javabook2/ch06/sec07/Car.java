package javabook2.ch06.sec07;

public class Car {
	// 필드(속성)
	String model;
	String color;
	int maxSpeed;
	
	// 생성자(필드 초기화)
	// 생성자 오버로딩
	public Car(String model) {
//		this.model = model;
		// this() => 생성자, 매개변수 개수, 타입, 순서를 
		// 확인해서 선택적으로 사용한다.
 		this(model, "검정색",250);
	}
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model,String color) {
//		this.model = model;
//		this.color = color;
		this(model,color,270);
	}
	
	public Car(String model,String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 메소드
	void run() {
		System.out.println("주행하다.");
	}
	void run1(String driverName) {
		System.out.println("주행하다.");
	}
	String run2(String driverName) {
		System.out.println(driverName+"주행하다.");
		return driverName;
		
	}

}
