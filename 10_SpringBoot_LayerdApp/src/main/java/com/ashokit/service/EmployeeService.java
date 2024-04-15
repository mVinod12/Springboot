package com.ashokit.service;

import java.util.List;

import com.ashokit.model.Employee;

public interface EmployeeService {

	public void createBrandNewEmployee(Employee employee);
	
	public void createBrandNewEmployees(List<Employee> employees);

}
