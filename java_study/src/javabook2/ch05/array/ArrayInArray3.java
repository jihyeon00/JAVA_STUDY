package javabook2.ch05.array;

public class ArrayInArray3 {

	public static void main(String[] args) {
		// 문제 : 다차원 배열을 선언하세요.
		// 타입 [][] 변수 = new 타입[길이1][길이2]
		
		// 1차원 배열
		String[] book = {"이것은자바다","오라클SQL","HTML&CSS"};
		
		// 2차원 배열
		String[][] book1 = {
				{"이것은자바다", "오라클SQL", "HTML&CSS"},
				{"한빛","길벗","한빛"},
				{"자바","SQL","HTML"}
		};
		
		int[][] iArr2 = new int[4][5];
		String [][] sArr2 = new String[2][3];
		
		// 문제 : 1차원 배열 선언하시오.(new 연산자 사용)
		int[] a = new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		
		// 문제 : 2차원 배열에 할당된 데이터를 출력하시오.(for문 사용)
		for(int i=0;i<book1.length;i++) {
			for(int j=0;j<book1[i].length;j++) {
				System.out.print(book1[i][j]+ " ");
			}
		}
		
		
	}

}
