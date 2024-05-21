package project.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import project.sub.JDBC;

import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class MainApp {
	
	public static String InputString(Scanner scan, String prefix) {
		System.out.println(prefix);
		return scan.next();
	}
	public static Integer InputInteger(Scanner scan, String prefix) {
		System.out.println(prefix);
		return scan.nextInt();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int index = 0;
		// 도서 관리 프로그램
		// 추가, 검색, 삭제
		// 삭제는 책 이름
		// 검색 -> 이름, 작가, 가격 이하, 베스트셀러, 밀리언셀러, 스테디셀
		
		while(true) {
			System.out.println("1. 추가 2. 검색 3. 삭제 4. 종료");
			int input = scan.nextInt();
			if(input == 4) break;
			else if(input == 1) {
				JDBC.Insert("insert into book values(seq_book.nextval, ?, ?, ?, ?, ?, ?",
						JDBC.DataToMap(
								InputString(scan, "제목 >> "),
								InputString(scan, "작가 >> "),
								InputString(scan, "가격 >> "),
								InputString(scan, "베스트셀러 >> "),
								InputString(scan, "스테디셀러 >> "),
								InputString(scan, "밀리언셀러 >> ")
								)
						);
			}
			else if(input == 2) {
				List<Map<Integer, Object>> result = null;
				
				switch(InputInteger(scan, "1. 전체 2. 제목 3. 작가 4.가격")) {
				case 1 : result = JDBC.Select("select * from book"); break;
				case 2 : result = JDBC.Select("select * from book where name = ?",JDBC.DataToMap(InputString(scan, "제목 >> "))); break;
				case 3 : result = JDBC.Select("select * from book where author = ?",JDBC.DataToMap(InputString(scan, "작가 >> "))); break;
				case 4 : result = JDBC.Select("select * from book where price <= ",JDBC.DataToMap(InputInteger(scan, "가격 >> "))); break;
				default:
				}
				if(result != null) {
					result.stream().forEach((data)->{
						System.out.print(data.get(1)); System.out.print("/");
						System.out.print(data.get(2)); System.out.print("/");
						System.out.print(data.get(3)); System.out.print("/");
						System.out.print(data.get(4)); System.out.print("/");
						System.out.print(data.get(5)); System.out.print("/");
						System.out.print(data.get(6)); System.out.println();
					});
				}
			}
			else if(input == 3) {
				JDBC.Delete("delete from book where name = ?", JDBC.DataToMap(InputString(scan, "삭제할 제목 >>"))
				);
			}
		}
		
//		BookSearch search = new BookSearch();
//		if(index == 1)
//			search.Name(sc.next());
//		else if(index == 2)
//			search.Author(sc.next());
//		else if(index == 3)
//			search.Price(sc.nextInt());
//		else if(index == 4)
//			search.IsBest(sc.next());
//		else if(index == 5)
//			search.IsMillion(sc.next());
//		else if(index == 6)
//			search.IsSteady(sc.next());
		
//		Map<Integer, Object> data = new HashMap<Integer, Object>();
//		data.put(1, "어린왕자");
//		data.put(2, "생텍쥐베리");
//		data.put(3, 7500);
//		data.put(4, "false");
//		data.put(5, "true");
//		data.put(6, "true");
		
//		JDBC.Insert("insert into book values (seq_book.nextval, ?, ?, ?, ?, ?, ?)",
//				JDBC.DataToMap("종이여자", "기욤뮈소", 5700, false, true, true));
//		
//		List<Map<Integer, Object>> result = JDBC.Select("select * from book");
//		for(Map<Integer, Object> map : result) {
//			System.out.println(map.get(1));
//			System.out.println(map.get(2));
//			System.out.println(map.get(3));
//			System.out.println(map.get(4));
//			System.out.println(map.get(5));
//			System.out.println(map.get(6));
//			System.out.println(map.get(7));
//		}
		// Java에서 외부 DBMS와 연결을 하기위한 코드를 미리 만들어 뒀다
		// 외부 DBMS가 한종류가 아니다
		// DB와 연결할 오라클 파일 => OJDBC.jar
		// 단순한 기능
//		String.class
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");	// 예외 처리의 개념
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		// DBMS 경로가 쉽지 않다
//		// Oracle의 JDBC를 이용해서 기본 연결을 하겠다
//		// jdbc:oracle:thin:@//IP:1521/xe
//		// 아이디, 비번
//		try(
//				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","yh97","1234");
//		){
//			System.out.println("연결 성공!");
			
			// conn.createStatement();	// 상태장치 라는걸 이용해서 요청을 관리
			// 요청 => 질의문 select * from
//			PreparedStatement prep = conn
//					.prepareStatement("select * from test");
			// select * from users where id = '받아온값' and pw = '받아온값';
			// select * from users where id = ''or'' and pw = ''or'';
			// prepared
			// select * from users where id = ? and pw = ?;
			
			// select * from table_2;
			
//			prep.executeQuery(); // 결과물이 테이블일때 => select 일때
//			prep.executeUpdate(); // 결과물이 테이블이 아닐때 => select가 아닐때
			
//			ResultSet rs = prep.executeQuery();
//			
//			while(rs.next()) {
//				int data = rs.getInt(1);
//				System.out.println(data);
//			}
//				
//			rs.close();
			
//			PreparedStatement prep = conn
//					.prepareStatement("create table " 
//									+ "users(" 
//									+ "id number(14) primary key,"
//									+ "name nvarchar2(30),"
//									+ "pw nvarchar2(30)"
//									+ ")");
			
//			PreparedStatement prep = conn
//					.prepareStatement("insert into " 
//									+ "users values(" 
//									+ "?,?,?"
//									+ ")");
//			prep.setInt(1, 1);
//			prep.setString(2, "아이디2");
//			prep.setString(3, "비밀번호2");
//			
//			prep.executeUpdate();
			
//			PreparedStatement prep = conn
//					.prepareStatement("select * from users where name = ? and pw = ?");
//			prep.setString(1, "아이디");
//			prep.setString(2, "비밀번호");
//			
//			ResultSet rs = prep.executeQuery();
//			
//			while(rs.next()){
//				System.out.println(rs.getInt(1));
//			}
//			
//			rs.close();
//			prep.close();
//			
////			conn.commit();	// 저장
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
		
		
	}
}
