package project.main.classes;

public class MethodOuterClass {
	public int value;

	public void Method(){
		
		// 지역 내부 클래스가 가져가서 쓸 수 있는것 중 -> this
		
		class MethodInnerClass{
			public void Test() {
				// 그냥 this -> 나
//				MethodOuterClass.this.value = 5;
				// this.Test();
				// 가능하다
				System.out.println(value);
			}
		}
		
	MethodInnerClass test = new MethodInnerClass();
	test.Test();
	}
}
