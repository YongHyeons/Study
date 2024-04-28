package project.main.classes;

public class CarBuilder {
	public String name;
	public WheelBuilder wheelBuilder = new WheelBuilder(this);
	public GlassBuilder glassBuilder = new GlassBuilder(this);
	public SheetBuilder sheetBuilder = new SheetBuilder(this);
	public Car build() {
		return new Car(name, wheelBuilder.build(), glassBuilder.build(), sheetBuilder.build());	//
	}
	public CarBuilder name(String name) {
		this.name = name;
		return this;
	}
	public WheelBuilder wheel() {
		return wheelBuilder;
	}
	public GlassBuilder glass() {
		return glassBuilder;
	}
	public SheetBuilder sheet() {
		return sheetBuilder;
	}
}
