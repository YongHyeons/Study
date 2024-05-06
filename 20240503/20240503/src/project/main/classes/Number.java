package project.main.classes;

public class Number<T> {
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return this.data;
	}
}
