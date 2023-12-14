package javabook2.ch05.array;

public class ArrayInArray2 {

	public static void main(String[] args) {
		// 2차원 배열 생성
		// 타입[][] 변수명 = new 타입[길이1][길이2];
		
		
		// 2*3 데이터 저장가능
		int [][] iArr1 = new int[2][3];
		iArr1[0][0] = 10;
//		iArr1[0][1] = 20;
		iArr1[0][2] = 30;	
		
//		System.out.println(iArr1[0][0]);
//		System.out.println(iArr1[0][1]);
//		System.out.println(iArr1[0][2]);
		
		// 위 내용을 for문으로 작성
		for(int i = 0; i<3;i++) {
			System.out.println(iArr1[0][i]);
		}
		
		iArr1[1][0] = 40;
		iArr1[1][1] = 50;
		iArr1[1][2] = 60;	
		
//		System.out.println(iArr1[1][0]);
//		System.out.println(iArr1[1][1]);
//		System.out.println(iArr1[1][2]);
		
		System.out.println("================================");
		// 위 내용을 for문으로 작성
		for(int i = 0; i<3;i++) {
			System.out.println(iArr1[1][i]);
		}
		
		System.out.println("================================");
		for(int i=0;i<2; i++) {
			for(int j=0;j<3; j++) {
				System.out.println(iArr1[i][j]);
			}
		}
		
	}
}