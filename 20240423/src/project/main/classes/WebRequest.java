package project.main.classes;

// final class -> 더이상 확장은 없어
public /* final */ abstract class WebRequest {
	// class 멤버 변수에 값을 넣는 경우 2가지 -> 직접 대입, 생성자
	// public int a = 5; -> 직접 대입
	// constructor(int a){ this.a = a; } -> 생성자
	protected final String url;
	
	public WebRequest(final String url) {
		this.url = url;
	}
	// final method -> 메소드 변화 없음
	// method 가 더이상 변화가 없을 예정이야
	// 오버로딩이 막히는게 아니라 오버 라이딩이 막히는 기능
	public /* final */ void OpenUrl() {
		System.out.println(url.concat(" is open!"));
	}
//	public void OpenUrl(String a) {}
	
	// 가상 메서드를 가지게 되는 해당 클래스는 생성이 불가능해진다
	// 가상 메서드를 가진 클래스 -> 가상 클래스
	public abstract void A(); // 본문을 포함시키지 마라
}

// 추상 키워드와 마지막 키워드를 이용하면
// 단순하게 데이터를 확장해라 가 아니라
// 필요에 의해 확장을 막거나 강제해서 구조를 마음대로 조절할 수 있다

class WebRequestExtend extends WebRequest{
	
	public WebRequestExtend(String url) {
		super(url);
	}
	public void OpenUrl() {
		System.out.println(url.concat(" is open 2!"));
	}
	
	// 베이스 클래스의 실체가 없는 가상 메서드를 실체를 추가한 메서드
	@Override
	public void A() {};
}