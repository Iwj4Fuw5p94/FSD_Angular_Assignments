package com.nucleus.training;

import com.nucleus.training.qouestion2.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nucleus.training.bean.Customer;

public class Main {

    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationBean.xml");
//        Customer customer=(Customer) context.getBean("customerSetter");
//        System.out.println(customer);

        // I. Dependency Injection via Setter Methods
        Customer customerSetter = (Customer) context.getBean("customerSetter");
        System.out.println("Customer ID (Setter): " + customerSetter.getId());
        System.out.println("Customer Name (Setter): " + customerSetter.getCustomerName());
        System.out.println(customerSetter);

//         II. Dependency Injection via Constructor
        Customer customerConstructor = (Customer) context.getBean("customerConstructor");
        System.out.println("Customer ID (Constructor): " + customerConstructor.getId());
        System.out.println("Customer Name (Constructor): " + customerConstructor.getCustomerName());
        System.out.println();

//         III. Dependency Injection via Constructor and Setter (CustomerName)
        Customer customerBoth = (Customer) context.getBean("customerBoth");
        System.out.println("Customer ID (Both): " + customerBoth.getId());
        System.out.println("Customer Name (Both): " + customerBoth.getCustomerName());




//        Qouestion 2 Implement the Bean Scopes – Singleton and prototype and show the difference between both
//with the help of demo code and explain the difference with Java comments




        Customer customer1=(Customer) context.getBean("customer2");
        Customer customer2=(Customer) context.getBean("customer2");
        if(customer1.equals(customer2)){
            System.out.println("\nCustomer has a singleton scope");
        }
        else {
            System.out.println("\nCustomer has a property scope");
        }


        Employee employee1=(Employee) context.getBean("employee2");
        Employee employee2=(Employee) context.getBean("employee2");
        if(employee1.equals(employee2)){
            System.out.println("\nEmployee has a singleton scope");
        }
        else {
            System.out.println("\nEmployee has a property scope");
        }

    }
}
