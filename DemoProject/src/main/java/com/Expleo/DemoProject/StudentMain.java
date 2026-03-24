package com.Expleo.DemoProject;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentMain {

public static void main(String[]args) throws SQLException {
		
		
		Scanner sc = new Scanner(System.in);
		
		StudentDB sd = new StudentDB();
		
		int choice = -1;

        do {
            System.out.println("\nChoose the option:"
            		+ "\n1.Create table"
                    + "\n2.Insert a student"
                    + "\n3.Display all students"
                    + "\n4.Update a student"
                    + "\n5.Delete a student"
                    + "\n6.Exit");

            System.out.print("Enter the choice: ");
            choice = sc.nextInt();

            switch (choice) {
            
                case 1:
                	System.out.println("\nCreate table");
                	
                	System.out.print("Enter table name: ");
                    String table_name = sc.next();
                    
                    sd.createTable(table_name);
                    
                    break;
                    

                case 2:
                    System.out.println("\nInsert Student");

                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    sd.insertStudent(new Student(id, name, course, email));
                    break;

                case 3:
                    System.out.println("\nStudent Details");
                    sd.displayStudents();
                    break;

                case 4:
                    System.out.println("\nUpdate Student");

                    System.out.print("Enter Id: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    course = sc.nextLine();

                    System.out.print("Enter Email: ");
                    email = sc.nextLine();

                    sd.updateStudent(id, name,course, email);
                    break;

                case 5:
                    System.out.println("\nDelete Student");

                    System.out.print("Enter Id: ");
                    id = sc.nextInt();

                    sd.deleteStudent(id);
                    break;

                case 6:
                    System.out.println("Thank you!!!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
		
	}

}
