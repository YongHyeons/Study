package org.library.main;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import org.library.classes.Book;
import org.library.classes.BookLibrary;
import org.library.classes.Console;
import org.library.classes.RunnableObject;
public class MainApp {
	
	/*
	 * 전체 출력, 베스트 셀러 출력, 할인 출력 추기
	 * 할인가를 할인가격이 아닌 할인된 책의 가격으로 변경
	 * 출력시 원가( 할인가 )가 아닌 할인가( 원가 ) 로 변경
	 * 할인이 없을 시 그냥 원가 출력
	 */
	public static void main(String[] args) {
		Console console = new Console();
		Scanner scan = new Scanner(System.in);
		final BookLibrary books = new BookLibrary();
		final RunnableObject MenuScene = new RunnableObject();
		final RunnableObject InsertScene = new RunnableObject();
		final RunnableObject PrintScene = new RunnableObject();
		final RunnableObject UpdateScene = new RunnableObject();
		final RunnableObject DeleteScene = new RunnableObject();
		final RunnableObject CloseScene = new RunnableObject();
		final RunnableObject OpenScene = new RunnableObject();
		final RunnableObject AllPrintScene = new RunnableObject();
		final RunnableObject BestPrintScene = new RunnableObject();
		final RunnableObject SalePrintScene = new RunnableObject();
		
		MenuScene.runner = ()->{
			System.out.print("1. 책 추가 2. 책 출력 3. 책 수정 4. 책 삭제 5. 종료");
			System.out.println(" >> ");
			int input = scan.nextInt();
			if(input == 1) console.setRun(InsertScene.runner);
			else if(input == 2) console.setRun(PrintScene.runner);
			else if(input == 3) console.setRun(UpdateScene.runner);
			else if(input == 4) console.setRun(DeleteScene.runner);
			else if(input == 5) console.setRun(CloseScene.runner);
		};
		
		InsertScene.runner = ()->{
			Book inserter = new Book();
			try {
				System.out.print("Title >> ");
				inserter.setTitle(scan.next());
				System.out.print("Author >> ");
				inserter.setAuthor(scan.next());
				System.out.print("Price >> ");
				inserter.setPrice(scan.nextInt());
				System.out.print("IsBest >> ");
				inserter.setIsBest(scan.nextBoolean());
				System.out.print("Sale >> ");
				inserter.setSale(scan.nextDouble());
				books.push(inserter);
				console.setRun(MenuScene.runner);
			}
			catch(Exception e) {}
		};
		PrintScene.runner = ()->{
			System.out.print("1. 전체 출력 2. 베스트셀러 출력 3. 할인 출력 4. 돌아가기");
			System.out.println(" >> ");
			try {
				int input = scan.nextInt();
				if(input == 4 ) console.setRun(MenuScene.runner);
				else if(input == 1 ) console.setRun(AllPrintScene.runner);
				else if(input == 2 ) console.setRun(BestPrintScene.runner);
				else if(input == 3 ) console.setRun(SalePrintScene.runner);
			} catch(Exception e) {console.setRun(MenuScene.runner);}
		};
		AllPrintScene.runner = ()->{
			
				books.forEach((book)->{
					// concat이 맞는데 + -> concat으로 변환
					System.out.println("제목 : " + book.getTitle() + (book.getIsBest() ? " ★" : ""));
					if(book.getSale() == 0) System.out.println("가격 : " + book.getPrice().toString());
					else System.out.println("가격 : " + book.getPriceSale() + " ( " + book.getPrice().toString() + " ) ");
					System.out.println("작가 : " + book.getAuthor());
					System.out.println();
				});
			console.setRun(MenuScene.runner);
		};
		BestPrintScene.runner = ()->{
			books
				.filter((book)->{
					return book.getIsBest();
				})
				.forEach((book)->{
					// concat이 맞는데 + -> concat으로 변환
					System.out.println("제목 :" + book.getTitle() + (book.getIsBest() ? " ★" : ""));
					if(book.getSale() == 0) System.out.println("가격 : " + book.getPrice().toString());
					else System.out.println("가격 : " + book.getPriceSale() + " ( " + book.getPrice().toString() + " ) ");
					System.out.println("작가 : " + book.getAuthor());
					System.out.println();
			});
			console.setRun(MenuScene.runner);
		};
		SalePrintScene.runner = ()->{
			books
				.filter((book)->{
				return book.getSale() != 0;
				})
				.forEach((book)->{
					// concat이 맞는데 + -> concat으로 변환
					System.out.println("제목 :" + book.getTitle() + (book.getIsBest() ? " ★" : ""));
					if(book.getSale() == 0) System.out.println("가격 : " + book.getPrice().toString());
					else System.out.println("가격 : " + book.getPriceSale() + " ( " + book.getPrice().toString() + " ) ");
					System.out.println("작가 : " + book.getAuthor());
					System.out.println();
			});
			console.setRun(MenuScene.runner);
		};
		
//		PrintScene.runner = ()->{
//			System.out.println("1. 전체 출력 2. 베스트셀러 출력 3. 할인 출력");
//			Integer index = scan.nextInt();
//			if(index == 1) {
//				books.forEach((book)->{
//					book.normalPrint();
//				});
//			}
//			else if(index == 2) {
//				books
//				.forEach((book)->{
//					if(book.getIsBest()) book.normalPrint(); 
//				});
//			}
//			else if(index == 3) {
//				books.forEach((book)->{
//					if(book.getSale() > 0) book.normalPrint();
//				});
//			}
//			console.setRun(MenuScene.runner);
//		};
		
		
		UpdateScene.runner = ()->{
			System.out.print("Title >> ");
			Integer index = books.getBookIndex(scan.next());
			if(index > -1) {
				Book book = books.getBook(index);
				System.out.print("Price >> ");
				try {
					book.setPrice(scan.nextInt());
				}catch(Exception e) {}
			}
			console.setRun(MenuScene.runner);
		};
		
		DeleteScene.runner = ()->{
			System.out.print("Title >> ");
			Integer index = books.getBookIndex(scan.next());
			if(index > -1) {
				books.removeBook(index);
			}
			console.setRun(MenuScene.runner);
		};
		
		CloseScene.runner = ()->{
			books.Save("./db.txt");
			console.isClose = true;
		};
		
		OpenScene.runner = ()->{
			books.Open("./db.txt");
			console.setRun(MenuScene.runner);
		};
		
		
		console.setRun(OpenScene.runner);
		while(!console.isClose) { console.Run();}
	}
}
