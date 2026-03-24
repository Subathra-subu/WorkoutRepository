package com.Expleo.DemoProject;

import java.sql.*;

public class ValuesInsertion {

	public static void main(String[] args) {
				
				String dbUrl = "jdbc:mysql://localhost:3306/testdb";
				
				String userName = "root";
				
				String password = "Subu@2004";
				
				try(Connection con = DriverManager.getConnection(dbUrl,userName,password)){
					
					String sql ="INSERT INTO Student (Id,Name,Course,Email) VALUES (?,?,?,?)";
					
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.setInt(1, 101);
					ps.setString(2,"Bibin");
					ps.setString(3, "Maths");
					ps.setString(4, "bibin@gmail.com");
					
					int rowsInserted = ps.executeUpdate();
					
					if(rowsInserted > 0) {
						System.out.println("A new user was inserted successfully");
					}
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
				

			}


}
