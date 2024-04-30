package project.main.classes;

import project.main.interfaces.Cloneable;

// 구멍에 명칭을 작성하는것부터 -> 제너릭 기법을 사용한다는 선언
// 클래스명 뒤에 <명칭1, 명칭2 ... 명칭n> -> 내가 현재 클래스를 n개의 구멍으로 뚫어서 제너릭을 만듬 
// 제너릭 기법으로 어떤 자료형이던지 관리가 가능한 List

// 확장할때 이름<T> -> 채워넣는 용도
public class List<T> implements project.main.interfaces.Cloneable<List<T>>{
	private T[] datas;

	public List(T...args) {
		datas = args;
	}
	
	public T get(int index) {
		return datas[index];
	}
	
	public void set(int index, T data) {
		datas[index] = data;
	}
	
	
	@Override
	public List<T> clone(){
		return new List<T>();
	}
}
