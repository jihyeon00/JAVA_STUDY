package javabook2.ch02;

public class Promotion {

	public static void main(String[] args) {
		// 자동형변환(Promotion) = 묵시적형변환
		byte byteVal = 3;
		System.out.println(byteVal);
		// 큰타입 = 작은타입
		int intVal = byteVal;	// int <= byte
		System.out.println(intVal);
		
		// 강제형변환(Casting) = 명시적형변환
		int intVal1 = 44032;
		System.out.println(intVal1);
		// 작은타입 = 큰타입
		char charVal = (char)intVal1;	// char <= int
		System.out.println(charVal);
		short shortVal = (short)intVal1;	// short <= int
		System.out.println(shortVal);		// 형변환을 했지만 범위보다 큰 수의 경우
											// 데이터 손실로 인해 값이 보장되지 않는다.
	
	}

}
