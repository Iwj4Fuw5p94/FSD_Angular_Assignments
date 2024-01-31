package com.nucleus.training.question3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationBean3.xml");
            Customer customer=(Customer)context.getBean("customerData");
            System.out.println(customer);
        }

}
