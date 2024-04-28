package project.main.classes;

public class IP6 extends IP4{
	public IP6(String ip) {
		super(ip);
	}
	// 이 메서드는 오버라이딩된 메서드야
//	@Override -> 오버라이딩을 알려주는 어노테이션
//	public void A() {}
	
	@Override
	public void Show() {
		System.out.print("IP6 : ");
		System.out.println(ip);
	}
}
