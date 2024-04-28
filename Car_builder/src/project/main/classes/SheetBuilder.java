package project.main.classes;

public class SheetBuilder {
	public boolean leather_Sheet;
	public CarBuilder owner;
	public SheetBuilder(CarBuilder owner) {	
		this.owner = owner;
	}
	public SheetBuilder leather(boolean leather_Sheet) {
		this.leather_Sheet = leather_Sheet;
		return this;
	}
	public CarBuilder owner() {
		return owner;
	}
	public Sheet build() {
		return new Sheet(leather_Sheet);
	}
}
