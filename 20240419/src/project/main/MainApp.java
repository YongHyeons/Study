package project.main;

import project.main.builder.CarBuilder;
import project.main.builder.Unit;
import project.main.builder.UnitBuilder;

public class MainApp {
	public static void main(String[] args) {
		// 생성을 한 후 메서드를 호출하여 초기화해야 한다는것
//		new String("A").equalsIgnoreCase("ABCD");
		// 존재하는것을 이용해서 불가능한것을 가능케 만들어보자 -> Chaining
//		Book book = new Book().setName("ABC").setAuthor("작가");
		// Method Chaining은 결과값이 없는 메서드에 자기 자신을 결과값으로 할당
		// 이런 동작이 바로 생성자
//		Book book = new Book("ABC", "작가");
//		
//		System.out.println(book.name);
//		System.out.println(book.author);
		
//		new Cookie("A", "B", "domain", "path", 50, 50, true, false, false);
//		new Cookie("A", "B", "domain");
		
//		Decimal a = new Decimal(5);
//		// 변수의 값을 복사
////		Decimal b = new Decimal(a);
//		Decimal b = a.clone();
//		System.out.println(a.data);
//		System.out.println(b.data);
//		a.data = 6;
//		System.out.println(a.data);
//		System.out.println(b.data);
//		
		/*
		 * 게시글 클래스 제작
		 * 게시글은 게시글 본문, 제목, 조회수, 좋아요, 작성자가 있다
		 * 작성자는 유저 클래스
		 * 유저 클래스는 아이디, 비밀번호가 있다
		 * 게시글 본문은 내용 클래스
		 * 내용은 텍스트 내용, 파일명 배열, HTML이 있고 HTML 여부가 있다
		 */
//		User user = new User("id","pw", "이름");
//		Body body = new Body("내용",new String[] {"file1"},true);
//		Board board = new Board(body, "제목", 20, 20, user.getID());
		
		// 생성자의 단점 -> 동일한 자료형은 구분이 힘들다, 무엇을 넣고 빼는지 선택이 힘들다
		// 빌더 패턴
		
//		UnitBuilder builder = new UnitBuilder();
//		Unit a = builder.hp(50).name("유닛").build();
//		Unit b = builder.name("이름").build();
//		
		// 조립 패턴 -> 여러개의 빌더 패턴을 혼합한 빌더 패턴
		
		CarBuilder builder = new CarBuilder();
		builder.name("아반떼").wheel().name("금호타이어").owner().name("포르셰").build();
		builder.wheel().name("넥센").owner().build();
		
		/*
		 * 자동차 조립패턴으로 생성
		 * 자동차는 휠, 이름, 유리, 시트
		 * 휠은 제조사명
		 * 유리는 방탄유리 여부
		 * 시트는 가죽 여부
		 * 자동차를 내 입력으로 생성한 후 출력하는 프로그램
		 */
		
	}
}
