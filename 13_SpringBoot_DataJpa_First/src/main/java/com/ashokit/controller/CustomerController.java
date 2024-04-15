package com.ashokit.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashokit.entity.Customer;
import com.ashokit.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public void createNewCustomer(Customer customer) {
	Customer customerDetails = customerService.creatingNewBrandCustomer(customer);
	if(Objects.nonNull(customerDetails)) {
		System.out.println("Customer created successfully......");
		}else {
			System.out.println("Customer not created....");
		}
	}
	
	public void createNewCustomers(List<Customer> customers) {
		Iterable<Customer> newCustomers =  customerService.creatingNewBrandCustomers(customers);
		newCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
	}
	
	public void fetchCustomerDetailsById(Integer customerid) {
		Optional<Customer> customerDetails = customerService.getCustomerById(customerid);
		
		//Checking customer object present in optional object or not
		if(customerDetails.isPresent()) {
			
		Customer customerInfo	= customerDetails.get();
		System.out.println(customerInfo);
		}else {
			System.out.println("Supplied customer Details are not presneted in Database");
		}
		
	}
	
	public void fetchCustomerDetailsByIds(List<Integer> customerids) {
		Iterable<Customer> allCustomers = customerService.getCustomerByIds(customerids);
		allCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
	}
	
	public void fetchAllCustomers() {
		   Iterable<Customer> allCustomers = customerService.getAllCustomers();
		   allCustomers.forEach(eachCustomer -> System.out.println(eachCustomer));
		   
	}
	
	public void removedCustomer(Customer customer) {
		String deleteStatus = customerService.deleteCustomer(customer);
		System.out.println(deleteStatus);
	}
	
	public void removeCustomers(List<Integer> customerids) {
	 String deleteStatus	= customerService.deleteCustomers(customerids);
	 System.out.println(deleteStatus);
	}


}
