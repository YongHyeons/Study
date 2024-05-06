package project.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import project.main.classes.Configuration;
import project.main.classes.DownloadList;
import project.main.classes.ReadLines;

public class MainApp {
	public static void main(String[] args) {
//		File a = new File("./text.txt");
		// InputStream -> 해당하는 주소를 내가 점유할거야
//		try (FileOutputStream stream = new FileOutputStream(a);) {
//			// IO System -> 어떤 파일 혹은 어떤 정보든 옮길 수 있게 자료형과 상관없이 그대로 전송
//			stream.write("쓰고싶은 내용".getBytes());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// HDD -> RAM 으로 경로를 열때는 중요한점!
		// 해당하는 경로가 이미 존재해야 한다.
//		try (FileInputStream stream = new FileInputStream(a);) {
//			// IO System -> 어떤 파일 혹은 어떤 정보든 옮길 수 있게 자료형과 상관없이 그대로 전송\
//			byte[] bytes = stream.readAllBytes();
//			System.out.println(new String(bytes));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// HDD 경로
//		File a = new File("./text2.txt");
//		try (FileWriter writer = new FileWriter(a);){
//			
//			writer.append("뭐가 다르냐");
//			writer.append("매우 많은것이");
//			writer.append("다르다");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		try (FileReader reader = new FileReader(a);){
//			
//			char[] input = new char[1024];
//			reader.read(input);
//			System.out.println(input);
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// URL Stream
//		try {
//			URL url = new URI("https://newsimg.sedaily.com/2023/08/25/29TJL89F4G_3.png").toURL();
//			try(InputStream in = url.openStream();){
//				File file = new File("./a.png");
//				try(OutputStream out = new FileOutputStream(file)){
//					out.write(in.readAllBytes());
//				}
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
//		}
		
//		Download down = new Download("https://newsimg.sedaily.com/2023/08/25/29TJL89F4G_3.png");
//		
//		down.Down("1");
		
//		DownloadList dl = new DownloadList();
//		dl.push("https://cdn.hankyung.com/photo/202304/01.33189797.1.jpg");
//		dl.push("https://flexible.img.hani.co.kr/flexible/normal/970/1005/imgdb/original/2023/0322/20230322500726.jpg");
//		dl.push("https://cdn.mhnse.com/news/photo/202311/234914_245184_1512.jpg");
//		dl.push("https://res.heraldm.com/content/image/2023/04/16/20230416000040_0.jpg");
//		dl.push("https://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2022/01/16/OhTC8EqAhoCg637779288570528338.jpg");
//		dl.push("https://newsimg.sedaily.com/2022/04/05/264KR98XIC_1.jpg");
//		dl.push("https://cdn.onews.tv/news/photo/202201/111038_126347_4036.jpg");
//		dl.push("https://cdn.newsculture.press/news/photo/202306/526790_652106_4113.jpg");
//		dl.push("https://cdn.mhnse.com/news/photo/202311/238089_249071_599.jpg");
//		dl.push("https://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2022/12/02/7405ab4f-f2ee-4f5c-824b-40036b369e0e.jpg");
//		
//		dl.download();
		
		
//		Integer index = 0;
//		for(Download down : downloadList) {
//			down.Down("file" + index.toString());
//			index += 1;
//		}
		
//		File a = new File("./dllist.txt");
//		DownloadList dl = new DownloadList();
//		String url;
//		try (FileReader reader = new FileReader(a);
//				BufferedReader BReader = new BufferedReader(reader);){
//			while((url = BReader.readLine()) != null) {
//				dl.push(url);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		dl.download();
		
//		-----------------------------------------------------------------------------
		
		Configuration config = new Configuration();
		config.openFile("./config.ini");
		
		DownloadList dl = new DownloadList(config.get("prefix"));
		dl.openFile(config.get("file"));
		dl.download();
	}
}
