package project.main.classes;

// 배열을 간단하게 관리하는 클래스

public class Array {
	private int[] datas;
	public Array() { datas = new int[0]; }
	
	public boolean empty() { return datas.length < 1; }
	
	public class Inserter{
		public void push(int data) {
			int[] copy = new int[Array.this.datas.length + 1];
			for(int i = 0; i < Array.this.datas.length; i+=1)
				copy[i] = Array.this.datas[i];
			copy[copy.length - 1] = data;
			Array.this.datas = copy;
		}
	}
	public class Remover{
		public int pop() {
			int[] copy = new int[Array.this.datas.length - 1];
			for(int i = 0; i < copy.length; i+=1)
				copy[i] = Array.this.datas[i];
			int result = Array.this.datas[Array.this.datas.length - 1];
			Array.this.datas = copy;
			return result;
		}
	}
}
