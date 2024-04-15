package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Person;
import com.ashokit.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context  = SpringApplication.run(Application.class, args);
		 PersonService bean = context.getBean(PersonService.class);
		 bean.savePerson();
	}

}