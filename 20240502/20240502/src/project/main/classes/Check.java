package project.main.classes;

public class Check {
	private boolean checker;
	
	public Check(boolean check) {
		checker = check;
	}
	public boolean get() {
		return checker;
	}
	public void Toggle() {
		checker = !checker;
	}
	public void On() {
		checker = true;
	}
	public void Off() {
		checker = false;
	}
}
