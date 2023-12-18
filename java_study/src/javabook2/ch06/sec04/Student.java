package javabook2.ch06.sec04;

public class Student {

	
	// 1. 필드(속성, 변수)
	//	타입 필드명;
	//	타입 필드명 = 초기값;
	// String name;
	 String name = "강호동";
	 int age = 56;
	 boolean man = false;
	
	// 2. 생성자 : 클래스에 반드시 만들어야 한다.
	 // !주의사항 : 사용자 생성자를 만든 경우, 기본 생성자를 생략할 수 없다.
	 // 형태 1만 사용할 경우 생략 가능하지만, 형태2를 만들었을 경우 형태 1을 만들어주어야한다.
//	 Student(타입 값1, 타입 값2) {
//		 실행문;
//	 }
	 
	 // 형태 1 : 기본 생성자 (생략 가능) : 입력x, 내용x
	 Student(){
	}
	 // 형태 2 : 사용자 생성자 (생략 불가) : 입력(선택), 내용o
	 // 
	 Student(String name) {
		 System.out.println(name);
		 // 메소드 사용 방법 : 메소드명(값1, 값2)
		 study1();				// 메소드 호출(사용)
		 study2("국어");
		 study3("수학");
	 }
	 
	
	// 3. 메소드(기능, 함수)
	// 생성자와 다른 점 : 메소드명 앞에 타입이 있다.
//	타입 메소드명(타입 값1, 타입 값2) {
//	}
	 // 형태1 : 입력x, 반환x
	 // 기능 : 기능의 설명을 출력하다.
	 void study1() {
		 System.out.println("나이가 " + age + "세인");
		 System.out.println("내년 나이가 " + age+1 + "세인");
		 System.out.println(name + "이 공부하다.");
	 }
	 
	 // 형태2 : 입력o, 반환x
	// 기능 : 어떤 과목을 공부하는지 출력하고 과목을 반환한다.
		 // 입력 : 과목
	 void study2(String subject) {
	 }
	 
	 // 형태3 : 입력o, 반환o
	 // 기능 : 어떤 과목을 공부하는지 출력하고 과목을 반환한다.
	 // 입력 : 과목
	 // 반환 : 과목
	 String study3(String subject) {
		 System.out.println(subject + "공부하다.");
		 return subject;
	 }
	
}
