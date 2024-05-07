package org.library.classes;

//import java.nio.file.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookLibrary {
	private List<Book> books = new LinkedList<Book>();
	public Integer getBookIndex(String title) {
		for(int i = 0; i < books.size(); i += 1) {
			if(title.equalsIgnoreCase(books.get(i).getTitle())) return i;
		}
		return -1;
	}
	
	public List<Book> filter(Predicate<Book> predicate){
		return books
			.stream()
			.filter(predicate)
			.collect(Collectors.toList());
	}
	
	public Book getBook(Integer index) {
		return books.get(index);
	}
	public void removeBook(Integer index) {
		books.remove(index);
	}
	public void forEach(Consumer<? super Book> consumer) {
		for(Book book : books) {
			consumer.accept(book);
		}
	}
	public void push(Book book) {
		books.add(book);
	}
	
	public void Save(String path) {
		File file = new File(path);
		try(OutputStream out = new FileOutputStream(file);){
			for(Book book : books) {
				out.write(
						(
								book.getTitle() + "," +
								book.getAuthor() + "," +
								book.getPrice().toString() + "," +
								book.getIsBest().toString() + "," +
								book.getSale().toString() + "\n"
						)
						.getBytes()
				);
			}
		}catch(Exception e) {}
	}
	
	public void Open(String path) {
		File file = new File(path);
		try(InputStream in = new FileInputStream(file);){
			String total = new String(in.readAllBytes());
			String[] lines = total.split("\n");
			for(String line : lines) {
				line = line.trim();
				String[] datas = line.split(",");
				if(datas.length < 5) continue;
				books.add(new Book(
						datas[0],
						datas[1],
						Integer.parseInt(datas[2]),
						Boolean.parseBoolean(datas[3]),
						Double.parseDouble(datas[4])
				)); 
			}
		}catch(Exception e) {}
	}
}
