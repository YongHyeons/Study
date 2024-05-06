package project.main.classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class DownloadList {
	private List<Download> downloadList = new ArrayList<Download>();
	private final String prefix;
	public DownloadList(String prefix) {
		this.prefix = prefix;
	}
	public DownloadList() {
		this.prefix = "downloadList_";
	}
	public void push(String target) {
		downloadList.add(new Download(target));
	}
	
	public void download() {
		final Number<Integer> index = new Number<Integer>();
		index.set(0);
		downloadList
			.stream()
			.distinct()
			.forEach((download)->{
				final String number = index.get().toString();
				new Thread(()->{
					download.Down(prefix + number);
				}).start();
				index.set(index.get()+1);
			});
		
//		for(final Download down : downloadList) {
//			final String number = index.toString();
//			new Thread(()->{
//				down.Down("downloadList_" + number);
//			}).start();
//			index += 1;
//		}
	}
	
	// 파일명 -> 해당하는 파일에서 경로를 자동으로 등록하는 메서드
	public void openFile(String file) {
		try(ReadLines lines = new ReadLines(file);){
			List<String> links = lines.readLines();
			links
				.stream()
				.distinct()
				.filter((link)->{
					return link.length() > 0;
				})
				.filter((link)->{
					return link.startsWith("http");
				})
				.map((link)->{
					return link.trim();
				})
				.forEach((link)->{
					push(link);
				});
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
