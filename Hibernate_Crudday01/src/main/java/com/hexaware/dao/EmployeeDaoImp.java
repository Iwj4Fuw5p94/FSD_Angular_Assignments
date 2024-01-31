package com.hexaware.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.bean.Employee;
import com.hexaware.mainModule.HibernateUtill;

public class EmployeeDaoImp implements IEmployeeDao {
	SessionFactory sessionFactory=HibernateUtill.getSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	Employee employee;
	@Override
	public Employee createEmployee(Employee employee) {
		Serializable serializable=session.save(employee);
		transaction.commit();
		return employee;
	}

	@Override
	public Employee updateEmployee() {
		employee=new Employee(106,"Jimmy choom",10000);
		session.saveOrUpdate(employee);
		transaction.commit();
		return employee;
	}

	@Override
	public Employee selectEmployeeById() {
	Query query=session.createNamedQuery("selectEmployeeById");
	query.setParameter("eid", 101);
    Employee employee=(Employee) query.getSingleResult();
		return employee;
	}

	@Override
	public Employee deleteEmployeeById() {
		
	Employee employee2=	session.get(Employee.class,102);
		session.delete(employee2);
		transaction.commit();
//		session.close();
		return employee;
		
		
	}

	@Override
	public List<Employee> selectAllEmployee() {
	Query<Employee> query=	session.createNamedQuery("selectAllEmployee");
    List<Employee> list=	query.getResultList();
		
		return list;
	}
	


}
