package com.hexaware.exceptions;

public class UserNotFoundException extends Exception{
	public UserNotFoundException(){
		System.out.println("User Not Found Constructor");
	}

	public String toString(){
		return "From UNF toString()";
		
	}
}
