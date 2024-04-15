package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.EmployeeDao;
import com.ashokit.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void createBrandNewEmployee(Employee employee) {
		//calling the DAO Method
				boolean employeeCreatedStatus = employeeDao.createNewEmployee(employee);
				if(employeeCreatedStatus) {
					System.out.println("Employee Created SuccessFully..........");
				}

	}

	@Override
	public void createBrandNewEmployees(List<Employee> employees) {
		//Calling the DAO Method
				int employeeCreatedcount = employeeDao.creatNewEmployees(employees);
				System.out.println("Employee Created Count:::"+employeeCreatedcount+" Successfully");

	}

}
