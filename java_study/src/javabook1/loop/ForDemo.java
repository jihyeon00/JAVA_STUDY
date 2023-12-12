package javabook1.loop;

public class ForDemo {

	public static void main(String[] args) {
		// 문제 : 다음과 같이 출력되는 프로그램을 작성 하시오. (for문 사용)
		// 출력 결과 : 
		/*
		Coding Everybody 3
		Coding Everybody 6
		Coding Everybody 9
		Coding Everybody 12
		*/
		
		//방법1 (내풀이)
		for(int i=1;i<=4; i++) {
			System.out.println("Coding Everybody " + 3*i);
		}
		
		//방법2 (시연이풀이)
		for(int i=1;i<14;i++) {
	         if(i%3==0) {
	            System.out.println("Coding Everybody " + i);
	         }
	    }
		// 방법3 (교수님풀이)
		for(int i=3;i<=13; i=i+3) {
			System.out.print("Coding Everybody ");
			System.out.println(i);
//			System.out.println("Coding Everybody "+ i);
		}
		
		
	}
	

}
