package com.deeps;

class First {
	int x = 10;
	static int y = 20;

	public void displayNumbers() {
		System.out.println("x : " + ++x);
		System.out.println("static y : " + ++y);
	}

	public static void printNumbers() {
		// System.out.println("x : " + x);
		System.out.println("static y : " + y);
	}

}

public class StaticEg {

	public static void main(String[] args) {
		First f1 = new First();
		f1.displayNumbers();
		f1.displayNumbers();
		
		System.out.println("**********");
		First f2 = new First();
		f2.displayNumbers();
		f2.displayNumbers();

		// First.printNumbers();
		// First.printNumbers();

	}

}
