package javabook1.condition;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// 로그인 확인 : 아이디 / 비밀번호
		
		String id = "jihyeon";
		
		// 만약, ID가 jihyeon이면 로그인 성공
		// 그렇지 않으면 로그인 실패 표시
		// 문자열 동등표시는 == 으로 사용해야 한다.
		/*
		if(id == "jihyeon") { 
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		*/
		
		if(id.equals("jihyeon")) { 
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}

}
