package project.main.classes;

public class Book {
	public String name;
	public String author;
	public int price;
	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public void ShowBook() {
		System.out.print("NAME   : ");
		System.out.println(name);
		System.out.print("AUTHOR : ");
		System.out.println(author);
		System.out.print("PRICE  : ");
		System.out.println(price);
	}
}












