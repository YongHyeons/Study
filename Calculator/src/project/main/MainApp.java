package project.main;

import java.util.Scanner;

// Ctrl + i -> Indent (코드 정리)
/*
 * 1개의 변수를 이용해서 정수를 입력하고 출력
 * 실수를 입력하고 출력
 * 문장을 입력하고 출력
 * 
 */

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int num1, num2;
//		
//		System.out.println((num1 = scan.nextInt()) + " " +(num2 = scan.nextInt()) + " " +(num1 = scan.nextInt()));
		
		String st;
		System.out.println((st = scan.nextInt() + " ") + (st = scan.nextFloat() + " ") + (st = scan.next()));
	}
}

