package javabook2.ch03;

public class IncDecOperator {

	public static void main(String[] args) {
		// 증감 연산자
//		++값 => 값 + 1
//		--값 => 값 - 1
//		값++ => 타연산 수행 후, 값 + 1
//		값-- => 타연산 수행 후, 값 - 1
		
		int x1 = 10;
		int y1 = 10;
		int z1;
		
		System.out.println("x1=" + x1);
		System.out.println("y1=" + y1);
		
		System.out.println("----------------------------");
		
		// z1 = ++x1; 	// z1 = x1 + 1
		z1 = x1++; 		// z1에 x1을 대입하여 출력한 후 +1 된다. 
		
		System.out.println("z1=" + z1);
		
		// z1 = --y1; 	// z1 = y1 - 1
		z1 = y1--; 		// z1에 y1을 대입하여 출력한 후 -1 된다.
		System.out.println("z1=" + z1);
		
//		x1++;
//		y1--;

		System.out.println("----------------------------");
		
		System.out.println("x1=" + x1);
		System.out.println("y1=" + y1);
		
		
		
	}

}
