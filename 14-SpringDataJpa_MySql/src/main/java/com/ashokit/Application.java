package com.ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.controller.CustomerController;
import com.ashokit.entity.Customer;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerController customerController;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//Preparing the one customer object
		
		Customer cust1 = new Customer();
		cust1.setName("Naresh");
		cust1.setLocation("Mumabi");
		cust1.setEmailId("Naresh@gmail.com");
		cust1.setContactNo("167667");
		
		Customer cust2 = new Customer();
		cust2.setName("Ramesh");
		cust2.setLocation("Narsampet");
		cust2.setEmailId("ramesh@gmail.com");
		cust2.setContactNo("125567");
		
		//Calling the Controller class methods
		//customerController.createNewCustomer(cust);
		customerController.createNewCustomers(List.of(cust2,cust1));
		//customerController.fetchCustomerDetailsById(123);
		//customerController.fetchCustomerDetailsByIds(List.of(123,467));
		//customerController.fetchAllCustomers();
		
		//customerController.removedCustomer(deleteCustomer);
		
		//customerController.removeCustomers(List.of(456,223));
		
	}

}
