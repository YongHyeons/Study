package project.sub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JDBC {
	private JDBC() {}
	// 동작별로 메서드를 따로 제작
	// update, select, delete, insert
	
	public static Map<Integer, Object> DataToMap(Object ...args){
		Map<Integer, Object> result = new HashMap<Integer, Object>();
		int index = 1;
		for(Object data : args) {
			result.put(index, data);
			index += 1;
		}
		return result;
	}
	
	public static void Insert(String sql) {
		Insert(sql, null);
	}
	public static void Insert(String sql, Map<Integer, Object> state) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) { return; }
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","yh97","1234");){
			try (PreparedStatement prep = conn.prepareStatement(sql);){
				if(state != null) {
					for(Entry<Integer, Object> entry : state.entrySet()) {
						prep.setObject(entry.getKey(), entry.getValue());
					}
				}
				
				prep.executeUpdate();
			}
		} catch (SQLException e) {
			return;
		}
		
	}
	public static void Update(String sql) { Update(sql, null); }
	public static void Delete(String sql) { Delete(sql, null); }
	public static void Update(String sql, Map<Integer, Object> state) {
		Insert(sql, state);
	}
	public static void Delete(String sql, Map<Integer, Object> state) {
		Insert(sql, state);
	}
	public static List<Map<Integer, Object>> Select(String sql) {
		return Select(sql, null);
	}
	public static List<Map<Integer, Object>> Select(String sql, Map<Integer, Object> state) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) { return null; }
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","yh97","1234");){
			try (PreparedStatement prep = conn.prepareStatement(sql);){
				if(state != null) {
					for(Entry<Integer, Object> entry : state.entrySet()) {
						prep.setObject(entry.getKey(), entry.getValue());
					}
				}
				
				try (ResultSet rs = prep.executeQuery();){
					List<Map<Integer, Object>> result = new ArrayList<Map<Integer,Object>>();
					while(rs.next()) {
						Map<Integer, Object> row = new HashMap<Integer, Object>();
							try {
								for(int i = 0; i < 99; i += 1) {
									row.put(i+1, rs.getObject(i+1));
								}
							} catch(Exception e) {}
						result.add(row);	
					}
					return result;
				} 
			}
		} catch (SQLException e) { return null; }
	}
	
}
