package project.main.classes;

public class BBS {
	public String title;
	public String data;
	public String id;
	public String date;
	public int view;
	public int like;
	public BBS(String title, String data, String id, String date, int view, int like) {
		this.title = title;
		this.data = data;
		this.id = id;
		this.date = date;
		this.view = view;
		this.like = like;
	}
	
	public void InputBoard() throws TitleException, IdNullException, DateException, DataOverException, LessCountException{
		if(title.isEmpty()) throw new TitleException();
		if(id.isEmpty()) throw new IdNullException();
		if(date.isEmpty()) throw new DateException();
		if(data.length() > 50) throw new DataOverException();
		if(view < 0 || like < 0) throw new LessCountException();
		System.out.println("작성 완료");
	}
	
}
