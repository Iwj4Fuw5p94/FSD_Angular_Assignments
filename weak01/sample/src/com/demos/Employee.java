package com.deeps;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int empno=100;
	private String ename="Arun";
	protected int a=800;
	public Employee() {
		System.out.println("From Employee Constructor");
	}


	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}


	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}


	public int compareTo(Employee e) {
		return this.empno - e.empno;
	}
	//Anonyomous innerclass
	public  Comparator<Employee> nameCompartor = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {

			return e1.ename.compareTo(e2.ename);
		}
	}; 
public static Comparator<Employee> empidCompartor = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {

			return e1.empno - e2.empno;
		}
	}; 
	
	

}
