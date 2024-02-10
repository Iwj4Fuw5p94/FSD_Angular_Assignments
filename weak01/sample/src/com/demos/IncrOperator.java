package com.deeps;

public class IncrOperator {

	public static void main(String[] args) {
//		int x = 100;
//		
//		System.out.println(x);
//		
//		System.out.println(x++);
//		System.out.println(x);
		
		System.out.println("**********");
		
		int x = 10, y = 5;
		boolean w = false, z = false;
		x = w ? y++ : y--;    // ternary operator
		System.out.println("x : "+x);
		System.out.println(" y :" + y);
		System.out.println(" z :" + z);
		w = z;
		
		System.out.println("w:" + w);
		
		
		
		System.out.print((x+y)+" "+(w ? 5 : 10));

	}

}
/*
 * 
 * 
 * 
 */