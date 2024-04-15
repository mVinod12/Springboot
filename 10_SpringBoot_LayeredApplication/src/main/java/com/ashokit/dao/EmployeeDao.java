package com.ashokit.dao;

import java.util.List;

import com.ashokit.model.Employee;

public interface EmployeeDao {
	
	//creating the new employee
			public boolean createNewEmployee(Employee emp);
			
			//creating the employees based on List
			public int creatNewEmployees(List<Employee> employees);

}
