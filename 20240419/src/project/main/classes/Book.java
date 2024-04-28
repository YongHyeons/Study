package project.main.classes;

public class Book {
	public String name;
	public String author;
	
	// Insert 용도의 메서드를 전문적으로 추가
	// 자동으로 실행되도록 만들자
	// 자동 호출 메서드 -> 생성자
	// 생성자라는 메서드는 자동이다보니 결과가 필요없다 -> 결과 타입을 적지 않는다
	// 생성자의 이름 -> 클래스의 이름
	
	// 생성자의 가장 큰 주의점 -> 무조건 생성자가 필요하다
	// 생성자를 위한 특별한 것 -> 묵시적 허용
	// 생성자도 자동으로 작성
	// public 이름(){} -> 디폴트 생성자
	// 아무런 생성자가 없을때에만 제한적으로 자동 생성 된다.
	
	
	// 생성자에 넘기고 싶은 값을 미리 세팅해 놔야지만 생성자가 호출될때 넘겨줄 수 있다.
	// 그래서 생성자에 넘길 값을 미리 세팅해놔야 한다
	
	public Book() {} // 아무런 매개변수가 없는 생성자는 추가적으로 작성
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	public Book(String name) {
		this.name = name;
	}
	
	public Book setName(String name) {
		this.name = name;
		return this;
	}
	public Book setAuthor(String author) {
		this.author = author;
		return this;
	}
}
