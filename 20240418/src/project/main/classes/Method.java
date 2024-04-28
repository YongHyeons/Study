package project.main.classes;

public class Method {
	public	// 접근제한자
	void	// 반환 형태
	Name //내가 이 메서드를 고유하게 인식하기위한 지칭명 이름
	(	// 행동양식의 요구사항(매개변수)
	// 반환 형태와 매개변수에 대해 배워야한다
	int a, int b, float c, String d // 동일한 자료형이라도 자료형을 안적을 수 없다
	)	
	{	
		System.out.println(a);
	}
	
	public void PlusShow(int a, int b) {
		System.out.println(a+b);
	}
	public 
	// return 으로 반환하고 싶은 정보를 어떤 변수에 저장해야 하는데
	// 저장해야 하는 변수를 내가 만들겠다.
	// 만들어야 할 변수의 자료형
	// void 반환형태(리턴타입)
	int	
	Plus(int a, int b) {
		return a+b;
		// return 오른쪽에 적힌것이 반환하고 싶은 정보
	}
}
