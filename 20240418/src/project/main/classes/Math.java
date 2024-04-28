package project.main.classes;

// Math 처럼 딱히 정보가 필요없이 메서드만 필요한 경우
// static 으로 메서드들을 모아서 메서드형 클래스를 만드는 경우가 있다.

/**
 * 작성한 내용은
 * <br>
 * 약간의
 * HTML처럼
 * <a href="https://www.naver.com">네이버</a>
 * 동작이 된다.
 */
public class Math {
	// 클래스 메서드에는 this 를 생략하기 위한 기능
	// 정적 메서드 -> static
	// 개인적인 용도로 사용되던 this 가 사라진다
	public static int Factorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i+=1) {
			result *= i;
		}
		return result;
	}
	/**
	 * 
	 * @param n 내용
	 * @param m 내용
	 * @return
	 */
	public static int Square(int n, int m) {
		int result  = 1;
		for(int i = 0; i < m; i+=1) {
			result *= n;
		}
		return result;
	}
	// 메서드를 동일한 이름으로 많이 만들수록 나중에 편리하게 이용할 수 있다.
	// 오버로딩도 부족한 경우
	public static int Square(int n) {
		int result  = 1;
		for(int i = 0; i < 2; i+=1) {
			result *= n;
		}
		return result;
	}
}
