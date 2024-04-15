package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.util.EmployeeUtils;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	EmployeeUtils  emputils = context.getBean(EmployeeUtils.class);
	
	emputils.getAllEmployeeInfo().forEach(System.out::println);
	}

}
