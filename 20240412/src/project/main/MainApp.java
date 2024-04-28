package project.main;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 삼항 연산자의 단점(연산자의 단점)을 해결하기 위한 기능 -> 제어문
		// 연산자처럼 특수문자를 이용해서 코드를 제어하는것이 아닌 문장으로 코드를 제어하도록 만들어낸 기능
		// if, switch, for, while, do-while
		// 분기(선택) 제어문(if, switch), 반복 제어문(for, while, do-while)
		// 제어문의 공통된 특징 -> 문장의 시작이 동일하다.
		// 제어문 키워드(제어문임을 명시함과 동시에 제어문의 종류도 명시한다)
		// 
		
//		if(2<3) {
//			System.out.println("1번");
//		}else {
//			System.out.println("2번");
//		}
		
//		int a = scan.nextInt(), b = scan.nextInt();
		// 제어 분기문의 if는 else가 없으면 자동으로 else{}
		// 중괄호 생략 묵시적 허용
//		if(a>b) {
//			System.out.println(a);
//			System.out.println("가 더 큽니다.");
//		}else {
//			System.out.println(b);
//			System.out.println("가 더 큽니다.");
//		}
		
		// 숫자 세개를 입력해서 가장 큰수와 가장 작은 수 출력
		// 숫자 세개를 입력해서 가장 큰수와 작은수를 제외한 수 출력
		
//		int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt();
//		int max, min, other;
//		if(n1>n2) { 
//			if(n1>n3) {
//				max = n1;
//				if(n2<n3) {
//					min = n2;
//					other = n3;
//				}else {
//					min = n3;
//					other = n2;
//				}
//			}else {
//				max = n3;
//				if(n1<n2) {
//					min = n1;
//					other = n2;
//				}else {
//					min = n2;
//					other = n1;
//				}
//			}
//		} else if(n2>n3){
//			max = n2;
//			if(n1<n3) {
//				min = n1;
//				other = n3;
//			}else {
//				min = n3;
//				other = n1;
//			}
//		} else {
//			max = n3;
//			if(n1<n2) {
//				min = n1;
//				other = n2;
//			}else {
//				min = n2;
//				other = n1;
//			}
//		}
//
//		System.out.println(max);
//		System.out.println(min);
//		System.out.println(other);
		
		// 제어문 선택문
		// 하나의 중괄호를 범위별로 구분하기 위해서 case문법을 사용
		// 앱실론이라 부르는 아주 작은 오차 때문에 다른 동작을 할 수 있다보니 실수는 넣을 수 없도록 만들었다.
//		int a = 65;
//		switch(a) {
//		case 'A' : System.out.println("A"); break; 
//		case 0 : System.out.println("0"); break; 
//		case 1 : System.out.println("1"); break;
//		case 2 : System.out.println("2"); break;
//		default : System.out.println("3");
//		}
		
//		switch(scan.nextInt() % 12) {
//		case 0 : System.out.println("원숭이"); break;
//		case 1 : System.out.println("닭"); break;
//		case 2 : System.out.println("개"); break;
//		case 3 : System.out.println("돼지"); break;
//		case 4 : System.out.println("쥐"); break;
//		case 5 : System.out.println("소"); break;
//		case 6 : System.out.println("호랑이"); break;
//		case 7 : System.out.println("토끼"); break;
//		case 8 : System.out.println("용"); break;
//		case 9 : System.out.println("뱀"); break;
//		case 10 : System.out.println("말"); break;
//		case 11 : System.out.println("양"); break;
//		}
		
//		boolean isFemale = false;
//		int birth_year = 2005;
//		if(isFemale) {
//			switch(birth_year) {
//			case 2000: case 2001: case 2002: case 2003: case 2004: case 2005: 
//			case 2006: case 2007: case 2008: case 2009: case 2010: case 2011: 
//			case 2012: case 2013: case 2014: case 2015: case 2016: case 2017: 
//			case 2018: case 2019: case 2020: case 2021: case 2022: case 2023: 
//			case 2024: case 2025: System.out.println();
//			}
//		}
		
		 /*
		  * if 또는 switch문 중 한개를 이용해서 푸는 문제
		  * 세개의 숫자를 입력
		  * 세개의 숫자 중 가장 큰수를 구하고
		  * 가장 큰수 외의 두 수의 차(부호없을)를 출력
		  */
		
//		int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt(),max, s=0;
//		max=n1;
//		
//		if(max < n2) {
//			max = n2;
//			s = n1-n3;
//		}
//		if(max < n3) {
//			max = n3;
//			s = n1-n2;
//		}else s = n2-n3;
//		
//		if(s<0) s *= -1;
//		System.out.println(max);
//		System.out.println(s);
		
		/*
		 * 주민번호 앞자리를 입력하면
		 * 내 띠와 생년월일을 출력하고
		 * 생년월이 4월인 경우 Congraturation을 출력하는 프로그램
		 */
		
//		int birth = scan.nextInt();
//		int year, month,day;
//		year = (birth/10000)%10000;
//		month = (birth/100)%100;
//		day = birth%100;
//		String a="";
//		
//		switch((year) % 12) {
//		case 0 : a = "원숭이"; break;
//		case 1 : a = "닭"; break;
//		case 2 : a = "개"; break;
//		case 3 : a = "돼지"; break;
//		case 4 : a = "쥐"; break;
//		case 5 : a = "소"; break;
//		case 6 : a = "호랑이"; break;
//		case 7 : a = "토끼"; break;
//		case 8 : a = "용"; break;
//		case 9 : a = "뱀"; break;
//		case 10 : a = "말"; break;
//		case 11 : a = "양"; break;
//		}
//		
//		System.out.println(year + "년");
//		System.out.println(month+ "월");
//		System.out.println(day+ "일");
//		System.out.println(a+ "띠");
//		if(month == 4) System.out.println("Congaturation");
		
//		int regist = scan.nextInt();
//		if(regist / 1000000 > 0) System.out.println("잘못된 주민번호 입력");
//		else {
//			int year, month, day;
//			year = regist / 10000;
//			month = (regist - year * 10000) / 100;
//			day = (regist - year * 10000 - month * 100);
//			if (month == 0 || day == 0 || month>12 || day > 31) System.err.println("잘못된 주민번호 입력");
//			else {
//				year = year < 25 ? 2000 + year : 1900 + year;
//				System.out.print(year + "년 / ");
//				System.out.print(month+ "월 / ");
//				System.out.println(day+ "일");
//				switch(year % 12) {
//				case 0 : System.out.println("원숭이"); break;
//				case 1 : System.out.println("닭"); break;
//				case 2 : System.out.println("개"); break;
//				case 3 : System.out.println("돼지"); break;
//				case 4 : System.out.println("쥐"); break;
//				case 5 : System.out.println("소"); break;
//				case 6 : System.out.println("호랑이"); break;
//				case 7 : System.out.println("토끼"); break;
//				case 8 : System.out.println("용"); break;
//				case 9 : System.out.println("뱀"); break;
//				case 10 : System.out.println("말"); break;
//				case 11 : System.out.println("양"); break;
//				}
//				if(month == 4) System.out.println("Congaturation");
//			}
//		}
		
		/*
		 * 주민번호 앞자리와 뒷자리를 입력하면
		 * 생년월일, 외국인 여부, 성별, 띠를 출력하는 프로그램
		 * 주민번호는 앞자리와 뒷자리를 한번에 긴 숫자로 입력
		 */
	}
}
