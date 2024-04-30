package project.main.classes;

import java.util.function.*;

public class Book {

	public String title;
	public String author;
	public int price;
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void Show(Consumer<Book> target) {
		target.accept(this);
	}
	
	public String toString(Function<Book, String> target) {
		return target.apply(this);
	}
}
