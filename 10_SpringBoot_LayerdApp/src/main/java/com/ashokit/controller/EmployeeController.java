package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashokit.model.Employee;
import com.ashokit.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	public void addingNewEmployee(Employee employee) {
		
		//Calling the service method
		empService.createBrandNewEmployee(employee);
	}
	
	public void addingNewEmployees(List<Employee> employees) {
		
		//calling the service method
		empService.createBrandNewEmployees(employees);
	}

}
