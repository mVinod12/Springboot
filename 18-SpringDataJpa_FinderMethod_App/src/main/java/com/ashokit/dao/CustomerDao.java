package com.ashokit.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Serializable> {
	
	public Iterable<Customer> findByName(String name);
	
	public Iterable<Customer> findByLocation(String location);
	
	public Page<Customer> findByLocation(String Location, Pageable pageable);
   
	public Iterable<Customer> findByNameAndLocation(String name, String location, Sort sort);
	
	public List<Customer> findByNameAndLocation(String name, String location);
	
	public Integer CountByName(String name);
	
	public Iterable<Customer> findByBillAmountLessThan(float billAmount);
	
	public Iterable<Customer> findByBillAmountGreaterThan(float billAmount);
	
	public Iterable<Customer> findByBillAmountBetween(float startBillAmount, float endBillAmount);
}
