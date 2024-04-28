package project.main.classes;

public class User {
	private String id; // 외부에서는 접근이 불가능
	private String pw;
	public String name;
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getID() {
		return this.id;
	}
	public String getPW() {
		return this.pw;
	}
	public String getName() {
		return this.name;
	}
}
