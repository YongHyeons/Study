package project.main;

import project.main.classes.*;

public class MainApp /* extends Object */ { 
	public static void main(String[] args) {
		// 확장 extends
		// Object
		// 아무것도 없는 카테고리(클래스)로 묶어버린다면
		// 모든 클래스를 관리하는게 가능해진다
//		String a;
//		a.
		
//		WebRequest request = new WebRequest("https://www.naver.com");
//		
//		request.OpenUrl();
		// 확장만을 막기 위해서 나온 기능이 아니라
		// 변화를 막기 위해서 나온 기능 final
		// final 키워드가 동작하는 대상 -> 변수, 메서드, 클래스
//		final int a = 5;
//		a = 6;
		
		// final 키워드를 이용한다면 더이상 변화가 생기지 않도록 기능 제한
		// 성능저하 없이 확장을 하기 위해서 위에있는 메서드(베이스 클래스의 메서드)를 없앤다
		// 그냥 없애면 되느냐? X -> 오버라이딩은 되는데 실체는 없는 메서드 O
		// 가상 메서드 -> 추상화 -> abstract
		
//		String a = new String("ABC");
//		Object b = a;	// Object 가 String 의 상위(베이스) 클래스니까
		
		// 내가 지금 들어있는 클래스가 뭐였지?
		
		// 어쩔수 없이 다운캐스팅이 필요한 경우에 파악을 위한 기능
		// 만약에 기능을 안쓴다면 -> 오류가 범람
		// 그래서 다운캐스팅에서 실제로 들어있는 클래스를 파악하기 위한 기능
		// reflection(거울, 반사) 기능을 이용해서 현재 클래스가 무엇인지 파악하는 기능
		// instance equal 기능이 생겼다
		// 매우 특수한 연산자 -> 클래스의 자료형을 파악하기위한 연산자
		// 연산자 -> 특수한 연산을 위한 특수문자
		// 특수문자가 아닌 글자로 이루어진 연산자
		// instanceof
		// 인스턴스 instanceof 클래스
		
		
//		Parent a = new Parent();
//		Child b = new Child();
//		Sister c = new Sister();
//		
//		a.ParentShow();
//		b.ChildShow();
//		c.SisterShow();
//		
//		Parent[] arr = {a, b, c};
		// Parent, Child, Sister
		// Parent -> Parent
		// Child -> Parent, Child
		// Sister -> Parent, Sister
		// instanceof를 무조건 알아야 하느냐?
		// 몰라도 크게 문제는 안생긴다
		// 업캐스팅만 하는것이 좋은 코드
//		for(Parent p : arr) {
////			((Sister)p).ParentShow();
//			// p instanceof Parent -> boolean
////			p.ParentShow();
//			if(p instanceof Parent)
//				p.ParentShow();
//			if(p instanceof Child)
//				((Child)p).ChildShow();
//			if(p instanceof Sister)
//				((Sister)p).SisterShow();
//		}
		/*
		 * 유저 클래스 생성
		 * 유저는 일반유저, VIP유저, 관리자유저, 개발자 로 나뉜다
		 * 모든 유저를 일괄 관리할 수 있어야한다
		 * 일반 유저는 계정명, 비밀번호, 가입일, 서비스 사용 횟수를 가진다
		 * VIP 유저는 일반 유저 정보에 추가 서비스 내역을 가진다
		 * 관리자 유저는 일반 유저 정보에 관리 영역을 가진다
		 * 개발자는 계정명, 비밀번호를 가진다
		 * 각 유저는 자신이 가진 정보를 출력하는 Show 메서드를 가진다
		 * 관리자 유저와 개발자는 더이상 확장이 되어선 안된다
		 * VIP유저는 추가 서비스 요청 메서드를 가지고 있다
		 * 모든 유저 정보를 한개씩 출력하고 VIP유저는 추가 서비스 요청도 실행한다
		 */
		
//		User[] users = {
//				new NormalUser("abc","abc","24/04/23",0),
//				new VIPUser("abc2","abc2","24/04/23",0,"Sale"),
//				new ManagerUser("abc3","abc3","24/04/23",0,"Client"),
//				new Developer("abc4","abc4")
//		};
//		
//		for(User user : users) {
//			user.Show();
////			user.Test();
//			if(user instanceof VIPUser) ((VIPUser) user).RequestService();
//			System.out.println();
//		}
		
		/*
		 * VIPUser의 서비스가 앞으로 폐지될 예정
		 * 서비스를 deprecated
		 * developer의 Show는 개발자가 직접 작성하는 것
		 * 특별한 문제가 생기지 않는한 경고를 전부 없도록
		 * User에 deprecated예정인 ipChange와 pwChange 추가
		 */
		
		
	}
}
