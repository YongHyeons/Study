package project.main.classes;

public class SignupUser {
	public String id;
	public int age;
	public String address;
	public String pw;
	public String pwre;
	
	public SignupUser(String id, String pw, String pwre, int age, String address) {
		this.id = id;
		this.pw = pw;
		this.pwre = pwre;
		this.age = age;
		this.address = address;
	}


	// Exception 을 만들기만 하는것은 아무 의미가 없다
	// 만들어진 Exception 을 직접 발생시켜 던져야지만 의미가 생긴다
	// 그래서 사용자가 직접 오류를 발생시키는 구문 -> throw
	
	public void Signup() throws PasswordException, IDException, AgeException ,Exception{
		if(id.isEmpty()) throw new IDException();
		if(age<15) throw new AgeException();
		if(!pw.equalsIgnoreCase(pwre)) throw new PasswordException();
		System.out.println("회원가입 성공");
	}
}
