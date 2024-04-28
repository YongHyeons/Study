package project.main.classes;

public class WheelBuilder {
	public CarBuilder owner;
	public String name;
	public WheelBuilder(CarBuilder owner) {	
		this.owner = owner;
	}
	public WheelBuilder name(String name) {
		this.name = name;
		return this;
	}
	public CarBuilder owner() {
		return owner;
	}
	public Wheel build() {
		return new Wheel(name);
	}
}
