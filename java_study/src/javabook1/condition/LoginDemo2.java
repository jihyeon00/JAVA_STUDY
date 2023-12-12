package javabook1.condition;

import java.util.Scanner;

public class LoginDemo2 {
	public static void main(String[] args) {
		
		/*
		// Scanner을 이용하여 로그인을 확인한다.
		Scanner sc = new Scanner(System.in);
		
		String id = "jihyeon";
		String input_id;
		
		System.out.println("아이디를 입력하세요.");
		input_id = sc.nextLine();
		
		if(input_id.equals("jihyeon")) {
			System.out.println( id + " 으로 로그인 되었습니다.");
		} else {
			System.out.println("아이디가 틀렸습니다. 다시 입력해주세요.");
		}
		
		sc.close();
		*/
		
		// 교수님 풀이
		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("아이디를 입력하시오: ");
		// 입력 받는 소스 코드 작성
		String id = sc.nextLine();
		System.out.println("입력된 아이디 : " + id);
		
		sc.close();

		String DB_id = "kenneth";		// DB 저장된 id
		
		// 만약, ID가 jihyeon이면 로그인 성공
		// 그렇지 않으면 로그인 실패 표시
		System.out.println(DB_id.equals(id));
		
		if(DB_id.equals(id)) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}
}
