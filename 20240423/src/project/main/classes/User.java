package project.main.classes;

public abstract class User {
	public String id;
	public String pw;
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Deprecated
	public void Test() {
		System.out.println("테스트");
	}
	public abstract void Show();
	
	@Deprecated
	public void idChange(String id) { this.id = id; }
	@Deprecated
	public void pwChange(String pw) { this.pw = pw; }
	
	
}
