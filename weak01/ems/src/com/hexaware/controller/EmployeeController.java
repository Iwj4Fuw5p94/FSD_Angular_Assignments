package com.hexaware.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.EmployeeDao;
import com.hexaware.entity.Employee;
import com.hexaware.entity.Salary;

public class EmployeeController implements EmployeeInterface{
	Employee emp;
	Salary  sal = new Salary();
	Scanner sc = new Scanner(System.in);
	List  emplist = new ArrayList();
	EmployeeDao dao = new EmployeeDao();
	public void addEmployee() {
		emp = new Employee();
		System.out.println("Enter your Emp number");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter your Emp Name");
		String ename = sc.next();
		emp.setEname(ename);
		
		System.out.println("Enter your Basic Salary");
		int basic = sc.nextInt();
		sal.setBasic(basic);
		sal.setHra();
		sal.setPf();
		sal.setGross();
		sal.setNet();
		
		emp.setSal(sal);
		//emplist.add(emp);
		dao.insertEmployee(emp);
		System.out.println("Employee added successfully !!!");

	}

	public void viewEmployee() {
		//System.out.println("Empno : " + emp.getEmpno() + " Ename " + emp.getEname());
		//System.out.println(emp);
		//System.out.println(emplist);
		dao.showEmployee();
		
	}
	

	public void updateEmployee() {
		
		emp = new Employee();
		System.out.println("Enter your Emp number to update");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter your Emp Name to update");
		String ename = sc.next();
		emp.setEname(ename);
		
		
		dao.updateEmployee(emp);
	}

	public void deleteEmployee() {
		
		System.out.println("Enter your Emp number to delete");
		int eno = sc.nextInt();			
		
		dao.deleteEmployee(eno);
	}

	@Override
	public void sortByEmpnoUsingComparable() {
	
		
	}

	@Override
	public void sortByEnameUsingCompartor() {
	
		
	}


}
