package javabook1.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// 문제 : 다음과 같이 출력되는 프로그램을 작성 하시오. (break문 사용)
		// 출력 결과 : 
//		Coding Everybody 3
//		Coding Everybody 6
//		Coding Everybody 9
		for(int i=1;i<=4; i++) {
			if(i==4) {
				break;
			}
			System.out.println("Coding Everybody " + 3*i);
		}
		
		// 교수님풀이
		for(int i=3;i<=13; i=i+3) {
			if(i==12) {
				break;
			}
			System.out.println("Coding Everybody "+ i);
		}
	}

}
