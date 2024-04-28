package project.oper.main;

import java.util.Scanner;

// Ctrl + O -> 이동 기능
// Ctrl + L -> 이동 기능
// Alt + Arrow -> 이동 기능
public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i1 = scan.nextInt(), i2 = scan.nextInt(), i3 = scan.nextInt();
		double d1 = scan.nextDouble(), d2 = scan.nextDouble();
		
		double max, min;
		max = i1;
		max = max > i2 ? max : i2;
		max = max > i3 ? max : i3;
		max = max > d1 ? max : d1;
		max = max > d2 ? max : d2;
		
		min = i1;
		min = min < i2 ? min : i2;
		min = min < i3 ? min : i3;
		min = min < d1 ? min : d1;
		min = min < d2 ? min : d2;
		
		System.out.println(max +" "+ min);
		
		System.out.println(max+min);
		System.out.println(max-min);
		System.out.println(max*min);
	}
}

