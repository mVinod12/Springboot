package com.ashokit.runner;

import java.util.Iterator;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageQueueRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("MessageQueueRunner run method class....");
		System.out.println("Non-option Arguments(CLA):::::" + args.getNonOptionArgs());
		
		System.out.println("Option Arguments:::::" + args.getOptionNames());
		System.out.println("DatabaseUsername::::::::" + args.getOptionValues("DatabaseUsername"));
		System.out.println("DatabasePassword::::::::" + args.getOptionValues("DatabasePassword"));
		
		Set<String> optionNames = args.getOptionNames();
		
		//traditional process
		Iterator<String> iterator = optionNames.iterator();
		while(iterator.hasNext()) {
			//current key 
			String propertyKey = iterator.next();
			//key Associated value
			String propertyValue = args.getOptionValues(propertyKey).get(0);
			System.out.println(propertyKey + " -----" + propertyValue);
		}
		
	}

}
