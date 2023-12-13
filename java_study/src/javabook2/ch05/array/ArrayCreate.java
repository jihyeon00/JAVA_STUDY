package javabook2.ch05.array;

public class ArrayCreate {
	public static void main(String[] args) {
		
		int[] iArr1;		// 배열 선언 1
		int iArr2[];		// 배열 선언 2
		
		String[] sArr1 = null;					// 1. null 초기화
		String sArr2[] = {"홍길동", "임꺽정"};  // 2. 값으로 초기화
		
		
		// 3. new 연산자 초기화
		// 타입[] 변수명 = new 타입[길이];
		int [] iArr3 = new int[2];		// 배열 선언
		System.out.println(iArr3[0]);
		System.out.println(iArr3[1]);
		System.out.println("=============================");
		
		iArr3[0]=10;					// 배열 값 할당
		iArr3[1]=20;
//		iArr3[2]=30;
		System.out.println(iArr3[0]);
		System.out.println(iArr3[1]);
		
		printName(); // 함수 호출 (사용)
 	}
	
	
	// void : 반환(리턴) 값이 없음.
	public static void printName() {
		System.out.println("입력도 없고, 출력(반환)도 없는 함수입니다.");
	}
	
	/*	
	// ★★★ 메서드 선언
	// public static 리턴타입 메서드명 (){
	// 		[return 값;]
	// }
	
	// void : 반환(리턴) 값이 없음.
	public static void printName() {
		return 값;
	}
	
	// 함수 형태1 : 입력x, 반환x
	void add() {
		System.out.println("더하기");
	}
	
	// 함수 형태2 : 입력o, 반환x
	void sum(int a, int b) {
		System.out.println("a 더하기 b");
	}
	
	// 함수 형태3 : 입력p, 반환o
	int avg(int a, int b) {
		System.out.println("a와 b의 평균");
		return (a+b)/2;
	}
	*/
	
	
}
