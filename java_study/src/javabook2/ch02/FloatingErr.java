package javabook2.ch02;

public class FloatingErr {

	public static void main(String[] args) {
		// 부동 소수점(floating point) 방식 오차
		// : 가수부와 지수부로 나누어 표현
		// 고정 소수점(fixed point) 방식
		// : 소수부의 자릿수를 미리 정하여, 고정된 자리수의 소수를 표현
		
		
		// 1. 연산 문제(2진수 표현 문제)
		// 실수 또한 이진수로 표현되므로
		// 가수부가 1/2^n 형태로 표현되는 경우만 오차없이 정확하게 값이 계산
		double d1 = 0.1;
		double d2;
		d2 = d1 + 0.1;
		System.out.println(d2);		// 0.2
		d2 = d2 + 0.1;
		System.out.println(d2);		// 0.3 이 아닌 0.30000000000000004
		
		// 2. 범위 문제
		// float 형은 소수점 6번째 자리까지 정확하게 표현 가능(그 이상은 부정확)
		// double 형은 소수점 15번째 자리까지 오차없이 표현가능(그 이상은 오차 발생)
		float f1 = 1.23456789f;
		double d3 = 1.23456789;

		System.out.println(f1);		// 
		System.out.println(d3);		// 
		
	}

}
