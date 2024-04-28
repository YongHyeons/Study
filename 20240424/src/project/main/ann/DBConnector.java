package project.main.ann;

public abstract class DBConnector {
	public DBConnector() {
		IP ip = this.getClass().getAnnotation(IP.class);
		if(ip == null) System.out.println("IP가 없음");
		else {
			System.out.println(ip.value().concat(" is connect"));
		}
	}
	
	public abstract void Get();
	public abstract void Set();
}
