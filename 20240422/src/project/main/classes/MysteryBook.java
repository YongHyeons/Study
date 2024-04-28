package project.main.classes;

public class MysteryBook extends Book {
	public MysteryBook(String name, String author, int price) {
		super(name,author,price);
	}
	@Override
	public void ShowBook() {
		super.ShowBook();
		System.out.println("TYPE   : MYSTERY");
	}
}
