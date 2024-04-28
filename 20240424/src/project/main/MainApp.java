package project.main;

import java.util.Scanner;

import project.main.ann.User;

// class Color{String name} -> red -> rea
// 클래스는 단순하게 정보를 집합시키는 용도의 기능

// 그래서 나온것이 원본 class를 변형시킨
// 변형 클래스 3종
// interface, enum, annotation

// interface -> 상호작용
// 여러가지 정보를 관리하기 위해서 class
// 바로 그 여러가지 정보를 for-each 문법으로 이용
// ABase{ Act }, BBase{ Out }

// interface -> 메서드만 가지고 있는 class

// 같이 많이 쓰이는 인터페이스
// clone, copy
// on, off, link, unlink

// 정해진 값이 아닌 다른 값은 받지 못하도록 만든 변형 클래스 -> enum class

public class MainApp {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		Scanner scan = new Scanner(System.in);
//		System.out.println(Calculator.PLUS.apply(5, 7));
//		System.out.println(Calculator.MINUS.apply(5, 7));
//		System.out.println(Calculator.valueOf("PLUS").apply(5, 7));
		
		// enum 클래스에 어떤 값들이 있는지 모두 가져오는 values
		// enum 클래스의 값을 한개 지정해서 가져오는 valueOf
//		Color[] colors = Color.values();
//		for(Color color : colors) {
//			System.out.println(color.getData());
//			System.out.println(color.Change());
//		}
//		Color color = Color.valueOf("RED");
//		System.out.println(color.name());
//		Color.RED; -> static 변수를 이용하는것처럼 사용한다
		
//		Color b = Color.RED; O
//		b = 9; X
		
//		Extend a = new Extend();
//		
//		Act b = a;
//		
//		a.A();
//		a.B();
//		
//		b.A();
		
//		Foreach[] eachs = {
//				new Numbers(1,2,3,4),
//				new Strings("A","B"),
//				new Numbers(5,3,2),
//				new Strings("DB","EF"),
//		};
//		for(Foreach each : eachs) {
//			each.foreach();
//		}
		
		/*
		 * 계산기 제작
		 * 덧셈, 뺄셈, 곱셈, 나눗셈
		 * 숫자 2개를 먼저 입력 후 연산자 입력시 계산값 출력
		 * 연산자는 소문자로 plus, minus, multiply, devide를 입력
		 * 잘못된 입력시 결과값 0 출력
		 */
		
//		double num1, num2;
//		
//		System.out.print("첫번째 숫자 : ");
//		num1 = scan.nextDouble();
//		System.out.print("두번째 숫자 : ");
//		num2 = scan.nextDouble();
//		System.out.print("연산자 입력 : ");
//		String target = scan.next().toUpperCase();
//		Calculator[] calcs = Calculator.values();
//		boolean check = true;
//		for(Calculator calc : calcs) {
//			if(calc.name().equals(target)) {
//				System.out.println(calc.apply(num1, num2)); 
//				check = false;
//				break;
//			}
//		}
//		if(check) System.out.println(0);
		
		// annotation된 정보를 사용하기 위해서는 Reflection이라는 방식을 이용해야한다.
		// 클래스 명칭으로 대상 클래스 정보를 획득
//		Extend.class; -> .class => 대상 클래스 정보
		
		// 이건 클래스에 있는 어노테이션을 가져오겠다
//		Extend.class.getAnnotation(First.class).A();
//		Extend.class.getAnnotation(First.class).B();
//		Extend.class.getAnnotation(First.class).value();
//		Extend.class.getAnnotations();
//		Extend.class.getAnnotationsByType(First.class);
//		
//		Extend.class.getField("a").getAnnotation(First.class);
//		Extend.class.getFields();
//		
//		Extend.class.getMethod("B").getAnnotation(First.class);
		
//		RealDB a = new RealDB();
		
//		User a = new User("아이디","비밀번호","주소");
//		System.out.println(a.toString());
		
		/*
		 * 인터페이스 메서드에 붙이는 어노테이션 제작
		 * 해당 어노테이션을 붙이면 해당 메서드가 인터페이스에 의해 추가된걸 명시
		 * InterfaceMethods() 메서드를 가진 클래스 제작
		 * 해당 메서드를 사용시 reflection을 이용해
		 * 해당 클래스에 인터페이스에 의해 추가된 메서드 이름 모두 출력
		 * 단, 위 어노테이션이 붙어있는것들만
		 */
	}
}
