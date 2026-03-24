package com.Expleo.DemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayTable {

	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/testdb";
		
		String userName = "root";
		
		String password = "Subu@2004";
		
		try(Connection con = DriverManager.getConnection(dbUrl,userName,password)){
			
			String sql = "SELECT * FROM Student";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			int count = 0;
			
			while(rs.next()) {
				int id = rs.getInt("Id");
				String name = rs.getString("Name");
				String course = rs.getString("Course");
				String email = rs.getString("Email");
				
				String output = "Student # %d: %d - %s - %s - %s";
				System.out.print(String.format(output,++count,id,name,course,email));
			}
			
			
		}
		
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
