package project.main.classes;

public class Book {
	public String name;
	public String author;
	public int price;
	public void InsertBook(String name, String author, int price) {
		// 매개변수로 받아온 값을 클래스 this 안에 넣어라
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public void ShowBook() { // Book book -> Book this(this 포인터)
		// this.도 매번 쓰니까 귀찮다 -> 생략가능
		System.out.print("NAME : ");
		System.out.println(name);
		System.out.print("AUTHOR : ");
		System.out.println(author);
		System.out.print("PRICE : ");
		System.out.println(price);
	}
}
