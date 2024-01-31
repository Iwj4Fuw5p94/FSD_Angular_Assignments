package com.hexaware.springrest2web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.hexaware.springrest2web.entity.Employee;
import com.hexaware.springrest2web.repository.IEmployeeRepositary;

//postman react as a view 

@Service

public class EmployeeServiceImp implements IEmployeeService{
	@Autowired
	IEmployeeRepositary repo;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return repo.updateEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return repo.getEmployeeById(eid);
	}

	@Override
	public String deleteEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return repo.deleteEmployeeById(eid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.getAllEmployees();
	}

}
