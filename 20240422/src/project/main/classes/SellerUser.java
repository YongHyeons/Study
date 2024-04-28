package project.main.classes;
//class를 확장할때 주의할 사항
//1. 내가 만드는 클래스는 덧붙여지는 클래스다 => super
//2. 두개의 클래스는 별개의 클래스다 => 오버라이딩을 마구잡이로 하면 안된다
							//	오버라이딩보단 오버로딩을 적극 이용
//3. 다이아몬드 확장은 불가능하다 => 무조건 확장만이 답은 아니다
//4. 어노테이션(annotation)을 작성해라
// 어노테이션 => 설명서(Reflection)

//확장
//원래 있던 정보에 추가적인 정보를 더하는것
public class SellerUser extends User {
	// public User user;
	public String company;
	
	// 확장 클래스 생성자에서 기본 클래스 생성자를 부르는 기법
	// 기본 클래스 호출법 -> super
	public SellerUser(String id, String pw, String company) {
		// super == 상위 this
//		super.id;
//		super.pw;
		super(id, pw); // 상위 this(id, pw)
		this.company = company;
	}
	
	public void SellerSale() {
		
	}

	public void Sale() {
		super.Sale(50);
	}
//	public void SuperSale() {
//		super.Sale();
//	}
	
//	public void A() {
//		this.id = "1234";
//		this.pw = "1234";
//		this.company = "1234";
//	}
}






















