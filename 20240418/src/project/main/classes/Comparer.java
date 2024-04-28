package project.main.classes;

public class Comparer {
	// Spread Variable
	public static int Big(int...arr) {
		int big = arr[0];
		for(int d : arr) {
			big = big < d ? d : big;
		}
		return big;
	}
	
	// 스프레드까지 이용이 가능하다면 -> 그러면 메서드의 기본 사용방법
	
	// Spread 형식은 오버로딩과는 궁합이 안맞다
//	public static void A(int a, float b) {}
//	public static void A(int a) {}
//	public static void A(int...a) {}
//	public static void A(int a, int...b) {}
	
	
//	public static int Big(int[] arr) {
//		int big = arr[0];
//		for(int d : arr) {
//			big = big < d ? d : big;
//		}
//		return big;
//	}
	
	
//	public static int Big(int a, int b) {
//		return a > b ? a : b;
//	}
//	public static int Big(int a, int b, int c) {
//		return Big(Big(a,b),c);
//	}
//	public static int Big(int a, int b, int c, int d) {
//		return Big(Big(a, b, c),d);
//	}
}