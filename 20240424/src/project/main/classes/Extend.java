package project.main.classes;

// extends 는 클래스를 1:1 확장할 때 이용하는 것
// interface 를 확장하는것은 -> implements

public class Extend implements Act, Out{
	
	// 대상에게 @클래스명 붙이는 방식으로 작성하는게 바로 어노테이션
	@First(A="기본값이 아닌 다른값", value = 5)
	public int a;
	
	@Override
	public void A() {
		System.out.println("Act 오버라이딩");
	}
	@Override
	public void B() {
		System.out.println("Out 오버라이딩");
	}
}
