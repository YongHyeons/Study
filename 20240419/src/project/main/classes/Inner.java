package project.main.classes;

public class Inner {
	public String data;
	public String[] files;
	public String html;
	public boolean isHtml;

	public Inner(String data, String[] files) {
		this.data = data;
		this.files = files;
		isHtml = false;
	}
	
	public Inner(String html) {
		this.html = html;
		isHtml = true;
	}
	
}
