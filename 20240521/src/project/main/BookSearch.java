package project.main;

import java.util.List;
import java.util.Map;

import project.sub.JDBC;

public class BookSearch {
	public void Name(String s) {
		List<Map<Integer, Object>> result = JDBC.Select("select * from book where name like '%" + s + "%'");
		Show(result);
	}
	public void Author(String s) {
		List<Map<Integer, Object>> result = JDBC.Select("select * from book where author like '%" + s + "%'");
		Show(result);
	}
	public void Price(int p) {
		List<Map<Integer, Object>> result = JDBC.Select("select * from book where price <= " + p + "");
		Show(result);
	}
	public void IsBest(String s) {
		List<Map<Integer, Object>> result = JDBC.Select("select * from book where isbest = '" + s + "'");
		Show(result);
	}
	public void IsMillion(String s) {
		List<Map<Integer, Object>> result = JDBC.Select("select * from book where ismillion = '" + s + "'");
		Show(result);
	}
	public void IsSteady(String s) {
		List<Map<Integer, Object>> result = JDBC.Select("select * from book where issteady = '" + s + "'");
		Show(result);
	}
	
	public void Show(List<Map<Integer, Object>> result) {
		for(Map<Integer, Object> map : result) {
			System.out.println(map.get(1));
			System.out.println(map.get(2));
			System.out.println(map.get(3));
			System.out.println(map.get(4));
			System.out.println(map.get(5));
			System.out.println(map.get(6));
			System.out.println(map.get(7));
		}
	}
}
