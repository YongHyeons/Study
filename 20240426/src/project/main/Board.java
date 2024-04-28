package project.main;

public class Board implements AutoCloseable {
	public String title;
	public String body;
	public String author;
	public String date;
	public int view;
	public int like;
	
	public Board(String title, String author, String date) {
		this.title = title;
		this.author = author;
		this.date = date;
	}

	public void Title(String title) throws Exception {
		if(title.isEmpty()) throw new Exception();
		this.title = title;
	}
	public void Body(String body) throws Exception {
		if(body.length()>50) throw new Exception();
		this.body = body;
	}
	public void Author(String author) throws Exception  {
		if(author.isEmpty()) throw new Exception();
		this.author = author;
	}
	public void Date(String date) throws Exception  {
		if(date.isEmpty()) throw new Exception();
		this.date = date;
	}
	public void View(int view) throws Exception {
		if(view < 0) throw new Exception();
		this.view = view;
	}
	public void Like(int like) throws Exception {
		if(like < 0) throw new Exception();
		this.like = like;
	}
	
	public void close() throws Exception{
		System.out.println("작성창 종료");
	}
}
