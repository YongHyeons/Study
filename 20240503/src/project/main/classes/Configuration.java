package project.main.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Configuration {
	private Map<String, String> map = new HashMap<String, String>();
	public String get(String key) {
		return map.get(key);
	}
	public void openFile(String path) {
		try(InputStream in = new FileInputStream(new File(path));){
			String lines = new String(in.readAllBytes());
			String[] linesData = lines.split("\n");
			for(String line : linesData) {
				line = line.trim();
				if(line.length() < 1) continue;
				if(line.indexOf("=") < 0) continue;
				
				// A=B -> A, B
				String[] kv = line.split("=");
				map.put(kv[0].trim(), kv[1].trim());
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
