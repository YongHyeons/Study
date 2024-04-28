package project.main;

import project.main.classes.*;

// 동일한 동작인데 약간 다른경우

public class MainApp {

	public static void main(String[] args) {
//		User a = new User("1234","1234");
//		SellerUser b = new SellerUser("1234","1234","1234");
//		
//		// 오버 라이딩
//		// this 변수의 자료형에 따라 불릴 메서드를 고르는것
//		a.Sale();
//		// b.SuperSale();
//		b.Sale(30);
		
		// 외부에서 기본 클래스의 오버 라이딩된 메서드를 호출하는 방법은 없다

//		IP4 a = new IP4("아이피1");
//		IP6 b = new IP6("아이피2");
//		a.Show();
//		b.Show();
		
		// 확장된 클래스들을 이용하면 -> 유지보수에 매우 편리하다
		
		// 일반 웹사이트, 블로그, 쇼핑몰, 위키사전 을 구분하는 클래스들 작성
		// 일반 웹사이트	=> url
		// 블로그			=> url, 일일방문객수
		// 쇼핑몰			=> url, 일일방문객수, 매출
		// 위키사전		=> url, 정보
		
		// 최상위 확장 때문에 생긴것들
		// WebSite a = new WebSite();
		
		// boxing, unboxing -> 박싱, 언박싱 -> 업캐스팅, 다운캐스팅

//		User a = new User("A","B");
//		SellerUser b = new SellerUser("A","B","C");
//		
//		// 확장된 클래스를 기본 클래스 변수에 넣는것
//		// 내가 가지고 있는 정보를 숨기겠어 -> 박싱, 업캐스팅
//		User[] c = {a, b};
//		for(User d : c) {
//			d.Sale();
//		}
//		((SellerUser)c[1]).SellerSale();
		
		// 도서 관리 프로그램
		// 1. 책 추가 2. 책 수정 3. 책 출력 4. 종료
		// 책 추가시 장르 선정
		// 로맨스, 미스터리, 수필, 자기계발 등
		// 선정된 장르로 출력시 장르도 출력되도록
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Books books = new Books();
		while(true) {
			System.out.print("1. 책 추가 2. 책 수정 3. 책 출력 4. 종료 >> ");
			int input = scan.nextInt();
			if(input == 4) break;
			else if(input == 1) {
				System.out.print("책 이름 >> ");
				String name = scan.next();
				System.out.print("책 저자 >> ");
				String author = scan.next();
				System.out.print("책 가격 >> ");
				int price = scan.nextInt();
				System.out.println("1.로맨스 2. 미스터리 3. 수필 4. 자기계발");
				int type = scan.nextInt();
				books.NewBook(name, author, price, type);
			}
			else if(input == 2) {
				System.out.print("책 이름 >> ");
				String name = scan.next();
				System.out.print("책 가격 >> ");
				int price = scan.nextInt();
				books.UpdateBook(name, price);
			}
			else if(input == 3) {
				books.ShowBookAll();
				System.out.println("=====비싼 책=====");
				books.ExpensiveBook().ShowBook();
				System.out.println("=====값싼 책=====");
				books.CheapBook().ShowBook();
			}
		}
		
	}

}



















