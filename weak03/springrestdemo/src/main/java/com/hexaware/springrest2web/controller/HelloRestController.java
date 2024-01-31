package com.hexaware.springrest2web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//everthing it is have 
@RequestMapping("/api")
public class HelloRestController {
	
	@RequestMapping(value = "/hello",method =RequestMethod.GET)
	public String hello() {
		return "Hello My Name Is  Rest Api";
	}
	
	public String addEmployee() {
		return null;
		
	}
	

}
