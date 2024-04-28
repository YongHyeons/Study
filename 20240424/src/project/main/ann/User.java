package project.main.ann;

public class User extends ToStringWrapper{
	@Value("UserID")
	public String id;
	@Value(value="", isValid = false)
	public String pw;
	@Value("*")
	public String location;
	
	@Value("010-****-****")
	public int phone;
	
	public User(String id, String pw, String location) {
		this.id = id;
		this.pw = pw;
		this.location = location;
	}
	
	
}
