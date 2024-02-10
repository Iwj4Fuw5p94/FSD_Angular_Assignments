package com.deeps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

interface Calculator {
	public int addition(int a, int b);
}

public class LambdaEg {
	public static void main(String[] args) {
		Calculator res = (a, b) -> {
			return a + b;
		};
		System.out.println(res.addition(77, 3));

		Employee e1 = new Employee(11, "Malar");
		Employee e2 = new Employee(13, "Dharshini");
		Employee e3 = new Employee(21, "Zaina");
		Employee e4 = new Employee(15, "Jafer");

		List empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		System.out.println(empList);

		Iterator<Employee> i = empList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("************");

		empList.forEach(lis -> System.out.println(lis));

		BiPredicate<String, String> prres = (un, pw) -> un.equals("dee") && pw.equals("pwd");
		// System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter un");
		String un = sc.next();
		System.out.println("Enter pwd");
		String pwd = sc.next();
		if (prres.test(un, pwd)) {
			System.out.println("Welcome " + un);
		} else {
			System.out.println("Welcome Guest");
		}

		Supplier<Employee> s = () -> {
			return new Employee();
		};
		System.out.println(s.get());
		
		Function<Integer,String> evenorodd=(num) ->{
			if(num % 2 ==0) {
				return "Even";
			}else {
				return "odd";
			}
			
		};
		System.out.println(evenorodd.apply(50));
		

	}
//	public String evenorodd(Integer num) {
//		if(num % 2 ==0) {
//			return "Even";
//		}else {
//			return "odd";
//		}
//		
//	}
	
	
}
