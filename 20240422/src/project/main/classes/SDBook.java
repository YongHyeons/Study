package project.main.classes;

public class SDBook extends Book {
	public SDBook(String name, String author, int price) {
		super(name,author,price);
	}
	@Override
	public void ShowBook() {
		super.ShowBook();
		System.out.println("TYPE   : SELF-DEVELOPMENT");
	}

}
