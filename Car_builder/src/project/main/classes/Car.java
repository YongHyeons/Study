package project.main.classes;

public class Car {
	public String name;
	public Wheel wheel;
	public Glass glass;
	public Sheet sheet;
	
	public Car(String name, Wheel wheel, Glass glass, Sheet sheet) {
		this.name = name;
		this.wheel = wheel;
		this.glass = glass;
		this.sheet = sheet;
	}
}
