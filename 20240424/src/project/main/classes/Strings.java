package project.main.classes;

public class Strings implements Foreach{
	public String[] data;
	public Strings(String...datas) {
		this.data = datas;
	}
	
	@Override
	public void foreach() {
		for(String v : data) {
			System.out.println(v);
		}
	}
}
