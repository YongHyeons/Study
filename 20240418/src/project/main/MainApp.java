package project.main;

import java.util.Scanner;

import project.main.classes.Books;
public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Method b = new Method();
//		// 실체는 꼭 필수
		
//		b.Name(1,3,1.3f,"홍길동");
//		
//		b.PlusShow(5, 7);
//		
//		System.out.println(b.Plus(3, 4));
//		int c = b.Plus(3, 4);
//		System.out.println(c);
		
//		project.main.classes.Math a = new project.main.classes.Math();
//		System.out.println(a.Factorial(5));
//		System.out.println(a.Square(2, 10));
		
//		Book book = new Book();
//		book.name = "어린왕자";
//		book.author = "생텍쥐베리";
//		book.price = 4500;
		
//		book.InsertBook("어린왕자", "생텍쥐베리", 4500);
//		book.ShowBook(/* book */);
		
		/*
		 * User 클래스 제작
		 * ID, PW, NAME 정보 저장
		 * ID, PW, NAME 정보 입력 메서드 추가
		 * ID, NAME 출력 메서드 추가
		 * PW를 입력시 클래스의 PW와 동일한지 비교하는 메서드 추가
		 */
//		User user = new User();
//		user.InsertInfo(scan.next(), scan.next(), scan.next());
//		user.PrintUser();
//		System.out.println(user.PW_Check(scan.next()));
		
//		System.out.println(project.main.classes.Math.Square(2, 10));
//		project.main.classes.Math a = new project.main.classes.Math();
//		System.out.println(a.Square(2, 10));
//		System.out.println(a.Square(2));
		
//		System.out.println(Comparer.Big(new int[]{1,2,3,4,5}));
//		System.out.println(Comparer.Big(1,2,3,4,5));
		
		/*
		 * 어제 만들었던 책 관리 프로그램
		 * 1. 책 추가 2. 책 수정 3. 종료
		 * 책은 이름, 작가, 가격을 가짐
		 * 수정은 책 이름으로 검색 후 가격만 수정 가능
		 * 책 출력시 지금까지 입력한 모든 책을 출력
		 * 책 출력시 가장 높은 가격과 가장 낮은 가격의 책도 출력
		 * 책은 최대 10권까지 입력 가능
		 */
		
//		Book[] books = {null,null,null,null,null,null,null,null,null,null,};
//		while(true) {
//			System.out.println("1. 책 추가 2. 책 수정 3. 종료");
//			for(int i = 0; i<10; i++) {
//				if(books[i] == null) {
//					books[i] = new Book();
//					books[i].BookPlus(scan.next(), scan.next(), scan.nextInt());
//					break;
//				}
//			}
//			for(Book book : books) {
//				book.PriceChange(scan.nextInt());
//			}
//		}
		Books books = new Books();
		while(true) {
			System.out.println("1. 책 추가 2. 책 수정 3. 책 출력 4. 종료");
			int input = scan.nextInt();
			if(input == 4) break;
			else if(input == 1) {
				System.out.print("책 이름 >> ");
				String name = scan.next();
				System.out.print("책 저자 >> ");
				String author = scan.next();
				System.out.print("책 가격 >> ");
				int price = scan.nextInt();
				books.newBook(name, author, price);
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
