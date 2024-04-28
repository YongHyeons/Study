package project.main;

import java.util.Scanner;
/*
 * 저장된 정보를 활용하는 방법 -> 연산자
 * 내가 가지고 있는 정보를 다른 모양으로 바꾸는 방법
 * 연산자를 나누는 카테고리
 * 산술 연산자, 논리 연산자, 관계 연산자, 비트 연산자, 대입 연산자, 축약 연산자
 * 이항 연산자, 단항 연산자, 삼항 연산자
 * 
 */
public class MainApplication {
	public static void main(String[] args) {
		// 이항 연산자
		// 숫자를 연산 하기 위한 가공 -> 산수
		// +, -, *, /, %
		// 숫자르 표시할 때 정수와 실수를 다른 모양으로 표시
		// 이진법(정수), 부동소수점(실수)
		// 오토 캐스팅 -> 무조건 작은것에서 큰것
		// 정수와 실수를 연산 -> 실수와 실수를 연산하는것과 동일한 결과
//		float a = 7.0f, b = 4.0f;
//		System.out.println(a%b);
//		System.out.println(1+ (int)1.0);
		// 대입 연산자 -> 오토 캐스팅이 안된다
		// 우선 순위 중 대입 연산자는 가장 마지막이다.
		// 연산자의 흐름(항 순서)
		// 축약 연산자 -> 대입 연산자와 다른 이항 연산자를 한번에 작성하는 연산자
		// 변수 이름을 두번씩 적을 때 한번만 적어도 되도록
		// 변수이름 연산자= 항
		// 두개의 정보를 비교하는 연산자 -> 관계 연산자
		// 부등호를 이용하기에 주의할 점
		
		/*
		 * 숫자 두개를 입력한 후 입력한 두 수의 사칙연산 결과와 두 수가 동일한지 여부를 출력 
		 */
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt(), num2 = scan.nextInt();
//		System.out.println(num1 + num2);
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
//		System.out.println("몫 " + num1 / num2 + " 나머지 " + num1%num2);
//		System.out.println(num1 == num2);
//		scan.close();
		
		// 추가적인 관계 연산자를 위한 연산자 -> 논리 연산자
		// 두개의 논리값을 서로 연계해서 새로운 논리값을 구하는 연산자
		
		/*
		 *  네개의 숫자를 입력한 후
		 *  네개의 숫자를 더한 값과 네개의 숫자를 곱한 값 중 더한값이 더 큰지 비교하는 프로그램
		 *  위 프로그램에서 더한값이 더 큰지 비교후 각 숫자를 1씩 증가시킨후 다시한번 비교
		 */
		
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt();
//		System.out.println((num1 + num2 + num3 + num4) > (num1 * num2 * num3 * num4));
//		++num1; ++num2; ++num3; ++num4;
//		System.out.println((num1 + num2 + num3 + num4) > (num1 * num2 * num3 * num4));
		
//		int a = 1;
//		int b = false ? ++a : a++;
//		System.out.println(a);
//		System.out.println(b);
		
//		int a = 1;
//		System.out.println(a == 1 ? "_" : a== 2 ? "__" : "___");
		
		/*
		 * 프로젝트명 : operatorExample
		 * 패키지명 : project.oper.main
		 * 파일명 : MainApp
		 * 내용 : 5개의 숫자를 정수 3개, 실수 2개를 입력한 후
		 * 		가장 큰 수와 작은 수를 출력하는 프로그램
		 * 		가장 큰 수와 작은 수를 출력한 후 두 수의 합, 차, 곱 도 출력
		 */
		
	}
}
