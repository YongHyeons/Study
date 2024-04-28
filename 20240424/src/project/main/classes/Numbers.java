package project.main.classes;

public class Numbers implements Foreach{
	public int[] data;
	public Numbers(int...datas) {
		data = datas;
	}
	
	@Override
	public void foreach() {
		for(int v : data) {
			System.out.println(v);
		}
	}
}
