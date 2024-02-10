package com.hexaware.entity;

// POJO  -- Plain Old Java Object
public class Employee extends Object{

	private int empno;
	private String ename;
	private Salary sal; // HAS-A

	public Employee() {
		System.out.println("From Employee Constructor");
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

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

}
