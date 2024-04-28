package project.main.classes;

public class Books {
	public Book[] books = {null,null,null,null,null,null,null,null,null,null};
	public void NewBook(String name, String author, int price, int type) {
		for(int i = 0; i < 10; i += 1) {
			if(books[i] == null) {
				switch(type) {
				case 1:
					books[i] = new RomanceBook(name, author, price);
					break;
				case 2:
					books[i] = new MysteryBook(name, author, price);
					break;
				case 3:
					books[i] = new EssayBook(name, author, price);
					break;
				case 4:
					books[i] = new SDBook(name, author, price);
					break;
				}
				return;
			}
		}
	}
	public Book ExpensiveBook() {
		Book expensive = books[0];
		for(Book book : books) {
			if(book == null) continue;
			expensive = expensive.price < book.price ? book : expensive;
		}
		return expensive;
	}
	public Book CheapBook() {
		Book cheap = books[0];
		for(Book book : books) {
			if(book == null) continue;
			cheap = cheap.price > book.price ? book : cheap;
		}
		return cheap;
	}
	public void UpdateBook(String name, int price) {
		for(Book book : books) {
			if(book == null) continue;
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
