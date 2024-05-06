package project.main.classes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Download {
	private String url;
	private String token;
	public Download(String url) {
		this.url = url;
		this.token = this.url.substring(this.url.lastIndexOf(".")); 
		
	}
	
	public boolean Down(String destination) {
		try {
			URL url = new URI(this.url).toURL();
			try (InputStream in = url.openStream();){
				File file = new File(destination + this.token);
				try(OutputStream out = new FileOutputStream(file)){
					out.write(in.readAllBytes());
				}
			} 
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
