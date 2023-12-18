package javabook2.ch06.sec13;

public class B {
	// 필드
	A a1 = new A();
	
	// 생성자
	public B() {
		A a = new A();
		
		System.out.println(a.field1);
		
		a.method1();
	}
	
	// 메서드
	
}
