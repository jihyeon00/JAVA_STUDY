package javabook2.ch04.sec_if;

// Nested : 중첩된
public class IfNested {
	public static void main(String[] args) {
		
		int num = 1;
		
		if(num==1) {				// true
			System.out.println("1");	
			if(num==2) {			// false
				int num1 =3;
				System.out.println("2");
			} else if (num==1) {	// false
				System.out.println("3");
//				System.out.println("num1:"+ num1); 	
			}
			System.out.println("4"); 	// 출력
			System.out.println("num:"+num); 	
		} else {
			System.out.println("num:"+num); // 출력 안됨
		}
		/*
		if(num==1) {
			
			if(num==1) {
				// 변수 선언 시 조건문 내에 있다면
				// 위치에 따라 변수를 사용할 수 있거나 사용할 수 없다.
				int num1 =3;		// 변수 초기화
				System.out.println("num1:"+ num1); 	
				
			} else if (num==1) {	// false
				// System.out.println("num1:"+ num1); 	
			}
		}
		*/
		
	}
}
