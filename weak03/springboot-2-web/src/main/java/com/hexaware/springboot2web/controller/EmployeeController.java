package com.hexaware.springboot2web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot2web.dao.IEmployeeDao;
import com.hexaware.springboot2web.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController { // SERVLET

	@Autowired
	IEmployeeDao dao;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public String addEmployee(HttpServletRequest request, HttpServletResponse response) {

		int eid = Integer.parseInt(request.getParameter("eid"));

		String ename = request.getParameter("ename");

		double salary = Double.parseDouble(request.getParameter("salary"));

		Employee emp = new Employee(eid, ename, salary);

		return dao.addEmployee(emp);

	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	@ResponseBody
	public String updateEmployee(HttpServletRequest request) {

		int eid = Integer.parseInt(request.getParameter("eid"));

		String ename = request.getParameter("ename");

		double salary = Double.parseDouble(request.getParameter("salary"));

		Employee emp = new Employee(eid, ename, salary);

		return dao.updateEmployee(emp);

	}

//	one Way using direct way 

//	@RequestMapping(value="/getall",method = RequestMethod.GET)//jisme values or method type hai bs bahi localhost:8080browser se access honge
//	 @ResponseBody
//	public List<Employee> getAllEmployees(HttpSession session) {
//		we can call it using jsp web page also 
//		return dao.getAll();
//	}
//	another way 
	@RequestMapping("getall") // jisme values or method type hai bs bahi localhost:8080browser se access honge
//	 @ResponseBody
	public String getAllEmployees(HttpSession session) {

		List<Employee> list = dao.getAll();

		session.setAttribute("empList", list);

		return "displayAll"; // /views/displayAll.jsp

	}

	@RequestMapping("/get")
	public String get() { // returning view/page

		return "success"; // /views/success.jsp
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(HttpServletRequest request) {

		int eid = Integer.parseInt(request.getParameter("eid"));

		return dao.deleteEmployee(eid);

	}

	@RequestMapping(value = "getById", method = RequestMethod.POST)
	@ResponseBody
	public Employee getEmployeeByI(HttpServletRequest request, HttpServletResponse response) {
		int eid = Integer.parseInt(request.getParameter("eid"));

		return dao.getEmployeeById(eid);

	}
}
