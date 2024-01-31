package com.hexaware.springrest2web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest2web.entity.Employee;
import com.hexaware.springrest2web.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public Employee creatEmployee(@RequestBody Employee emp) {

		return service.addEmployee(emp);

	}
	// read data from url {eid}

	@GetMapping("/get{eid}")
	public Employee getById(@PathVariable int eid) {

		return service.getEmployeeById(eid);
	}

	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return service.getAllEmployees();
	}
	
	@PutMapping("/update")
	public Employee updaEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);

	}
	
	@DeleteMapping("/delete{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		return service.deleteEmployeeById(eid);
		
	}

}
