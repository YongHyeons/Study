package project.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project.main.classes.Book;
// 자료구조란 기본적으로 장단점이 있는 형태
// 자료구조란것은 어쩔수없는 단점이 무조건 있다
// 그렇다면 어느정도의 장점을 희생해서 단점을 가려서 필요한만큼의 자료구조를 만들수도 있지 않을까?

// Collection -> 전체 자료구조의 장단점
//  장점 -> 편의성
//  단점 -> 성능

// List -> 제일 많이 쓰이고 제일 중요한 녀석
// BaseClass -> 확장을 위한 클래스
// 가장 장단점이 명확하고 제어가 쉬운 자료구조
// ArrayList, Vector, LinkedList

// Vector - 배열
//  장점 - 매우 빠른 접근 속도 성능
//  단점 - 순간적으로 2배의 용량이 필요

// ArrayList - 배열 기반 리스트
// Vector 의 장점과 LinkedList 의 장점을 혼합한 형태
//  장점 - 빠른 접근 속도 성능과 용량을 필요한 만큼 이용한다
//  단점 - 추가 및 삭제시 용량이 LinkedList 보다 더 많이 필요하고 접근할 때 Vector 보다 느리다

// LinkedList - 리스트
//  장점 - 용량이 아주 조금 더 필요한걸 제외하면 필요한만큼만 사용한다
//  단점 - 접근 속도 성능이 느리다 


// Set -> 중복 비허용 List
// HashSet, LinkedHashSet
// Array ~ 와 Linked ~ 는 장단점이 비슷

// (Array)HashSet
//  장점 - 접근이 빠르다
//  단점 - 용량이 순간적으로 2배 필요하다

// LinkedHashSet
//  장점 - 용량이 필요한만큼만 필요
//  단점 - 접근이 느리다


// Map -> KeyValue 자료구조
//  장점 - 더 큰 편의성
//  단점 - 용량
// HashMap, LinkedHasgMap, TreeMap
// HashMap - 용량이 1.2
// LinkedHasgMap - 용량이 1.4
// TreeMap - 용량이 1.6

// HashMap, HashSet, LinkedList, ArrayList

public class MainApp {
	public static void main(String[] args) {
//		List<Integer> a = new ArrayList<Integer>();
//		List<Integer> a = new LinkedList<Integer>();
//		List<Integer> a = new Vector<Integer>();
		
//		a.add(3);
//		System.out.println(a.get(0));
		
//		List<Integer> a = new ArrayList<Integer>();
//		
//		for(int i = 0; i < 100; i += 1) {
//			a.add(i+1);
//			a.forEach((data)->{
//				System.out.println(data);
//			});
//		}
//		
//		// Collection 은 대부분 for-each 메서드를 가지고 있거나 for-each 문을 사용 가능하다
//		for(Integer data : a) {
//			System.out.println(data);
//		}
//		MyList<Integer> b = new MyList<Integer>(1,2,3,4,5,6,7,8,9,10);
//		for(Integer data : b) {
//			System.out.println(data);
//		}
		
		// List<Integer> a = new ArrayList<Integer>();
//		Set<Integer> a = new HashSet<Integer>();
//		a.add(1);
//		a.add(1);
//		a.add(1);
//		for(Integer data : a) System.out.println(data);
//		System.out.println(a);
		
//		MyList a;
//		a.equals(); // 이 메서드를 이용해서 Set이 중복을 체크
		
//		Map<String, String> a = new HashMap<String, String>();
//		
//		a.put("Apple", "사과");
//		a.put("Grape", "포도");
//		System.out.println(a.get("Apple"));
//		System.out.println(a.get("Grape"));
//		
//		a.keySet();
//		a.values();
//		for(Map.Entry<String, String> b : a.entrySet()) {
//			System.out.println(b.getKey());
//			System.out.println(b.getValue());
//		}
		
		
		// 자료구조들에 map, filter 등 추가적인 제너릭 인터페이스를 이용하기 위한 기능을 추가했다
		
		// Stream
		// 연속적인
		
		// Stream 클래스를 직접 만드는 방법, 간접적으로 만드는 방법
//		Stream<Integer> a = Stream.of(1,2,3,4,5);
//		List<Integer> b = new ArrayList<Integer>();
//		for(int i = 0; i < 10; i+=1) b.add(i+1);
//		Stream<Integer> a = b.parallelStream(); -> 순서없이 동시에 접근
//		Stream<Integer> a = b.stream();
		
//		a
//			.forEach((data)->{
//				System.out.println(data);
//			});
		
//		a
//			.count();
//		List<Integer> result = a.collect(Collectors.toList());
//		a.collect(Collectors.toSet());
//		System.out.println(result);
		
		// 최종 연산 메서드 -> 실제 데이터를 소비하는 동작
		// count, collect
		// allMatch -> 검사
		// anyMatch
		// nonMatch
		
//		a.allMatch((data)->{
//			return true;
//		});
		
		// 올바른애는 골라내기위한 기능
//		System.out.println(a.findFirst().get());
//		System.out.println(a.findAny().get());
		
		// reduce, foreach
//		System.out.println(a.reduce((data,now)->{
//			return data + now;
//		}).get());
		
		// 최종 연산전 이용하는 중간 연사
//		a
//			// 조건 -> 맞는 애들만 골라낼거야
//			.filter((data)->{ return data< 5;})
			// 중복 제거 -> 유일하게 값을 만들어주는 기능
//			.distinct() // unique
			// 일정 개수만 데이터를 남기는 기능
//			.limit(3)
			// 일정 개수를 무시하고 건너뛰어라
//			.skip(2)
			// limit 와 skip 은 pagenation 에 많이 이용
//			.takeWhile((data)->{ return data != 3;})
//			.dropWhile((data)->{ return data != 3;})
			// 변환
//			.map((data)->{
//				return data + 1.5;
//			})
//			.flatMap((data)->{
//				List<Integer> e = new ArrayList<Integer>();
//				e.add(data); e.add(data);
//				return e.stream();
//			})
//			.forEach((data)->{
//				System.out.println(data);
//			});
		
		/*
		 * Book
		 * 제목, 저자, 가격
		 * 15000원 이하 책들 중 어린왕자라는 이름을 포함한 책들을 출력
		 */
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("어린왕자의 계략", "제갈량", 25000, 30.0, false));
		books.add(new Book("어린왕자", "생텍쥐베리", 15000, 0.0, true));
		books.add(new Book("삼국지", "미상", 35000, 30.0, false));
		books.add(new Book("식탁의 탁주", "미인성", 20000, 10.0, false));
//		
//		books
//			.stream()
//			.filter((book)->{
//				return book.price <= 15000;
//			})
//			.filter((book)->{
//				return book.title.contains("어린왕자");
//			})
//			.forEach((book)->{
//				book.Show();
//			});
		
		/*
		 * Book
		 * 세일율, 세일여부, 베스트셀러 여부
		 * 
		 * 책 출력 프로그램
		 * 1. 전체 책 출력
		 * 2. 베스트 셀러만 출력
		 * 3. 내가 직접 가격을 입력하고 해당 가격 미만의 책들만 출력
		 * 4. 세일하는 책들만 출력
		 * 5. 내가 직접 가격을 입력하고 세일하는 가격이 해당 가격 미만의 책들만 출력
		 */
//		try (Scanner scan = new Scanner(System.in);){
//		while(true) {
//			
//				System.out.println("1. 전체  2. 베스트셀러 ");
//				System.out.println("3. 원가 4. 할인 ");
//				System.out.println("5. 할인가  6. 종료");
//				System.out.print(">>");
//				int select = scan.nextInt();
//				if(select == 6) break;
//				else if(select == 1) {
//					books
//					.stream()
//					.forEach((book)->{
//						book.Show();
//					});
//				}
//				else if(select == 2) {
//					books
//					.stream()
//					.filter((book)->{
//						return book.isBest == true;
//					})
//					.forEach((book)->{
//						book.Show();
//					});
//				}
//				else if(select == 3) {
//					System.out.println("원가 >>");
//					int price = scan.nextInt();
//					books
//					.stream()
////					.filter((book)->{
////						return
////					})
//					.forEach((book)->{
//						book.Show();
//					});	
//				}
//				else if(select == 4) {
//					int price = scan.nextInt();
//					books
//					.stream()
//					.filter((book)->{
//						return book.isSale;
//					})
//					.forEach((book)->{
//						book.Show();
//					});	
//				}
//				else if(select == 5) {
//					System.out.println("할인가 >>");
//					int price = scan.nextInt();
//					books
//					.stream()
//					.filter((book)->{
//						return book.price * (100 - book.sale) / 100.0;
//					})
//					.forEach((book)->{
//						book.Show();
//					});	
//				}
//				
//				
//			}
//		}
		
		
		
//		while(true) {
//			System.out.println("1. 전체 책 출력");
//			System.out.println("2. 베스트 셀러만 출력");
//			System.out.println("3. 내가 직접 가격을 입력하고 해당 가격 미만의 책들만 출력");
//			System.out.println("4. 세일하는 책들만 출력");
//			System.out.println("5. 내가 직접 가격을 입력하고 세일하는 가격이 해당 가격 미만의 책들만 출력");
//			int index = scan.nextInt();
//			if(index == 1) {
//				books.forEach((book)->{
//					book.Show();
//				});
//			}
//			if(index == 2) {
//				books
//				.stream()
//				.filter((book)->{
//					return book.best == true;
//				})
//				.forEach((book)->{
//					book.Show();
//				});
//			}
//			if(index == 3) {
//				books
//				.stream()
//				.filter((book)->{
//					System.out.print("가격 입력 : ");
//					return book.price <= scan.nextInt();
//				})
//				.forEach((book)->{
//					book.Show();
//				});		
//			}
//			if(index == 4) {
//				books
//				.stream()
//				.filter((book)->{
//					return book.sale == true;
//				})
//				.forEach((book)->{
//					book.Show();
//				});
//			}
//			if(index == 5) {
//				books
//				.stream()
//				.filter((book)->{
//					System.out.print("가격 입력 : ");
//					return book.price - (book.price*book.sale_per) <= scan.nextInt();
//				})
//				.forEach((book)->{
//					book.Show();
//				});		
//			}
//			if(index > 5) { break; }
//			System.out.println("-------------------------------------");
//		}
	}
}
