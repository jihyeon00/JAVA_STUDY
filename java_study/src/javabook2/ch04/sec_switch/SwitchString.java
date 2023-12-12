package javabook2.ch04.sec_switch;

public class SwitchString {

	public static void main(String[] args) {
		
		// 문제 : 회사의 직급에 따라 급여 차이를 표시하는 프로그램 작성
		String position = "이사";
		
		switch(position){
		
			case "사원" :
				System.out.println("200만원");
				break;
				
			case "대리" :
				System.out.println("300만원");
				break;
				// System.out.println("300만원");  
				// break 밑에 코드 작성시 Unreachable code라는 오류가 뜬다. 
				
			case "과장" :
				System.out.println("400만원");
				break;
				
			case "차장" :
				System.out.println("500만원");
				break;
				
			case "부장" :
				System.out.println("600만원");
				break;
			default :	// case에 없는 경우 기본값 실행
				System.out.println("1000만원");
				break; 	// default는 break가 필수가 아니다. 하지만 적어주는 것이 좋다.
				
		}
		
	}

}
