package com.Expleo.DemoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ValueDeletion {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/testdb";
		
		String userName = "root";
		
		String password = "Subu@2004";
		
		try(Connection con = DriverManager.getConnection(dbUrl,userName,password)){
			
			String sql = "DELETE FROM Student WHERE Name = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,"Bibin");
			
			int rowsDeleted = ps.executeUpdate();
			
			if(rowsDeleted > 0) {
				System.out.println("Deleted successfully");
			}
			else {
				System.out.println("No match found");
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
