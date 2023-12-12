package javabook2.ch03;

public class ConditionalOperation {

	public static void main(String[] args) {
		// 삼항연산자
		// 조건 ? 값1 : 값2
		
		int score = 95;
		char grade = (score>90) ? 'A' : 'B';
		
		System.out.println("등급 : "+grade);
	}

}
