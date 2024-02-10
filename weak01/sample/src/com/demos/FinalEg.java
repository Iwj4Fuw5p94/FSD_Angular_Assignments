package com.deeps;

public class FinalEg {
	final int myvar=90;
	
	public void myMeth() {
	//	System.out.println(myvar++);
	}
	
	public static void main(String[] args) {
		//final int xx=89;
		//System.out.println(xx++);
		FinalEg f= new FinalEg();
		f.myMeth();
		
	}

}
