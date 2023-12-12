package javabook2.ch02;


public class Constants {

	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGHED;
		
		CONST_ASSIGHED = 12;	// 할당하지 않았던 상수의 값 할당
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGHED);
		
		// 초기화 = 처음으로 값을 할당
		// final(상수)는 기본적으로 상수명을 대문자로 한다.
		// 합성어 같은 경우는 스네이크(snake) 표기법
		final int NUM_COUNT = 100;
		
		// BooleanCount 같이 중간중간 대문자로 표기하는 방법 : camel 표기법
		
		
	}
}
