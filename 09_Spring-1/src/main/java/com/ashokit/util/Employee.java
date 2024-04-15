package com.ashokit.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("${employeeId}")
	private String employeeId;
	
	@Value("${employeeName}")
	private String employeeName;
	
	@Value("${designation}")
	private String designation;
	
	@Value("${salary}")
	private double salary;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	
}
