package com.Expleo.DemoProject;

import java.sql.*;

public class ValueUpdation {

	public static void main(String[] args) throws SQLException {
	
		String dbUrl = "jdbc:mysql://localhost:3306/testdb";
		
		String userName = "root";
		
		String password = "Subu@2004";
		
		try(Connection con = DriverManager.getConnection(dbUrl,userName,password)){
			
			String sql ="UPDATE Student SET Course=?,Email=? WHERE Name=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setString(1, "Physics");
			ps.setString(2, "bibin6420@gmail.com");
			ps.setString(3, "Bibin");
			
			int rowsUpdatedted = ps.executeUpdate();
			
			if(rowsUpdatedted > 0) {
				System.out.println("Updated successfully");
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
