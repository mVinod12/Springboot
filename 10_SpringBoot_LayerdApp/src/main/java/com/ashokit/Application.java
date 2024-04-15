package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.controller.EmployeeController;
import com.ashokit.model.Employee;
import com.ashokit.util.EmployeeUtils;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
	//getting the Spring Bean objects
		EmployeeController ec = context.getBean(EmployeeController.class);
		
		EmployeeUtils  emputils = context.getBean(EmployeeUtils.class);
	List<Employee> employees = emputils.getAllEmployeeInfo();
	
	//calling the controller class method
	ec.addingNewEmployee(employees.get(0));
	
	//calling the controller class method to test the list of employess
	ec.addingNewEmployees(emputils.getAllEmployeeInfo());
	
	
	
	}

}
