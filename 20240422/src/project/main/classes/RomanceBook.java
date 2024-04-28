package project.main.classes;

public class RomanceBook extends Book {
	public RomanceBook(String name, String author, int price) {
		super(name,author,price);
	}
	@Override
	public void ShowBook() {
		super.ShowBook();
		System.out.println("TYPE   : ROMANCE");
	}
}
