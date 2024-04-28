package project.main.classes;

public class Body {
	public String bodyText;
	public String[] file_name = {null, null, null, null, null};
	public boolean html;
	public Body(String bodyText, String[] file_name, boolean html) {
		this.bodyText = bodyText;
		this.file_name = file_name;
		this.html = html;
	}
	
}
