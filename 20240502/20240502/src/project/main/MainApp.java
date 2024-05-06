package project.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import project.main.classes.Book;

// 스레드를 이용해서 이루고자하는 목표
// 내가 작성한 일련의 코드를 다른애가 대신 작업하고 결과를 받고싶다
// 클래스에 일련의 코드를 넘기는 방식
// 1. extends
// 2. Runnable -> void Ruunable(); -> 메서드형 인터페이스

public class MainApp {
	public static void main(String[] args) {
		/*
		 * Thread a = new Thread(new Runnable(){
		 * 		확장하는 내용(Override);
		 * });
		 */
//		Thread a = new Thread() {
//			public void run() {
//				System.out.println("작업하고 싶은 내용");
//			}
//		};
		
//		Thread a = new Thread(()->{
//			for(int i = 0; i < 100; i += 1)
//			System.out.println("작업하고 싶은 내용 Sub");
//		});
//		// Main 이 먼저 나오는 이유?
//		a.start();
//		for(int i = 0; i < 100; i += 1)
//			System.out.println("작업하고 싶은 내용 Main");
		
//		Thread a = new Thread(()->{
//			for(int i = 0; i < 5; i+=1)
//				System.out.println("A");
//		});
//		Thread b = new Thread(()->{
//			for(int i = 0; i < 5; i+=1)
//				System.out.println("B");
//		});
//		a.start();
//		b.start();

		// 스레드에는 상대방을 멈추는 Interrupt 가 존재
		// Interrupt 는 일정 시간 멈추기가 불가능
		// 그래서 내가 자신을 일정시간 멈추는 기능이 추가 -> sleep
		
//		List<Thread> threads = new ArrayList<Thread>();
//		threads.add(new Thread(()->{
//			for(int i = 0; i < 50000; i+=1) {
//				System.out.println("A");
//			try {
//				// static method
//				// 잠깐만 멈추는 기능
//				Thread.yield(); // 잠깐 동안 주도권을 넘겨주겠어
////				Thread.sleep(500);
//			} catch (Exception e) {}
//			}
//		}));
//		threads.add(new Thread(()->{
//			for(int i = 0; i < 50000; i+=1)
//				System.out.println("B");
//		}));
//		threads
//			.stream()
//			.forEach((thread)->{
//				// 현재 실행중인 스레드를 Thread 클래스로 반환
//				Thread temp = Thread.currentThread();
////				temp.setPriority(0);
////				thread.getName();
////				thread.getId();
////				thread.getPriority();
////				thread.getState();
//				thread.start();
//			});
//		// 중지
////		a.interrupt();
////		try {
////			a.join();
////			b.join();
////		} catch (InterruptedException e) {}
//		threads
//			.stream()
//			.forEach((thread)->{
//				try {
//					thread.join(500);
//				} catch (InterruptedException e) {}
//			});
//		System.out.println("main");
		
		// 스레드가 무한히 동작하는 스레드인 경우 -> GUI
		// 무한히 동작해서 스레드가 안멈추는 경우
		// 그래서 스레드를 직접 제어하는 메서드들이 Thread 변수에 추가되어 있다
		
		
//		for(int i = 0; i < 100; i+=1)
//			System.out.println("Main");
		
		/*
		 * 구구단을 출력하는 프로그램
		 * 구구단 각 단별로 스레드를 만들어 출력
		 * 각 단의 한개의 행을 출력하면 0.2초의 대기
		 * 모든 출력이 끝난 후 프로그램 종료
		 * 
		 * 2x1 ~ 2x9 단
		 * 2x1=1 행
		 */
		
//		for(int j = 2; j < 10; j+=1) {
//			final int temp = j;
//			new Thread(()->{
//				for(int i = 1; i<10; i+=1) {
//					System.out.println(temp + " x " + i + " = " + temp * i);
//					try {
//						Thread.sleep(200);
//					} catch (InterruptedException e) {}
//				}
//			}).start();
//		}
		
		// 동기화를 이용한다면 매우 간단하게 서로의 정보가 오염되지 않도록 할 수 있다
		
//		Database db = new Database();
//		Thread setter1 = new Thread(()->{
//			for(int i = 0; i < 100; i += 1) {
//				db.set(1);
////				Thread.yield();
//			}
//		});
//		Thread setter2 = new Thread(()->{
//			for(int i = 0; i < 100; i += 1) {
//				db.set(2);
////				Thread.yield();
//			}
//		});
//		Thread getter = new Thread(()->{
//			for(int i = 0; i < 100; i += 1) {
//				System.out.println(db.get());
////				Thread.yield();
//			}
//		});
//		setter1.start();
//		setter2.start();
//		
//		getter.start();
		
//		List<Integer> a; // 전체를 묶어버릴 수 없다
//		a.wait();
		
		// Sychronized(){} X -> ReentrantLock
		
//		List<Integer> a = Collections.synchronizedList(new ArrayList<Integer>());
		
//		List<Book> books = new ArrayList<Book>();
//		Scanner scan = new Scanner(System.in);
//		final Check isChange = new Check(false);
//		final Check runner = new Check(true);
//		Thread out = null;
//		try {
//			out = new Thread(()->{
//				while(runner.get()) {
//					if(isChange.get()) {
//						System.out.println(books.size());
//						isChange.Off();
//					}
//					try {
//						Thread.sleep(1);
//					} catch (Exception e) {}
//				}
//			});
//			out.start();
//			while(true) {
//					books.add(new Book(scan.next(), scan.next(), scan.nextInt()));
//					isChange.On();
//			}
//		}catch(Exception e) {runner.Off();}
		
		/*
		 * 1초마다 책이 한권씩 10권 추가
		 * 2초마다 책 전체 출력
		 * 5초마다 책 전체 권수 출력
		 * 10초 이후 프로그램 종료
		 */
//		List<Thread> threads = new ArrayList<Thread>();
//		List<Book> books = new ArrayList<Book>();
//		
//		threads.add(new Thread(()->{
//			for(int i = 0; i<10; i+=1)
//				books.add(new Book("A", "B", i));
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {}
//		}));
		
//		--------------------------------------------------------
		
		List<Book> books = Collections.synchronizedList(new ArrayList<Book>());
		Thread add= new Thread(()->{
			for(int i = 0; i < 10; i+=1) {
				books.add(new Book("제목", "저자", 5000));
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
		});
		
		Thread out= new Thread(()->{
			for(int i = 0; i < 5; i+=1) {
				for(Book book : books) {
					System.out.println(book.title);
				}
				try {
					Thread.sleep(2000);
				} catch (Exception e) {}
			}
		});
		
		Thread count= new Thread(()->{
			for(int i = 0; i < 2; i+=1) {
					System.out.println(books.size());
				try {
					Thread.sleep(5000);
				} catch (Exception e) {}
			}
		});
		
		add.start();
		out.start();
		count.start();
	}
}
