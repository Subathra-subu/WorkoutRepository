package com.Expleo.DemoProject;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		do {
			
			System.out.println("Enter the choice:");
			
			choice = sc.nextInt();
			
			System.out.println("\n1.Create table\n"
					+ "2.Insert Values\n"
					+ "3.View table\n"
					+ "4.Update values\n"
					+ "5.Delete rows");
			
			switch(choice) {
			
			case 1:
				
			}
			
			
			
		}while(choice!=5);

	}

}
