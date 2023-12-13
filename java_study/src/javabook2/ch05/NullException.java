package javabook2.ch05;

public class NullException {

	public static void main(String[] args) {
		// null 값으로 초기화
		String str1; // 선언 가능
		String str2 = null;

//		System.out.println(str1);	// 1. 초기화 안한 참조변수는 사용 불가
		System.out.println(str2); 	// null로 초기화한 참조변수는 사용 가능

//		int a = 1;
//		int b = 1;
//		int c = 1;
//		int d = 1;
//		int e = 1;

		// 배열(Array) : 참조 타입 변수
		// 타입[] 변수명 = {값1, 값2, ...} // 배열 변수 선언+할당
		// 변수명[index] : 값을 하나만 꺼내서 사용.
		// 인덱스(index) : 특정 값을 가리키는 정수.
		int[] a = { 2, 1, 5, 4, 3 };

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		int c;
		c = 10;

		// 2. null 값으로 초기화한 배열 객체에 값을 할당 불가
		int[] b = null;
//		b[0] = 10;			// 예외 발생
		
		// 3. null 값으로 초기화한 객체의 값을 사용 불가
		String str3 = null;
		System.out.println("문자열 길이 : " + str3.length());
		
//		변수명.length();		// 문자열 길이 반환 함수
		String str4 = "abc";
		System.out.println("문자열 길이 : " + str4.length());
	}
}
