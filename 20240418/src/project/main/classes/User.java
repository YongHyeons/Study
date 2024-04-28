package project.main.classes;

public class User {
	public String id;
	public String pw;
	public String name;
	// Camel-Case 기법에 의존한 기능
	public void InsertInfo(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public void PrintUser() {
		System.out.println(id);
		System.out.println(name);
	}
	public boolean PW_Check(String pw) {
//		return this.pw == pw; 
		// 주소를 비교하기 때문에 오류 발생
		return pw.equalsIgnoreCase(this.pw);
		// equalsIgnoreCase -> 대소문자 구분하지 않고 비교
		
	}
}
