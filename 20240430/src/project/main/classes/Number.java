package project.main.classes;

import java.util.Comparator;

public class Number implements Comparable<Number>, Comparator<Number>{
	private int number;
	public Number(int number) { this.number = number; }
	
	@Override
	public int compareTo(Number o) {
		// 나와 받아온 매개변수 1개를 비교하는 메서드
		return number - o.number;
	}

	@Override
	public int compare(Number o1, Number o2) {
		// 받아온 매개변수 2개를 비교하는 메서드
		return o1.number - o2.number;
	}
}
