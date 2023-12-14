package javabook1.array;

public class ArrayForEachDemo {

	public static void main(String[] args) {
		// 문제 1 : 다음 표시된 국가를 저장하는 배열을 생성하시오
		// 국가 : 미국, 일본, 호주, 홍콩
		String[] countries = {"미국", "일본", "호주", "홍콩"};
		
		// 문제 2 : 앞서 생성한 배열에서 '호주'만 찾아 출력하시오.
		System.out.println(countries[2]);
		
		for(String area : countries) {
			switch (area) {
			case "호주":
				System.out.println("호주");
				break;
			default:
				break;
			}
		}
		System.out.println("====================================");
		
		// 문제 3 : 앞서 생성한 배열의 내용 전체를 출력하시오.(향상된 for문 사용)
		for(String area2:countries) {
			System.out.println(area2);
		}
		
		System.out.println("====================================");
		
		// 문제 4 : 각 국가 별 금일 환율을 저장하는 배열을 생성하시오.
		String[][] ExchangeRate = {
				{"미국", "1295.10"},
				{"일본", "913.10"},
				{"호주", "869.40"},
				{"홍콩", "165.84"}
		};
		
		for(String rate : ExchangeRate[0]) {
			System.out.print(rate+" ");
		}
		System.out.println();
		System.out.println("====================================");
		for(String rate : ExchangeRate[1]) {
			System.out.print(rate+" ");
		}
		System.out.println();
		System.out.println("====================================");
		for(String rate : ExchangeRate[2]) {
			System.out.print(rate+" ");
		}
		System.out.println();
		System.out.println("====================================");
		for(String rate : ExchangeRate[3]) {
			System.out.print(rate+" ");
		}
		
		
	}

}
