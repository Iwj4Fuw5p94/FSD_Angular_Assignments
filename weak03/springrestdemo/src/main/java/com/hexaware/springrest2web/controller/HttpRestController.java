package com.hexaware.springrest2web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HttpRestController {
	
	//@RequestMapping(value = "/get",method = RequestMethod.GET) we can also write this in rest we use other 
	
	@GetMapping(value = "/get")
	public String getData() {
		return "get method executed ";
		
	}
	@PostMapping("/add")
	public String addData() {
		return "add data";
	}
	@PutMapping("/update")
	public String updateData() {
		return "update data";
	}
	@DeleteMapping(value = "/delete")
	public String deleteData() {
		return "delete data";

	}

}
