package javabook2.ch02;

public class Char {

	public static void main(String[] args) {
		
		char ch1 = '헐';	// 문자저장
		char ch2 = '확';	// 문자저장
		char ch3 = 54736;	// 문자 '헐'의 유니코드 값
		char ch4 = 54869;	// 문자 '확'의 유니코드 값
		char ch5 = 0xD5D0;	// 16진수 0xD5D0와 매핑되는 문자 'ch5'
		char ch6 = 0xD655;	// 16진수 0xD655와 매핑되는 문자 'ch6'
		System.out.println(ch1 + " " + ch2); 
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		
	}
}
