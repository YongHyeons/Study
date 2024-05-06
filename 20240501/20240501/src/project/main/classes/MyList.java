package project.main.classes;

import java.util.*;

public class MyList<T> implements Iterable<T>{
	private T[] data;
	
	public MyList(T...args) {
		this.data = args;
	}

	@Override
	public Iterator<T> iterator() {
		Iterator<T> a = new Iterator<T>(){
			private int index = -1;
			@Override
			public boolean hasNext() {
				return data.length - 1 > index;
			}

			@Override
			public T next() {
				index += 1;
				return data[index];
			}
		};
		return a;
	}
	
}
