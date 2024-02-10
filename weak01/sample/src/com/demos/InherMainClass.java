package com.deeps;

public class InherMainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println(e1.getEmpno());
		
		Manager m1 = new Manager();
		System.out.println(m1.getEmpno());
	}

}
