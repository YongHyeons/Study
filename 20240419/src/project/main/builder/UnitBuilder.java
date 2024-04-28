package project.main.builder;

public class UnitBuilder {
	private int hp;
	private int mp;
	private int level;
	private String name;
	
	public Unit build() {
		return new Unit(hp, mp, level, name);
	}
	public UnitBuilder hp(int hp) {
		this.hp = hp;
		return this;
	}
	public UnitBuilder mp(int mp) {
		this.mp = mp;
		return this;
	}
	public UnitBuilder level(int level) {
		this.level = level;
		return this;
	}
	public UnitBuilder name(String name) {
		this.name = name;
		return this;
	}
}
