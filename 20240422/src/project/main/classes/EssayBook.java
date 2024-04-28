package project.main.classes;

public class EssayBook extends Book{
	public EssayBook(String name, String author, int price) {
		super(name,author,price);
	}
	@Override
	public void ShowBook() {
		super.ShowBook();
		System.out.println("TYPE   : ESSAY");
	}
}
