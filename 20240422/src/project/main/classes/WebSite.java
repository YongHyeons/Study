package project.main.classes;

public class WebSite {
	public String url;
	public void Show() {
		System.out.println(url);
	}
}

class Blog extends WebSite{
	public int visit;
	public void Show() {
		super.Show();
		System.out.println(visit);
	}
}

class ShoppingMall extends WebSite {
	public int visit;
	public int payment;
	public void Show() {
		super.Show();
		System.out.println(visit);
		System.out.println(payment);
	}
}

class Wiki extends WebSite{
	public String data;
	public void Show() {
		super.Show();
		System.out.println(data);
	}
}















