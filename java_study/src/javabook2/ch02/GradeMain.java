package javabook2.ch02;


public class GradeMain {

	public static void main(String[] args) {
		// 국어 90, 수학 70, 영어 60 총점을 출력하시오
		int korean = 90;
		int math = 70;
		int english = 60;
		int result = korean + math + english;
		
		// result = korean + math + english;
		
		System.out.println(result);
		
		// 교수님 풀이
		int kor, eng, math1;
		int total; 
		
		kor = 90;
		eng = 60;
		math1 = 70;
		
		total = kor + eng + math1;
		
		System.out.println("총점 : "+ total);
		
	}

}
