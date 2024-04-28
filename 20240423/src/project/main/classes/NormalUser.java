package project.main.classes;

// 추가적인 정보를 설명하는 어노테이션 Deprecated, Suppresswarnings

public class NormalUser extends User {

	public String signup;
	public int useCount;
	
	public NormalUser(String id, String pw, String signup, int useCount) {
		super(id, pw);
		this.signup = signup;
		this.useCount = useCount;
	}

	@Override
	@SuppressWarnings("all") // 해당하는 경고를 생성하지마
	public void Show() {
		System.out.println("ID     : ".concat(id));
		System.out.println("PW     : ".concat(pw));
		System.out.println("SIGNUP : ".concat(signup));
		Integer use = new Integer(useCount);
//		Integer use = useCount;
		System.out.println("COUNT  : ".concat(use.toString()));
	}
}
