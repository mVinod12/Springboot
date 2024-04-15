package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	
	@Override
	public void fetchCustomersByName(String name) {
		Iterable<Customer> allCustomers = customerDao.findByName(name);
		allCustomers.forEach(System.out::println);

	}

	@Override
	public void fetchCustomersByNameAndLocation(String name, String location) {
		Iterable<Customer> allCustomers = customerDao.findByNameAndLocation(name, location);
		allCustomers.forEach(System.out::println);

	}

	@Override
	public void fetchCustomersByLocationWithPagination(String location, int pageSize, int currentPage) {
		PageRequest pageable = PageRequest.of(currentPage, pageSize);
		Page<Customer> allCustomers = customerDao.findByLocation(location, pageable);
		allCustomers.forEach(System.out::println);

	}

	@Override
	public void getCountOfCustomerName(String name) {
		System.out.println("Customer Count By Name ::::" + customerDao.countByName(name));

	}

	@Override
	public void fetchCustomersBetweenBillAmount(float stBillAmount, float endBillAmount) {
		Iterable<Customer> allCustomers = customerDao.findByBillAmountBetween(stBillAmount, endBillAmount);
		allCustomers.forEach(System.out::println);

	}

}
