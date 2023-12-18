package javabook2.ch06.sec13;

public class A {
	
	
	// 필드
	// int field1와 private int field1 으로 
	// 했을 경우 B에서 참조 불가능
//	int field1;
//	private int field1;
	public int field1;
	
	// 생성자
	// A() {}와 private A(){} 으로 했을 경우 
	// B에서 참조 불가능
	// private A() {}
	public A() {}
	
	// 메서드
	// void method1() {}와
	// private void method1() {} 으로 했을 경우 B에서 참조 불가능
	// private void method1() {}
	public void method1() {
	
	}
		
}
