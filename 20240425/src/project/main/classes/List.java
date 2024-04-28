package project.main.classes;

// Books 여러개의 책을 관리하는 클래스
// 특정 정보를 관리하는 클래스
// List 클래스를 만들기 위해서는 Node 라는 클래스가 내부적으로 필요

// 특정 클래스 안에 다른 클래스를 포함하는 기법
// 클래스를 일반적인 방법으로 만들지 않고 특정 범위에 예속되도록 작성하는 기능
// 내부 클래스
// 특정 지역에 들어있는 클래스를 내부 클래스라 부른다
// 멤버 내부 클래스
// 전역 내부 클래스
// 지역 내부 클래스
// 익명 클래스
public class List {
	public int ListValue;
	
	// 멤버 내부 클래스는 생성 방법부터 매우 다르기 때문에
	public class Node{
		// 외부에 있는 ListValue변수에 접근이 가능하다
		// 멤버 내부 클래스는 외부 클래스와 연결이 된다
		
		public void NodeMethod() {
			// 외부에서 받아온 this 를 사용하는 방법
			List.this.ListValue = 5;
			
			// this -> 일반적인 this -> 나를 가르키는것
			this.toString();
		}
	} // 멤버 내부 클래스
	
	// 외부 클래스와는 아무런 상관없이 나는 나대로 그냥 안에 들어있을거야
	
	public static class Node2{
		public int a;
		public void A() {
			System.out.println("출력 Node2");
		}
	} // 전역 내부 클래스
	
	void ListMethod() {
		this.new Node();	// 멤버 내부 클래스도 전역 내부 클래스처럼 new ClassName();
		new Node2();	// 이것만 전역 내부 클래스에 문제가 없느냐
	}
}

class Tree{
	class Node{ }
}