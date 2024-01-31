package com.hexaware.springboot2web.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springboot2web.entity.Employee;

@Repository
public class EmployeeDaoImp implements IEmployeeDao {

	JdbcTemplate jdbcTemplate;

	public EmployeeDaoImp() {

	}

	@Autowired
	public EmployeeDaoImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate);
	}

	@Override
	public String addEmployee(Employee emp) {
		String insert="insert into employee values(?,?,?)";
	int count=	jdbcTemplate.update(insert,emp.getEid(),emp.getEname(),emp.getSalary());
		
		return count+"Records Are inserted";
	}

	@Override
	public String updateEmployee(Employee emp) {
		String update="update employee set ename=?,salary=? where eid=?";
		int count=jdbcTemplate.update(update,emp.getEname(),emp.getSalary(),emp.getEid());
			
		return count+"records are updatetd";
	}

	@Override
	public String deleteEmployee(int eid) {
		String delete="delete from Employee where eid=?";
		int count =jdbcTemplate.update(delete,eid);
		return count+"record deleted";
	}

	@Override
	public List<Employee> getAll() {
		String all="select eid,ename,salary from employee";
		List<Employee> list = jdbcTemplate.query(all, new EmployeeMapper());
		return list;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		String select="select eid,ename,salary from employee where eid=?";
		Employee employee=jdbcTemplate.queryForObject(select,new EmployeeMapper(),eid);
		return employee;
	}



}
