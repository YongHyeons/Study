package org.archive.main;

public class Book {
	public String title;
	public String author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void Show() {
		System.out.println("Title  : ".concat(title));
		System.out.println("Author : ".concat(author));
	}
}
