package project.main.classes;

public final class Compare {
	private Compare() {}
	
	// 메서드 제너릭도 꽤나 이용을 많이 한다
	public static <T> T Big(T...args) {
		T max = args[0];
//		for(T arg : args) {
//			// 연산자는 원시타입에만 이용이 가능해서
//			
//			max = arg > max ? arg : max;
//		}
		return max;
	}
}
