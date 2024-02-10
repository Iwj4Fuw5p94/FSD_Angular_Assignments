package com.hexaware.view;

import java.util.Scanner;

import com.hexaware.controller.EmployeeController;
import com.hexaware.controller.EmployeeInterface;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Welcome to Java");
		EmployeeInterface ec = new EmployeeController();
		Scanner sc = new Scanner(System.in);
		String ch = null;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. SortByEmpnoUsingComparable");
			System.out.println("6. SortByEnameUsingCompartor");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				ec.addEmployee();
				break;
			}
			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.updateEmployee();
				break;
			}
			case 4: {
				ec.deleteEmployee();
				break;
			}
			
			case 5: {
				ec.sortByEmpnoUsingComparable();
				break;
			}
			case 6: {
				ec.sortByEnameUsingCompartor();
				break;
			}
			default: {
				System.out.println("Choose a proper choice");
				break;
			}
			}
			System.out.println("Do you want to continue? Y | y");
			ch = sc.next();

		} while (ch.equals("Y") || ch.equals("y"));
		System.out.println("Thanks for using our system");
	}

}
