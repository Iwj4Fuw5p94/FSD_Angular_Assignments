package com.hexaware.springrest2web.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springrest2web.entity.Employee;

@Repository
public class EmployeeRepositaryImpl implements IEmployeeRepositary {

	JdbcTemplate jdbctemplate;

	public EmployeeRepositaryImpl() {

	}

	@Autowired
	public EmployeeRepositaryImpl(DataSource dataSource) {
		jdbctemplate = new JdbcTemplate(dataSource);

	}

	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp = null;
		String insert = "insert into employee values(?,?,?)";
		int count = jdbctemplate.update(insert, employee.getEid(), employee.getEname(), employee.getSalary());
		if (count > 0) {
			emp = employee;
		}
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp=null;
		String update = "update employee set ename=?,salary=? where eid=?";
		int count = jdbctemplate.update(update, employee.getEname(), employee.getSalary(), employee.getEid());	
		if(count>0) {
			emp=employee;
		}
		return employee;
	}
	
	@Override
	public Employee getEmployeeById(int eid) {
		String id = "select eid,ename,salary from employee where eid=?";
		Employee employee = jdbctemplate.queryForObject(id, new EmployeMapper(), eid);
		return employee;
	}

	@Override
	public String deleteEmployeeById(int eid) {
		String delete = "delete from employee where eid=?";
		int count = jdbctemplate.update(delete, eid);

		return count+"record are delete ";
	}

	@Override
	public List<Employee> getAllEmployees() {
		String select = "select eid,ename,salary from employee";
		List<Employee> list = jdbctemplate.query(select, new EmployeMapper());
		return list;
	}

}
