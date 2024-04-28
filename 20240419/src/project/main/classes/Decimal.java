package project.main.classes;

public class Decimal {
	public int data;
	public Decimal(int data) { this.data = data; }
	public Decimal(Decimal other) {
		this.data = other.data;
	}
	// 클론 메서드
	public Decimal clone() {
		return new Decimal(this);
	}
}
