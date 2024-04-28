package project.main.classes;

public class Test {
	// 메서드 안에서 생긴 오류는 메서드 안에서만 처리가 가능하다
	// 메서드 바깥으로 오류를 던지기 위해서는 추가적인 던지는 기능을 작성해야한다
	// 그 기능이 바로 throws Exception
	
	// Exception 오류를 확장해서 만드는 Custom Exception
	// 커스텀 오류를 catch 할때 자동으로 구분하기 위해서 나온 멀티 catch
	public void run() throws ArithmeticException, Exception{
		
		// 멀티 catch -> 한개의 try 에 여러개의 catch 를 붙인것
//		try {
			int a = 5, b = 0;
			System.out.println(a / b);
//		} 
//		catch (ArithmeticException e) {
//			System.out.println("Test run / by zero catch");
//		}
//		catch (Exception e) {
//			System.out.println("Test run catch");
//		} 
	}
}
