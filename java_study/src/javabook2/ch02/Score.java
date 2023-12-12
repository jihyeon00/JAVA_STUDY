package javabook2.ch02;

public class Score {
	public static void main(String[] args) {

		int kor = 65;
		int eng = 70;
		int math = 66;
		
		int sum = kor + eng + math ;
		
		double avg = sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 원의 반지름 5, 원넓이 구하시오
		// 방법1
		double pi = 3.14;
		int r = 5;
		
		double circle = pi * r * r;
		
		System.out.println("원넓이 : " + circle);
		
		// 방법2
		double circle2 = r * r * Math.PI;
		
		System.out.println("원넓이 : " + circle2);
		
		
		
	}
}
