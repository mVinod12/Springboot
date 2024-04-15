package com.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Employee;
import com.ashokit.repo.EmpRepo;

@Service
public class EmpService {
	
	private EmpRepo empRepo;
	
	public EmpService(EmpRepo repo) {
		this.empRepo=repo;
	}
	
	public void getAllEmps() {
		List<Employee> emps = empRepo.findAll();
		
		emps.forEach(e -> System.out.println(e));
	}
	
	public void getAllEmpsWithFilter() {
		
		Employee entity = new Employee();
		entity.setEname("sunil");
		
		Example<Employee> example = Example.of(entity);
		
		
        List<Employee> emps = empRepo.findAll(example);
		
		emps.forEach(e -> System.out.println(e));
		
	}
	
	public void getAllEmpsPagination() {
		
		int pageSize = 2; //fixed value
		int pageNumber = 2; // will come from UI
		
		PageRequest pg = PageRequest.of(pageNumber-1, pageSize);
		
		 Page<Employee> page = empRepo.findAll(pg);
		 
	     List<Employee >emps = page.getContent();
		
		emps.forEach(e -> System.out.println(e));
	}
	
	
	
	
	public void getAllEmpSort() {
		Sort sort = Sort.by("esalary").ascending();
	List<Employee>emps = empRepo.findAll(sort);
	emps.forEach(a -> System.out.println(a));
	
	}
	
	
	
	

}
