package javabook2.ch06.sec10;

public class Television {
	// 필드
	static String company = "Samsung";
	static String model = "LCD";
	static int info = 1234;
	
	// 시러얼 넘버를 만들어 본다.
	// 예 ) SamsungLCD-1234
	static String serialNum = company+model+"-"+info;
	
	
	// 정적 필드
	
	static {
		serialNum = company+model+"-"+info;
	}
}
