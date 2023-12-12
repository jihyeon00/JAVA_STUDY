package javabook2.ch02;

public class OperationsPromotion {

	public static void main(String[] args) {
		// 자동형변환 연산
		// 1. 정수 연산의 경우, int 타입으로 수행
		int intVal1 = 10;
		byte byteVal = 5;
		
		// (int) = (int) + (byte)
		// int result1 = intVal1 + byteVal;
		byte result1 = (byte)(intVal1 + byteVal);
		// (int) = (int) + (int)
		System.out.println(result1);

		System.out.println("===========================");
		
		// 2. 같은 타입의 피연산자 간에만 연산 가능
		// - 만약, 서로 다른 타입의 피연산자 간의 연산 수행 시, 큰 타입으로 자동 변환
		int intVal2 = 10;
		double doubleVal = 5.5;
		
		// (double) = (int) + (double)
		// double result2 = intVal2 + doubleVal;
		// (double) = (double) + (double)
		double result2 = (int)(intVal2 + doubleVal);
		System.out.println(result2);

	}

}
