package project.main;

import java.util.Scanner;

import project.main.classes.Numbers;
import project.main.interfaces.Act;
//import project.main.annotations.*;


public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		List.Node2 a = new List.Node2();
//		a.a = 5;
//		a.A();
//		
//		List c = new List();
//		// 이러한 메서드를 호출하는 방식을 이용한다
//		// 그래서 new List.Node()가 아닌 c.new Node() 방식을 이용한다.
//		c.toString(/*c*/);
//		// 멤버 내부 클래스를 생성자 메서드를 호출하는것처럼 이용해서 생성한다.
//		List.Node b = c.new Node();
//		// List.Node b = new List.Node(); -> 불가능
//		
//		b.NodeMethod();
//		
//		System.out.println(c.ListValue);
		
		// 클래스 안에 들어가는 클래스 내부 클래스의 간단한 사용법
//		Array a = new Array();
//		Array.Inserter inserter = a.new Inserter();
//		for(int i = 0; i < 100; i+=1)
//			inserter.push(i + 1);
//		while(!a.empty()) {
//			Array.Remover remover = a.new Remover();
//			System.out.println(remover.pop());
//		}
		
		// 밖에 있는 값도 변화가 일어나면 안된다
		// 밖에 있는 값도 final 이어야지만 동작한다
//		final double b = 7.5;
		// 지역 내부 클래스가 외부에 있는 지역의 값들을 가져오는 동작이 특수
		// 외부 지역에 존재하는 값이 한번 초기화 되는것은 문제가 없는데
		// 두번째 변화하는것은 MethodInnerClass에서 가져간 변수와 값이 달라질 수 있기 때문에
		// 에러를 유발한다
//		b = 5; -> 불가능
		// 지역 내부 클래스
//		class MethodInnerClass{
//			public int a;
//			public void A() {
//				System.out.println(b);
				// 외부에서 가져온 값은 final 키워드가 자동으로 붙기 때문에
//				b = 5; -> 불가능
//			}
//		}
//		MethodInnerClass a = new MethodInnerClass();
//		a.A();
		
//		MethodOuterClass a = new MethodOuterClass();
//		a.Method();
		
		/*
		 * 구구단 클래스 제작
		 * 메서드 내부 클래스 또는 멤버 내부 클래스로 구구단의 출력 범위 지정
		 * 지정된 범위의 구구단 출력
		 */
//		Gugudan g = new Gugudan();
//		Gugudan.Ggd ggd = g.new Ggd();
//		ggd.Mul();
//		---------------------------------------------
//		Gugudan a = new Gugudan();
//		Gugudan.MaxDanChanger changer = a.new MaxDanChanger();
//		changer.change(6);
//		
//		a.Print();
		
		// 익명 클래스는 오버라이딩한 메서드만 이용이 가능하다
//		Array value = new Array(){
//			int a;
//			float b;
//			public void A() {
//				
//			}
//			@Override
//			public boolean empty() {
//				System.out.println("엠프티");
//				return super.empty();
//			}
//		};
//		value.empty();
		
//		Act a = new Act(){
//			@Override
//			public void act() {
//				System.out.println("인터페이스를 확장해서 익명 클래스");
//			}
//		};
//		
//		a.act();
		
//		Numbers a = new Numbers(1,2,3,4,5,6,7,8,9,10);
		
		// 익명 메서드 == 람다 메서드
		// 원래 사용하던 익명 클래스의 작성법을 훨씬 짧게 작성할 수 있게하는 기능
		// 메서드가 1개짜리인 인터페이스만 가능하다
		// 메서드형 인터페이스
		
		// 익명 메서드 또는 람다 메서드의 작성법 -> 함수의 원형을 기억해라
		// void name(value, value2){}
		// (a,b)->{}
		// 람다 메서드를 적으면 해당 람다 메서드를 오버라이딩하는 확장클래스를 자동 생성
		
//		Act act = new Act(){
//			@Override
//			public void act() {}
//			@Override
//			public void act2(int data) {
//				System.out.println(data);
//			}
//		};
		
//		a.forEach((data)->{
//			System.out.println(data);
//		});
		
//		ArrayList a = new ArrayList(1,2,3,4,5);
//		
//		a
//			.filter((data)->{
//				return data%2 == 0; 
//			})
//			.forEach((data)->{
//				System.out.println(data);
//			});
//		
//		a.forEach((data)->{
//			System.out.println(data);
//		});
		
		ArrayList a = new ArrayList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
//		a
//			.filter((data)->{
//				return data < 15;
//			})
//			.filter((data)->{
//				return data % 2 == 0;
//			})
//			.forEach((data)->{
//				System.out.println(data);
//			});
//		
		/*
		 * map 이라는 메서드 추가 -> int act(int)
		 * reduce 라는 메서드 추가	-> int act(int,int);
		 * map 은 가지고 있는 정보를 메서드를 통해서 반환값으로 변환
		 * reduce 는 이전 값과 현재값을 매개변수로 가져서 연산결과를 반환
		 * 	연산결과가 나온 이후부터는 연산결과와 현재값을 연산해서 최종 결과를 구하는 메서드
		 */
		
		int result = 
		a
			.filter((data)->{
				return data < 15;
			})
			.filter((data)->{
				return data % 2 == 0;
			})
			.map((data)->{
				return data +1;
			})
			.reduce((prev,data)->{
				return prev + data;
			});
		System.out.println(result);
	}
}
