package javabook2.ch04.sec_while;

public class WhileStatement {

	public static void main(String[] args) {
		// while 문
		// 문제 : 숫자를 0부터 9까지 출력하시오.
		
		System.out.println("1. For문 사용하지 않고 작성");
		System.out.println(0);
		System.out.println(1);			
		System.out.println(2);			
		System.out.println(3);			
		System.out.println(4);			
		System.out.println(5);			
		System.out.println(6);			
		System.out.println(7);			
		System.out.println(8);			
		System.out.println(9);	
		
		System.out.println("2. For문 사용하여 작성");
		for(int i=0; i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("3. break를 사용해서 0~7까지 출력하도록 수정하기");
		
		/*
		 해석 : 변수 i를 0부터 시작하여 10보다 작을 때까지 1씩 증가하면서 i를 출력
		 문제 : 7 까지는 정상적으로 출력하다가 8,9는 건너뛰고 싶음 => 분기문(조건문)
		 		=> if(만약 조건식이 참/거짓이라면,)
		 		=> 만약, 7을 만났다면 멈춰라. (건너뛰어라)
		*/	
		
		// 방법1(switch문)
		for(int i=0; i<10;i++) {
			switch (i) {
				case 8:
				case 9:
					break;
				default:
					System.out.println(i);
			}
		}
		
		// 방법2(if문) : 수하언니 풀이 = 교수님 풀이
		System.out.println("==============");
	      for(int i=0; i<10; i++) {
	          System.out.println(i);
	          if(i==7) {
	             break;
	          }
	       }
	      System.out.println("while 문 ==============");
		
	      // 방법3(while문)
	      
	      int i=0;
	      while(i<10) {
	    	  System.out.println(i);
	    	  i++;		// 반복 종료 코드 => 증감식;
	      }
	      
	      // 문제 : break를 사용하여 0부터 5까지 출력
	      while(i<10) {
	    	  System.out.println(i);
	    	  i++;		// 반복 종료 코드 => 증감식;
	    	  if(i==6) {
	    		  break;
	    	  }
	      }
	      
	}

}
