package com.ashokit.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Email Runner:::::" + Arrays.toString(args));
		
	}

}
