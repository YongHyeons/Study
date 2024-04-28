package project.main.classes;

//import java.util.Scanner;

public class Gugudan {
//	public class Ggd{
//		public void Mul() {
//			Scanner scan = new Scanner(System.in);
//			int number = scan.nextInt();
//			for(int i = 1; i<10; i+=1)
//				System.out.println(number + " X " + i + " = " + number*i);
//		}
//	}
// -------------------------------------------------------------------------------
	private int maxDan;
	
	public class MaxDanChanger{
		public void change(int dan) {
			/* Gugudan.this. */maxDan = dan;
		}
	}
	public void Print() {
		for(int i = 1; i<=maxDan; i+=1) {
			for(int x = 1; x<=9; x+=1) {
				System.out.print(i);
				System.out.print(" X ");
				System.out.print(x);
				System.out.print(" = ");
				System.out.println(x*i);
			}
			System.out.println("----------------------");
		}
	}
	
}
