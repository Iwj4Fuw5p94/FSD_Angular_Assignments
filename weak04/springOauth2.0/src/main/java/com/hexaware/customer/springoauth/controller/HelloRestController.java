package com.hexaware.customer.springoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/secure")
	public String secureResource() {
		return "This is secured resource,access using app login/github credditiansals";
	}
	
	
	
	
	
	
	
	

}
