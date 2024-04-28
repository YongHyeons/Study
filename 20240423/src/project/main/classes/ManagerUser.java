package project.main.classes;

public final class ManagerUser extends NormalUser{
	public String area;

	public ManagerUser(String id, String pw, String signup, int useCount, String area) {
		super(id, pw, signup, useCount);
		this.area = area;
	}
	@Override
	public void Show() {
		super.Show();
		System.out.println("AREA   : ".concat(area));
	}
}
