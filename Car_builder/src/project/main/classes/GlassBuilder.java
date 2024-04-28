package project.main.classes;

public class GlassBuilder {
	public boolean bulletproof_Glass;
	public CarBuilder owner;
	
	public GlassBuilder(CarBuilder owner) {	
		this.owner = owner;
	}
	public GlassBuilder bulletproof(boolean bulletproof_Glass) {
		this.bulletproof_Glass = bulletproof_Glass;
		return this;
	}
	public CarBuilder owner() {
		return owner;
	}
	public Glass build(){
		return new Glass(bulletproof_Glass);
	}
}
