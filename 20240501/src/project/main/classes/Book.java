package project.main.classes;

public class Book {
	public String title;
	public String author;
	public Integer price;
	public Double sale;
	public Boolean isSale;
	public Boolean isBest;
	
	public Book(String title, String author, Integer price, Double sale, boolean isBest) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.sale = sale;
		this.isSale = sale == 0.0 ? false : true;
		this.isBest = isBest;
	}


	public void Show() {
		System.out.println("TITLE : ".concat(title));
		System.out.println("AUTHOR : ".concat(author));
		System.out.println("PRICE : ".concat(price.toString()));
		System.out.println("PRICE : ".concat(price.toString()));
	}
	
	
}
