package com.deeps;

class Maths {

	public int add(int a, int b) {
		return a + b;
	}
}

interface Calculate {
	public int sub(int a, int b);

}

public class FunctionBeforeJava8 implements Calculate {

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Maths m = new Maths();
		System.out.println(m.add(12, 10));

		FunctionBeforeJava8 ff = new FunctionBeforeJava8();
		System.out.println(ff.sub(50, 5));

	}

}
