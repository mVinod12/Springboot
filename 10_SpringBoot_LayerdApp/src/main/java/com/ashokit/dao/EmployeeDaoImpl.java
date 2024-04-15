package com.ashokit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ashokit.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean createNewEmployee(Employee emp) {
		int rowCount = jdbcTemplate.update("insert into ashokit_employees values(?,?,?)", emp.getEmployeeId(),emp.getEmployeeName(),emp.getEmailId());
		//If row inserted successful means will return true otherwise will return as false
		return rowCount > 0;
	}

	@Override
	public int creatNewEmployees(List<Employee> employees) {
		int rowCount=0;
		for(Employee emp : employees) {
			rowCount += jdbcTemplate.update("insert into ashokit_employees values(?,?,?)", emp.getEmployeeId(),emp.getEmployeeName(),emp.getEmailId());
		}
		System.out.println("Row Count Checking Variable ::::::" + rowCount);
		return rowCount;
		
	}

}
