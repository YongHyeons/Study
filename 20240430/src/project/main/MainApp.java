package project.main;

import project.main.classes.*;
import project.main.interfaces.Cloneable;
import java.util.function.*; // function -> method

// 비슷한 클래스들이 눈에 띈다
// 무언가를 관리하기위한 클래스를 만들때는 특별히 바뀌는게 없다
// 자료형정도만 바뀔뿐

//class List{
//	private int[] datas;
//	
//}

// 자료형 부분에 구멍을 뚫고 나중에 필요할때마다 메꿔서 사용하는 기법
// 제너릭 기법 -> 템플릿 기법 -> 동일한 코드 작성을 최소화하기 위한 핵심적인 기능
//class Temp{
//	private ?[] datas;
//	
//}

// 제너릭 기법 -> 사용 대상 -> 클래스, 인터페이스, 메서드, ...
// 클래스에 사용하는 방법
public class MainApp {
	public static void main(String[] args) {
		
		/*
		 * Book 클래스 제작
		 * Book 클래스에서 가지고 있는 정보를 출력하는 메서드 추가
		 * Book 클래스에서 가지고 있는 정보를 한개의 문자열로 변환하는 메서드 추가
		 * 메서드형 제너릭 인터페이스를 이용
		 * Book 은 책이름, 가격, 저자를 정보로 가짐
		 */

		
//		Function, Cunsumer
		
		
//		LinkedList<Integer> a = new LinkedList<Integer>();
//		for(int i = 0; i < 100; i += 1)
//			a.pushBack(i + 1);
//		a
//			.filter((data)->{
//				return data % 2 == 0;
//			})
//			.map((data)->{
//				return data + 0.5;
//			})
//			.filter((data)->{
//				return data < 50;
//			})
//			.map((data)->{
//				return data.toString().concat(" kg");
//			})
//			.forEach((data)->{
//				System.out.println(data);
//			});
		
		// 제너릭 기법에 넣을 수 있는 자료형이 바로 -> Object의 확장형만 가능하다, 주소형 변수만 가능하다
//		List<Integer> a = new List<Integer>(1, 2, 3, 4, 5);
//		List<Double> b = new List<Double>(1.1, 2.1, 3.1, 4.1, 5.1);
//		
//		a.set(0, 3);
//		b.set(0, 5.5);
//		
//		System.out.println(a.get(0));
//		System.out.println(a.get(1));
//		System.out.println(b.get(0));
//		System.out.println(b.get(1));
//		
//		System.out.println(Compare.<Integer>Big(1,2,3,4));
//		// 메서드 제너릭 경우 자동 형 주정 -> 형 추측
//		System.out.println(Compare.Big(1, 2, 3, 4));
//		System.out.println(Compare.Big(1.1, 2.1, 3.1, 4.1));
		
		// 제너릭들은 일반적으로 호환이 안된다
		// 하지만 그 이유는 호환이 안될 수 도 있는 확률이 있기 때문
		// 그렇다면 미리 호환이 된다는걸 100% 알려준다면
		// 호환성이 생길것이다
		// 제너릭 확장
		
		// 제너릭에 특정 클래스를 넣는게 아닌 확장 범위를 넣는다
		// 그렇다면 해당 확장 범위에 걸친애들이 모두 올 수 있다.
		
		// 제너릭 확장에는 2종류
		// 하한 확장 -> super
		// 상한 확장 -> extends
		
//		List<? super Bottom> a = new List<Bottom>();
//		List<? extends Top> b = new List<Top>();
//		// 위 두개의 클래스 변수는 그냥 List
//		// List_Bottom, List_Top
//		b = a; -> 오류
//		b = new List<Bottom>();
		
//		Test(new List<Top>());
//		Test(new List<Bottom>());
//		LinkedList<Integer> a = new LinkedList<Integer>();
//		
//		for(int i = 0; i < 10; i += 1) {
//			a.pushBack(i);
//		}
//		a.forEach((data)->{
//			System.out.println(data);
//		});
//		
//		LinkedList<Double> b = new LinkedList<Double>();
//		
//		for(int i = 0; i < 10; i += 1) {
//			b.pushBack(i + 0.5);
//		}
//		b.forEach((data)->{
//			System.out.println(data);
//		});
		
		// 제너릭 인터페이스의 모든것을 배우는 것은 힘들다
		// Comparable, Comparator -> 비교 인터페이스
		
		// 메서드형 인터페이스
		// 익명 메서드(람다 메서드)를 이용하기 위해서 미리 만들어놓은 제너릭 인터페이스
		// Consumer -> 소비자
		// BiConsumer
		// Binary -> 이진, 두개
		// Supplier -> 공급자
		// BiSupplier -> 없다(리턴 두개는 불가능하기 때문)
		// Function -> 변환자 -> 1:1
		// BiFunction -> 2:1
		// Function 과 동일한 구조인데 자료형이 동일할 때를 위한 메서드형 인터페이스
		// BinaryOperator
		// UnaryOperator
		// Predicate 추측자(선택자)
		// BiPredicate
		
		// 메서드형 인터페이스 체이닝(연계)
		
//		Function<Integer, Integer> a = (data)->{ return data + 1; };
//		
//		// default method
//		// 연계하는 기능
//		Function<Integer, Integer> b = a.andThen((data)->{ return data * 2; });
//		
//		System.out.println(b.apply(5));
		
		// compose, andThen, identify, minBy, maxBy, and, or, negate, isEqual, not 
		
		
		// Runnable -> void run();
	}
	
//	// Consumer
//	public static <T> void Test(T data, Consumer<T> consume) {
//		consume.accept(data);
//	}
//	
//	// BiConsumer
//	public static <T,K> void Test(T data, K data2, BiConsumer<T, K> consume) {
//		consume.accept(data, data2);
//	}
//	
//	// Supplier
//	public static <T> T Test(Supplier<T> supply) {
//		return supply.get();
//	}
//	
//	// Function
//	public static <T, K> K Test(T data, Function<T, K> func) {
//		return func.apply(data);
//	}
//	
//	// BiFunction
//	public static <T, U, K> K Test(T data, U data2, BiFunction<T, U, K> func) {
//		return func.apply(data,data2);
//	}
//	
//	// BinaryOperator
//	public static <T> T Test(T data, T data2, BinaryOperator<T> oper) {
//		return oper.apply(data, data2);
//	}
//	
//	// UnaryOperator
//	public static <T> T Test(T data, UnaryOperator<T> oper) {
//		return oper.apply(data);
//	}
//	
//	// Predicate
//	public static <T> boolean Test(T data, Predicate<T> pred) {
//		return pred.test(data);
//	}
//	
//	// BiPredicate
//	public static <T, K> boolean Test(T data, K data2, BiPredicate<T,K> pred) {
//		return pred.test(data,data2);
//	}
	
//	public static void Test(List<? extends Top> test) {}
//	
//	// Object의 확장이라면
//	public static void Test2(List<? extends Object> test) {}
//	
//	public static void Test3(List<? extends Cloneable> test) {
////		test.get(0).clone();
//	}
	
}