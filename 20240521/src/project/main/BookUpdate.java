package project.main;

import project.sub.JDBC;

public class BookUpdate {
	public void Delete(String name) {
		JDBC.Delete("delete from product where name like '" + name + "'");
	}
}
