package project.main.classes;

// interface -> 메서드만 가지는 class
// interface에서는 실체가 없는 메서드만 존재한다 -> abstract(가상 메서드, 추상 메서드)
// 일반적인 메서드 추가가 불가능한 이유 -> 중복될 확률이 존재 -> 충돌로 인한 문제
// 제한적인 기능의 메서드를 만든다면 -> 중복이 된다 하더라도 충돌로 인한 문제가 없을 수 있다

public interface Act {
	public /* abstract */ void A();
	
	// default 메서드 -> 여기 쓰이는 default 는 접근제한자가 아님
	public default void b() {
		// static 메서드를 사용하는것과 비슷
		this.A();
	}
}
