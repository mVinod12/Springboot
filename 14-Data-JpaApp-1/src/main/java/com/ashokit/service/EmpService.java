package com.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.entity.Employee;
import com.ashokit.repo.EmpRepository;

@Service
public class EmpService {

	private EmpRepository empRepo;

	public EmpService(EmpRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	
	
	public void callCustomQueries() {
		//List<Employee> emps = empRepo.getAllEmpsHQL();
		//emps.forEach(System.out::println);
		
		//Employee empById = empRepo.getEmpById(101);
		//System.out.println(empById);
		
		List<Employee> emps = empRepo.getAllEmpsSQL();
		emps.forEach(System.out::println);
		
	}
	
	public void saveEmps() {

		//Employee e1 = new Employee(201, "Ram", 1000.00);
		//Employee e2 = new Employee(202, "Anil", 2000.00);
		//Employee e3 = new Employee(203, "Sunil", 3000.00);
		Employee e4 = new Employee(204, "Prem", 4000.00);
		Employee e5 = new Employee(205, "Naveen", 5000.00);

		List<Employee> emps = Arrays.asList(e4, e5);

		empRepo.saveAll(emps);

		System.out.println("Records saved.....");

	}
	
	
	
}



