package javabook2.ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar;
		myCar = new Car("현대", "카니발");
		
		// 외부 클래스에서 별도의 필드값 지정
//		myCar.company = "현대";	// 필드 초기화
//		myCar.model = "SUV";	// 필드 초기화
		
		System.out.println("myCar");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		
		
		Car broCar;
		broCar = new Car("현대");
		
		System.out.println("broCar");
		System.out.println(broCar.company);
		System.out.println(broCar.model);
		
		
		Car momCar;
		momCar = new Car(2010);
		System.out.println(momCar.year);
		
	}

}
