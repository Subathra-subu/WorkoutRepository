package com.Expleo.DemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static Connection getConnection() throws SQLException {
	
	String dbUrl = "jdbc:mysql://localhost:3306/testdb";
	
	String userName = "root";
	
	String password = "Subu@2004";
	
	return DriverManager.getConnection(dbUrl,userName,password);
 }

}
