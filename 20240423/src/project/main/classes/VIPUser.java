package project.main.classes;

public class VIPUser extends NormalUser{
	public String service;
	
	public VIPUser(String id, String pw, String signup, int useCount, String service) {
		super(id, pw, signup, useCount);
		this.service = service;
	}
	
	@Override
	public void Show() {
		super.Show();
	}
	
	@Deprecated
	public void RequestService() {
		System.out.println("REQUEST: ".concat(service));
	}
}
