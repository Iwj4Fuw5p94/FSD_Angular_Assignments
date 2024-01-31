package com.hexaware.bean;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@Table(name="Employee_Details")//it will create this name table 
@NamedQueries({
	@NamedQuery(name="selectEmployeeById",query="select e from Employee e where e.eid=:eid"),
	@NamedQuery(name = "selectAllEmployee",query="select e from Employee e")
})
//@NamedQueries({
//	@NamedQuery(name ="getAllEmployee", query= "select e from Employee e"),
//	@NamedQuery(name="getEmployeeByName",query = "select e from Employee e where e.ename = :name"),
//	@NamedQuery(name="insertEmployee",query= "insert into Employee() values(:eid,:ename,:salary)")
//})
public class Employee {
//	by default it is column
	
	@Id   	//primaket if we want to make pk
	private int eid;
	@Column(name="empname")
	private String ename;
	private double salary;

	public Employee() {
	}

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
