package com.examples.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Returns the connection that can be reused from multiple methods
public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/legato_db", "root", "root");
		return connection;
	}
}
