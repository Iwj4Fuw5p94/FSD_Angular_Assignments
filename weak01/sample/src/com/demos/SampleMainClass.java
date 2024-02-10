package com.deeps;

import java.util.Arrays;

public class SampleMainClass {

	public static void main(String[] args) {

		int[] intArr = new int[3];
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		
		System.out.println(intArr);
		System.out.println(Arrays.toString(intArr));
		
		
		int[] intgArr  = {400,500,600};
		System.out.println(Arrays.toString(intgArr));
		
		String[] strArr  = {"apple","bannana","cherry"};
		System.out.println(Arrays.toString(strArr));
		
		Employee emp1 = new Employee(201, "Manish");
		Employee emp2 = new Employee(202, "Harish");
		Employee emp3 = new Employee(203, "David");
		
		Employee[] empArr = {emp1,emp2,emp3};
		System.out.println(Arrays.toString(empArr));
		
		System.out.println(emp1);		
	}

}
