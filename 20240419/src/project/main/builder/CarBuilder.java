package project.main.builder;

public class CarBuilder {
	public String name;
	public WheelBuilder wheelBuilder = new WheelBuilder(this);
	public Car build() {
		return new Car(name, wheelBuilder.build());
	}
	public CarBuilder name(String name) {
		this.name = name;
		return this;
	}
	public WheelBuilder wheel() {
		return wheelBuilder;
	}
}
