package project.main.classes;

public class Books {
	public Book[] books = {null,null,null,null,null,null,null,null,null,null};
	public void newBook(String name, String author, int price) {
		for(int i = 0; i < 10; i+=1) {
			if(books[i] == null) {
				books[i] = new Book();
				books[i].InsertBook(name, author, price);
				break;	// return 가능
			}
		}
	}
	public Book ExpensiveBook() {
		Book expensive = books[0];
		for(Book book : books) {
			expensive = expensive.price < book.price ? book : expensive;
		}
		return expensive;
	}
	public Book CheapBook() {
		Book Cheap = books[0];
		for(Book book : books) {
			Cheap = Cheap.price > book.price ? book : Cheap;
		}
		return Cheap;
	}
	
	public void UpdateBook(String name, int price) {
		for(Book book : books) {
			if(book != null) continue;
			if(book.name.equalsIgnoreCase(name)) {
				book.price = price;
			}
		}
	}
	public void ShowBookAll() {
		System.out.println("=====모든 책=====");
		for(Book book : books) {
			if(book == null) continue;
			book.ShowBook();
		}
	}
}
