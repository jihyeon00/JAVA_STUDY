package javabook2.ch06.sec10;

public class Community {

	public static void main(String[] args) {

		Korean kim = new Korean("870913-1234567");	// kim씨 탄생
		System.out.println("국적 : "+ kim.nation);
		
		// kim.nation = "영국";		// 재할당 불가
		System.out.println(kim.ssn);
//		kim.ssn="870913-1234568";	// 재할당 불가
	
//		Korean lee = new Korean("870914-1234568");
		javabook2.ch06.sec10.Korean lee = new javabook2.ch06.sec10.Korean("870914-1234567");
		
		javabook2.ch06.sec08.Calculator myCal = new javabook2.ch06.sec08.Calculator();
		myCal.powerOn();
		myCal.powerOff();
	
	}

}
