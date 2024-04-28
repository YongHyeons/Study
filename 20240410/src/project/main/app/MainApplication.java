package project.main.app;

// 패키지 생략 -> import
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) {
		// 자료형이란 -> 설명서
		// 내가 필요한 용량의 크기와 필요한 용량의 모양을 설명하는 문서
		// 자료형이라는 문서를 이용해서 실제 확보한 공간 -> 변수
		// 자료형을 이용해서 변수를 만드는 방법
		// 자료형 변수;
		// 자료형 변수명;
		// 자료형 -> 내가 가지고 있는 정보의 모양과 크기
		// 2가지 종류의 자료현
		// 원시타입 자료형(정해진 크기) vs 주소타입 자료형(사용자 정의 크기)
		// int, float, double, boolean, short, char, long
		// 모양은 총 3가지 -> 정수, 실수, 논리값
		// 정수 - int, short, char, long
		// 실수 - float, double
		// 논리값 - boolean
//		long g;
//		int a;
//		short b;
//		char c;
//		float d;
//		double e;
//		boolean f;
//		// 변수 = 값;
//		a = 3;
//		d = 3.14f;
//		e = 3.14;
//		f = true;
//		
//		System.out.println(a);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
		
		// 주소 타입 변수 => 원시타입 변수의 묶음
		// 주소 타입 변수명
//		String str = new String("ABC");
		
//		자신의 나이, 몸무게, 이름을 저장한 후 출력
//		나이는 정수, 몸무게는 실수, 이름은 문장
//		int age = 28;
//		double weight = 60.0;
//		String name = "LYH";
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("몸무게 : " + weight);
		
		// 내가 입력한 내용을 변수에 기억시키는 방법 -> 사용자 입력
//		int data;
//		System.out.println();
//		// 입력도  누군가 안에 들어있는 합의한 이름을 이용한다
//		// java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
//		String value = sc.next(); // next => 합의된 이름의 기능
//		String value2 = sc.next();
//		System.out.println(value + value2);
//		
//		int d = sc.nextInt();
//		System.out.println(d);
		
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		String name = sc.next();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);
		
		sc.close();
		
		/*
		 * 자신의 이름, 나이, 몸무게를 출력하는
		 * 패키지명 : com.project.main 
		 * 프로그램 프로젝트명 : ProfilePrinter 나이와 몸무게는 정수, 이름은 문장
		 * Scanner는 Scanner scan;으로 변수 생성
		 */
		
		// 여러개의 변수를 만들고 사용하다 보면 생기는 불편함
		// 쉼표(,) -> 여러개의 변수를 한번에 만드는 기능 -> 두개를 한번에 작성하는 기법
		int a,b,c;
	}
}
