package project.main;

import project.main.classes.Array;

public class ArrayList {
	private int[] datas;
	public ArrayList() { this.datas = new int[0]; }
	public ArrayList(int...args) { this.datas = args; }
	public ArrayList(ArrayList other) {
		datas = new int[other.datas.length];
		for(int i = 0; i < datas.length; i+=1)
			datas[i] = other.datas[i];
	}
	public void forEach(NumberInterface inter) {
		for(int data : datas) {
			inter.Act(data);
		}
	}
	public ArrayList filter(BooleanInterface inter) {
		ArrayList copy = new ArrayList();
		for(int data : datas) {
			if(inter.Filter(data)) {
				copy.push(data);
			}
		}
		return copy;
	}
	public ArrayList map(MapInterface inter) {
		ArrayList copy = clone();
		for(int i = 0; i< copy.datas.length; i+=1) {
			copy.datas[i] = inter.map(copy.datas[i]);
		}
		return copy;
	}
	public int reduce(ReduceInterface inter) {
		int result = datas[0];
		for(int i = 1; i < datas.length; i+=1) {
			result = inter.reduce(result, datas[i]);
		}
		return result;
	}
	public int reduce(ReduceInterface inter, int def) {
		int result = def;
		for(int i = 0; i < datas.length; i+=1) {
			result = inter.reduce(result, datas[i]);
		}
		return result;
	}

	public ArrayList clone() {
		return new ArrayList(this);
	}
	public void push(int data) {
		int[] copy = new int[datas.length + 1];
		for(int i = 0; i < datas.length; i+=1)
			copy[i] = datas[i];
		copy[copy.length - 1] = data;
		datas = copy;
	}
	public int pop() {
		int[] copy = new int[datas.length - 1];
		for(int i = 0; i < copy.length; i+=1)
			copy[i] = datas[i];
		int result = datas[datas.length - 1];
		datas = copy;
		return result;
	}
}
