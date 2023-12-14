package javabook2.ch05.EnumExample;

public class WeekExample {

	public static void main(String[] args) {
		// 열거(enum) 타입
		// 타입 변수명
		int num;
		num = 30;
		
		Week today = null;
		today = Week.WEDNESDAY;
		
		Week yesterday;
		yesterday = Week.yesterday;
		
	}

}
