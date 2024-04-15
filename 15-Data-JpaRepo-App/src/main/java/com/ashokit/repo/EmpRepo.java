package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

	

}
