package project.main.classes;

public final class Developer extends User{
	
	public Developer(String id, String pw) {
		super(id,pw);
	}
	
	@Override
	@SuppressWarnings("all")
	public void Show() {
		System.out.println("ID     : ".concat(id));
		System.out.println("PW     : ".concat(pw));
	}
}
