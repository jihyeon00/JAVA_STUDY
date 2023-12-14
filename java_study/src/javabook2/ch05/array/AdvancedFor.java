package javabook2.ch05.array;

public class AdvancedFor {

	public static void main(String[] args) {
		// 향상된 for문
//		for(타입 변수 : 배열) {
//			실행문;
//		}
		int[] scores = { 96, 71, 84, 93, 87 };
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
		
		String[] travelAreas = {"제주도","부산","여수","독도","울릉도"};
		for(String area: travelAreas) {
			System.out.print("\n"+area);
		}
		
	
		
		
	
	
	}

}
