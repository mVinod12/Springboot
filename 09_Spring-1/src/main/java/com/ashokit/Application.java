package com.ashokit;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.ashokit.controller.EmployeeController;
import com.ashokit.util.Customer;
import com.ashokit.util.Employee;

@SpringBootApplication
@PropertySource(value= {"text.properties"})
public class Application {

	public static void main(String[] args) {
		/*ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//getting the spring bean object
		EmployeeController ec = context.getBean(EmployeeController.class);
		System.out.println(ec);
		
		EmployeeService es = context.getBean(EmployeeService.class);
		System.out.println(es);
		
		DateUtils du = context.getBean(DateUtils.class);
		System.out.println(du);*/
		
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Mode.CONSOLE);
		ConfigurableApplicationContext context = app.run(args);
		
		//getting the springbean objects from container
		EmployeeController ec = context.getBean(EmployeeController.class);
		System.out.println(ec);
		
	Employee emp = context.getBean(Employee.class);
	System.out.println(emp);
	
	Customer customer = context.getBean(Customer.class);
	System.out.println(customer);
		
	}
	

}
