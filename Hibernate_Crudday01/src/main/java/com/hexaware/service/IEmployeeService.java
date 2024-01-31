package com.hexaware.service;

import java.util.List;

import com.hexaware.bean.Employee;

public interface IEmployeeService {
	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee selectEmployeeById(int  eid);
	public Employee deleteEmployeeById(int  salary);
	public List<Employee> selectAllEmployee();

}
