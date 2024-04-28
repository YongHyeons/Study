package project.main.sub1;

// 공개 클래스
public class Board{ // 실체가 있는것이 X, 설명서 O
	int number; // 실체가 있는 변수 X, 설명서에 적힌 모양 O
	String title; // 접근지정자를 안적으면 기본적으로 default
	String author;
	public int view; // 내부, 외부, 외부(확장), 동일 패키지, 외부 패키지 모두 공개
	int like;
}

// 비공개 클래스
// public이 없고 파일명과 이름이 다르다
// default가 붙어있는 형식 -> 동일 패키지에서만 사용이 가능한 클래스
class A{
	
}