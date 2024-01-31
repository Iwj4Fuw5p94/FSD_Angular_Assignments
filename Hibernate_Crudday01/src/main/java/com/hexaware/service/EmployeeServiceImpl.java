package com.hexaware.service;
import com.hexaware.bean.Employee;
import com.hexaware.dao.IEmployeeDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements IEmployeeService{
	
	@
	Autowired
	IEmployeeDao IEmployeeDao;

	@Override
	public Employee createEmployee(Employee employee) {
		
		return IEmployeeDao.createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return IEmployeeDao.updateEmployee();
	}

	@Override
	public Employee selectEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return IEmployeeDao.selectEmployeeById();
	}

	@Override
	public Employee deleteEmployeeById(int salary) {
		// TODO Auto-generated method stub
		return IEmployeeDao.deleteEmployeeById();
	}

	@Override
	public List<Employee> selectAllEmployee() {
		// TODO Auto-generated method stub
		return IEmployeeDao.selectAllEmployee();
	}
	

	

}
