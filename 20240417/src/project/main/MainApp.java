package project.main;

import java.util.Scanner;

import project.main.classes.GUI;
import project.main.sub1.Book;

// 많은 설명서중 누구를 쓸지 선택해야 하다 보니까
// 설명서중 1개는(무조건) 파일명과 동일한 이름을 가져야 한다
public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 배열만으로는 부족하다
		// 배열처럼 동일한 형태의 변수를 묶는것이 아니라 연관성이 있는 변수끼리 묶어준다면 좋겠다
		// 연관성이 있는 변수를 묶어내는 설명서 -> class
		// class란 무언가 실체가 있는것이 아니라 실체를 설명할 수 있는 모양을 의미한다.
		// class라는 설명서를 실제로 이용해서 변수를 만든다면 -> 주소변수 타입(여러개짜리 묶음)
		// class라는걸 이용하기 위해서는 new
//		Board board = new Board();
//		Board board2 = new Board();
		
		// 객체(연관성이 있는 정보의 묶음)
		
//		project.main.sub1.Board a = new Board();
		
		// 실체가 있는 class안에 변수의 이름을 적으면 선택이 가능하다 -> field, property
		// 실체가 들어있는 class 변수 이름.모양 변수 이름
		// public, private, protected, default -> 접근 지정자
		// public      - 내부, 외부, 외부(확장), 동일 패키지(같은 폴더), 외부 패키지(다른 폴더)
		// protected   - 내부,      외부(확장), 동일 패키지(같은 폴더), 외부 패키지(다른 폴더)
		// default     - 내부, 외부, 외부(확장), 동일 패키지(같은 폴더)
		// private     - 내부
//		a.view = 5;
//		
//		Book book = new Book();
//		book.name = "어린왕자";
//		book.author = "생텍쥐베리";
//		book.price = 4500;
//		
//		Book[] books = new Book[5];
//		
//		System.out.println(book.name);
//		System.out.println(book.author);
//		System.out.println(book.price);
		
		/*
		 * 웹사이트의 방문 유저를 확인하기 위한 관련 정보 클래스 제작
		 * 방문 유저의 이름, 성별, 접속 경로를 저장
		 * 방문 유저를 2명 입력하고 출력해보기
		 */
//		WebsiteVisitUser[] users = new WebsiteVisitUser[2];
		
//		users[0] = new WebsiteVisitUser();
//		users[1] = new WebsiteVisitUser();
//		
//		for(WebsiteVisitUser user : users) {
//			user.name = scan.next();
//			user.gender = scan.next();
//			user.url = scan.next();
//		}
//		
//		for(WebsiteVisitUser user : users) {
//			System.out.println(user.name);
//			System.out.println(user.gender);
//			System.out.println(user.url);
//		}
		
		// 주소 타입 변수에서 비어있음을 표현하기 위해 만들어진 아주 특별한 값
//		WebsiteVisitUser a = null; // 의미없는, 비어있는
		
		// 주소변수 안에 주소변수
		
		/*
		 * 직업 클래스 생성
		 * 직업은 직업명, 소득 두가지 정보 존재
		 * 소득 클래스 생성
		 * 소득은 주기(시간단위), 획득액(원 단위), 두가지 정보 존재
		 * 만들고 입력 후 출력
		 */
//		Job job = new Job();
//		job.job_name = scan.next();
//		job.income = new Income();
//		job.income.cycle = scan.nextInt();
//		job.income.pay = scan.nextInt();
//		
//		System.out.println(job.job_name);
//		System.out.println(job.income.cycle + "시간");
//		System.out.println(job.income.pay + "원");
//		
		// static을 사용한 LowLimitPay
//		Income.lowLimitPay = 4000;
//		
//		Income a = new Income();
//		a.lowLimitPay = 5000;
//		Income b = new Income();
//		System.out.println(b.lowLimitPay);
		
		/*
		 * 간단한 GUI 구성 프로그램
		 * GUI -> Graphic User Interface
		 * Hp, Mp, 이름 -> 1개
		 * 입력으로 체력을 변화시키다가 체력이 0보다 작아지면 종료
		 */
//		GUI gui = new GUI();
//		gui.name = "홍길동";
//		gui.hp.max = 10;
//		gui.mp.max = 10;
//		gui.hp.now = 10;
//		gui.mp.now = 10;
//		
//		while(gui.hp.now > 0) {
//		System.out.println("Name " + gui.name);
//		
//		System.out.print("HP [");
//		for(int i = 0; i < gui.hp.now; i++) System.out.print("■");
//		for(int i = gui.hp.now; i < gui.hp.max; i++) System.out.print("□");
//		System.out.println("]");
//		
//		System.out.print("MP [");
//		for(int i = 0; i < gui.mp.now; i++) System.out.print("■");
//		for(int i = gui.mp.now; i < gui.mp.max; i++) System.out.print("□");
//		System.out.println("]");
//		
//		for(int i = 0; i < 4; i+= 1) System.out.println("");
//		
//		gui.hp.now -= scan.nextInt();
//		}
		
		/*
		 * 책 가격을 출력하는 프로그램
		 * 처음에는 0권의 책이 존재, 최대 10권 가능
		 * 1. 책 추가 2. 책 가격 수정, 3. 종료
		 * 책 추가시 책 이름, 책 가격 입력해서 책 추가
		 * 책 가격 수정 시 책 번호(인덱싱)를 골라서 가격 수정
		 * 책은 추가하거나 수정시 매번 수정된 내용이 입력창 위에 출력
		 */
//		Books[] books = {null,null,null,null,null,null,null,null,null,null};
//		int choice=0;
//		int book_index = 0;
//		while(choice != 3) {
//			System.out.println("1. 책 추가 2. 책 가격 수정, 3. 종료");
//			choice = scan.nextInt();
//			if(choice == 1) {
//				// 책 추가
//				if(Books.book_count>10) {
//					System.out.println("추가 불가");
//				}else {
//					books[Books.book_count] = new Books();
//					books[Books.book_count].book_name = scan.next();
//					books[Books.book_count].book_price = scan.nextInt();
//					Books.book_count +=1;
//				}
//			}else if(choice ==2) {
//				book_index = scan.nextInt();
//				books[book_index].book_price = scan.nextInt();
//				System.out.println("수정된 책의 이름" + books[book_index].book_name);
//				System.out.println("수정된 책의 가격" + books[book_index].book_price);
//			}else System.out.println("번호 입력 오류");
//		}
//		
//		for(Books book : books) {
//			System.out.println(book.book_name);
//			System.out.println(book.book_price);
//		}
		
		// IDE -> Integrated Develop Environment
		// Assistant -> Ctrl + Space
		
		Book[] books = {null,null,null,null,null,null,null,null,null,null};
		while(true) {
			for(Book book : books) {
				if(book != null) {
					System.out.println("이름 : ");
					System.out.println(book.name);
					System.out.println("가격 : ");
					System.out.println(book.price);
				}
			}
			System.out.println("1. 책 추가 2. 책 가격 수정, 3. 종료");
			int input = scan.nextInt();
			if(input == 3) break;
			else if(input == 1) {
				for(int i = 0; i<10; i+=1) {
					if(books[i] == null) {
						books[i] = new Book();
						System.out.println("책 이름 >>");
						books[i].name = scan.next();
						System.out.println("책 가격 >>");
						books[i].price = scan.nextInt();
						break;
					}
				}
			}
			else if(input == 2) {
				System.out.println("수정할 책 번호 >> ");
				input = scan.nextInt();
				if(input < 0 || input > 9 || books[input] == null) continue;
				System.out.println("책 가격 >> ");
				books[input].price = scan.nextInt();
			}
		}
	}
}

