package com.hexaware.dao;
import com.hexaware.bean.Employee;
import java.util.List;

import com.hexaware.bean.*;
public interface IEmployeeDao {
	public Employee  createEmployee(Employee employee);
	public Employee updateEmployee();
	public Employee selectEmployeeById();
	public Employee deleteEmployeeById();
	public List<Employee> selectAllEmployee();
}
