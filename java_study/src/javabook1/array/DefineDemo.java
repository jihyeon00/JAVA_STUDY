package javabook1.array;

public class DefineDemo {

	public static void main(String[] args) {
		// 문제 1 : 프로젝트 팀원의 이름을 저장하는 배열을 생성하시오.
		String[] timeMember = {"배지현", "박지평"};
		
		// 문제 2 : 프로젝트 팀원의 이름을 저장한 배열을 출력하시오. (for문 사용)
		for(int i=0;i<timeMember.length;i++) {
			System.out.println(timeMember[i]);
		}
		
		// 문제 3 : 프로젝트 팀원의 이름과 성별을 저장하는 배열을 생성하시오.
		String [][] timeDetail1 = {
				{"배지현", "여성"},
				{"박지평","남성"}
		};
		
		String [][] timeDetail2 = new String[2][2];
		timeDetail2[0][0]="배지현";
		timeDetail2[0][1]="여성";
		timeDetail2[1][0]="박지평";
		timeDetail2[1][1]="남성";
		
		// 문제 4 : 프로젝트 팀원을 저장한 배열에서 자신의 이름만 출력하시오.
		for(int i=0;i<timeDetail1.length;i++) {
			for(int j=0;j<timeDetail1[i].length;j++) {
				System.out.println(timeDetail1[i][j]);
			}
		}
		
	}

}
