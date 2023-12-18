package javabook2.ch06.sec06;

// 생성자가 존재는 하나 작성된 상태는 X
public class Car {
	
	// 필드
//	String company = "기아";
//	String model = "카니발";
	String company;
	String model;
	int year;
	
	// 생성자
	// [필드]초기화 목적의 생성자 선언
	public Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	// 아래 내용을 사용하지 못하는 이유는 같은 타입과 같은 생성자 이름으로
	// 또 생성하여 초기화를 할 수 없기 때문에 위와 같이 한번에 사용해준다.
//	public Car(String model){
//		this.model = model;
//	}
	public Car(String company){
		this.company = company;
	}
	public Car(int year){
		this.year = year;
	}
}
