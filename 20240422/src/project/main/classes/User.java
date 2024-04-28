package project.main.classes;

// 클래스를 많이 이용하다 보면 낭비되는 정보를 가지는 클래스가 생길것 같은 순간
// 클래스의 낭비되는 정보를 낭비되지 않도록 하기위한 기능
// 확장

// User클래스에 판매자 정보인 company를 추가하고 싶다
// 기본 User클래스는 유지한 상태로 추가적인 정보만 추가해서 새로운 클래스를 만들어낸다면?
// 기본 클래스 정보에 새로운 정보를 추가하는 방법 -> 확장

// protected -> 확장 전용 접근 제어자
public class User {
	public String id;
	public String pw;
	
	// 확장 이전 클래스에 생성자
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void Sale() {
		Sale(30);
	}
	
	public void Sale(int n) {
		System.out.print(n);
		System.out.println("%의 할인");
	}
}

// 접근 제어자
// public		- 내부, 외부, 외부(상속), 패키지, 패키지 외부
// protected	- 내부, 외부(상속), 패키지, 패키지 외부
// default		- 내부, 외부, 외부(상속), 패키지
// private		- 내부











