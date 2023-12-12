package javabook2.ch03;

public class AssignmentOperator {

	public static void main(String[] args) {
		// 이항연산자 => [복합]대입연산자
		int result = 0;
		
//		변수 += 값;
		result += 10;		// result = result + 10
		System.out.println(result); 
		
//		변수 -= 값;
		result -= 5; 
		System.out.println(result); 
		
//		변수 *= 값;
		result *= 3;
		System.out.println(result); 
		
//		변수 /= 값;
		result /= 5;
		System.out.println(result); 
		
//		변수 %= 값;
		result %= 3;
		System.out.println(result); 
		
		
	}

}
