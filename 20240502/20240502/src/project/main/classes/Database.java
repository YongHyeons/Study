package project.main.classes;

public class Database {
	public int data;
	public int get() { 
		return data; 
	}
	
	public void set(int data) {
		
		// wait과 notify를 한번에 사용하는 제어문
//		synchronized(this) {
//			this.data = data;
//		}
		
//		try {
//			this.wait();
//		} catch (Exception e) {}
//		this.data = data;
//		this.notify();
	}
}
