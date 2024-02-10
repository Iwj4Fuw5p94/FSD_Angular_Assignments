package com.deeps;

class MyThread extends Thread{
	public void run()
	{
		try{
		for(int i=1;i<=10;i++)
		{
		System.out.println("i = " +i);
		Thread.sleep(100);
		}
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
}

public class ThrMainClass{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("1234556");
		MyThread mt1 = new MyThread();
		mt1.start(); 
		MyThread mt2 = new MyThread();
		mt2.start(); 
		System.out.println("xyz");
		System.out.println("Main Ends");
	}

}