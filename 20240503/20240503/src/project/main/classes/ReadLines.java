package project.main.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLines implements AutoCloseable{
	
	private final FileInputStream in;
	public ReadLines(String path) throws FileNotFoundException {
		in = new FileInputStream(new File(path));
	}
	
	public List<String> readLines() throws IOException{
		List<String> result = new ArrayList<String>();
		String[] lines = new String(in.readAllBytes()).split("\n");
		for(String line : lines) {
			result.add(line);
		}
		return result;
	}
	@Override
	public void close() throws Exception {
		in.close();
	}
	
}
