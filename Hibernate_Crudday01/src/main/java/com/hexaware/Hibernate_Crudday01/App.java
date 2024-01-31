package com.hexaware.Hibernate_Crudday01;


import java.awt.Choice;
import java.security.PublicKey;
import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder.Case;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.bean.Employee;
import com.hexaware.dao.EmployeeDaoImp;

import net.bytebuddy.pool.TypePool.AbstractBase.Hierarchical;


public class App 

{
 static	Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
    	EmployeeDaoImp employeedao=new EmployeeDaoImp();
//		Employee employee4=employeedao.deleteEmployeeById();
//		System.out.println(employee4);
		
    	boolean	choice=true;
    	while(choice) {
    	System.out.println("****WELCOME DMS ***");
		System.out.println("1. INSERT");
		System.out.println("2. UPDATE");
		System.out.println("3. DELETE");
		System.out.println("4. SELECT BY ID");
		System.out.println("5. SELECT ALL");
		System.out.println("6. EXIT");
		int key=scanner.nextInt();
		switch (key) {
		case 1:
    		Employee emp=App.readData();
			Employee employee= employeedao.createEmployee(emp);
			System.out.println(employee);
//			
			break;
		case 2:
			Employee employee2=employeedao.updateEmployee();
    		break;
		case 3:
			Employee employee3=employeedao.selectEmployeeById();
		case 4:
				Employee employee4=employeedao.deleteEmployeeById();
    	case 5:
    		List<Employee> employee5=employeedao.selectAllEmployee();
    		System.out.println(employee5);
    	case 6:
    		choice=false;
    		
    		
		default:
			break;
		}
		 System.out.println("Exiting DMS. Goodbye!");
//	        scanner.close();
    	}
    	
    	
    	
//   
//    	Employee employee3=employeedao.selectEmployeeById();
//		System.out.println(employee3);
    
    	
//      Employee employee= employeedao.createEmployee();
//      Employee employee2=employeedao.updateEmployee();
//      System.out.println(employee);
//      System.out.println(employee2);
      
       
    	
//    	SessionFactory sessionFactory=HibernateUtill.getSessionFactory();
//    	Session session=sessionFactory.openSession();
//    	Transaction transaction=session.beginTransaction();
//    	
    	
    	
    	
    }
    public static Employee readData() {
    	System.out.println("enter the employeeid");
    	
    	int eid=scanner.nextInt();
    	System.out.println("enter the empname");
    	String empNameString=scanner.next();
    	System.out.println("enter the salary");
    	double salary=scanner.nextDouble();
    	Employee employe=new Employee(eid, empNameString, salary);
    	
    	
		return employe;
    	
    }
 
}
