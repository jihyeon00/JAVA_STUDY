package javabook2.ch05.array.copy;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] oldIntArr = {1,2,3};		// 값 목록으로 배열 생성
		int[] newIntArr = new int[5];	// new 연산자 배열 생성 0 0 0 0 0
		
		for(int i=0;i<newIntArr.length;i++) {
			System.out.print(newIntArr[i] + " ");
		}
		System.out.println();
		
		// arraycopy(이전배열, 위치, 새배열, 위치, 복사길이)
		System.arraycopy(oldIntArr, 0, newIntArr, 0, oldIntArr.length-1);

		for(int i=0;i<newIntArr.length;i++) {
			System.out.print(newIntArr[i] + " ");
		}
	}

}
