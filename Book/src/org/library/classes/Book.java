package org.library.classes;

public class Book {
	private String title;
	private String author;
	private Integer price;
	private Boolean isBest;
	private Double sale; // 0 ~ 1 X -> 0 ~ 100 O
	
	public Book(String title, String author, Integer price, Boolean isBest, Double sale) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isBest = isBest;
		this.sale = sale;
	}
	
	public Book() { this("무명", "무명", 0, false, 0.0);}
	
//	public void normalPrint() {
//		System.out.println("제목 : " + getTitle() + (getIsBest() ? " ★" : ""));
//		int temp = getPrice() - getPriceSale();
//		System.out.println("가격 : " +
//				(getSale() != 0 ?  (temp + " ( " + getPrice().toString() + " ) " ) : getPrice().toString() )
//			);
//		System.out.println("작가 : " + getAuthor());
//		System.out.println();
//	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public void setIsBest(Boolean isBest) {
		this.isBest = isBest;
	}
	public void setSale(Double sale) {
		this.sale = sale;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public Integer getPrice() {
		return price;
	}
//	public Integer getPriceSale() {
//		return (int)(price * this.getSaleOp().doubleValue());
//	}
	public Integer getPriceSale() {
		return price - (int)(price * this.getSaleOp().doubleValue());
	}
	public Boolean getIsBest() {
		return isBest;
	}
	public Double getSale() {
		return sale;
	}
	
	public Double getSaleOp() {
		return sale / 100.0;
	}
	
	
}
