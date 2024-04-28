package project.main;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 제어문 반복문
		// 동일한 문장을 다시한번 실행하기위한 제어문 -> 반복문
		// 반복문 제어문의 역할 -> 이미 진행됭 코드의 진행 위치를 다시 위로 돌려주는 기능
		// 무조건 실행 및 점프가 아닌 불필요할 때 점프를 안할 필요성도 있다.
		// 반복문도 제어문과 동일하게 (){}가 필수
		// while, for, do-while
		// while 반복문
//		int index = 0;
//		while(index < 5)  System.out.println(index++);
		/*
		 * 1 ~ 1000까지의 숫자 중 짝수만 출력해보기
		 */
//		int index = 1;
//		while(index<=1000) {
//			if(index%2 == 0) System.out.print(index + " ");
//			index++;
//		}
//		
//		// 반복문 연습 -> 1 ~ 내가 입력한 숫자까지 중 3의 배수를 제외한 숫자만 출력
//		int index = 1, num = scan.nextInt();
//		while(index <= num) {
//			if(index % 3 != 0) System.out.print(index + " ");
//			index++;
//		}
//		
//		System.out.println();
//		
//		// 일반 반복문 while과 기능은 동일한데 변수를 만들고 증감시키는 부분을 한군데 모아서 작성하기 위한 반복문
//		// for 반복문
//		for(index = 1; index<=num; index++) if(index % 3 != 0) System.out.print(index + " ");
//		
//		System.out.println();
//		
//		// do-while 반복문
//		index = 1;
//		do{
//			if(index % 3 != 0) System.out.print(index + " ");
//			index++;
//		}while(index <= num);
//		
//		System.out.println();
//		
//		// 제어 키워드 break가 동작하는 원리
//		// break가 동작이 가능한 제어문을 들어가면서부터 횟수를 세어서
//		// 동일할 횟수만큼 나가는 기능
//		// continue가 동작하는 제어문 -> 반복문
//		index = 0;
//		while(true) {
//			index++;
//			if(index > num) break;
//			if(index % 10 == 0) continue;
//			if(index % 3 != 0) System.out.print(index + " ");
//		}
		
//		/*
//		 * 숫자 2개를 입력하면 작은수 ~ 큰수 사이중 3의 배수를 제외환 숫자 모두 출력
//		 */
//		int a = scan.nextInt(), b = scan.nextInt();
//		int big = a > b ? a : b,small = a < b ? a : b;
//		for(int index = small ;index <= big; index +=1) {
//			if(index % 3 == 0 ) continue;
//			System.out.println(small);
//		}
		/*
		 * 숫자 세개를 입력한 후
		 * 가장 작은수 ~ 가장 큰수 사이의 모든 숫자중
		 * 가장 큰수와 가장 작은수를 제외한 숫자의 배수를 출력
		 * 단, 가장 큰수와 가장 작은수의 평균보다 숫자가 커지면 출력 종료
		 */
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		int big, small, other;
		big = a; small = a;
		big = big > b ? big : b;
		big = big > c ? big : c;
		small = small < b ? small : b;
		small = small < c ? small : c;
		other = (a+b+c) - (big+small);
		
		for(int index = small; index<= big; index++) {
			if((big+small)/2 <index) break;
			if((index % other) == 0)System.out.print(index + " ");
		}
	}
}
