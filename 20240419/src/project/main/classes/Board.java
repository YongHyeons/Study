package project.main.classes;

public class Board {
	public Inner inner;
	public User user;
	public String title;
	public int view;
	public int like;
	public Board(String id, String pw, String title, String html) {
		inner = new Inner(html);
		user = new User(id,pw);
		this.title = title;
		view = like = 0;
	}
	public Board(String id, String pw, String title, String data, String[] files) {
		inner = new Inner(data, files);
		user = new User(id,pw);
		this.title = title;
		view = like = 0;
	}
	public Board(User user, String title, String data, String[] files) {
		inner =  new Inner(data, files);
//		user =- new User(id,pw);
		this.user = user;
		this.title = title;
		view = like = 0;
	}
}
