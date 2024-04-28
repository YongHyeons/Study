package project.main.ann;

public class MethodA implements InterA{
	public void InterfaceMethods() {}

	
	public MethodA() {
		AnnoA a = this.getClass().getAnnotation(AnnoA.class);
		
	}


	@Override
	public void A() {
		System.out.println("A");
	}

	@Override
	public void B() {
		System.out.println("B");
	}
}
