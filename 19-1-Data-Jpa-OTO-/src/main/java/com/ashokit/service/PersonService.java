package com.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Passport;
import com.ashokit.entity.Person;
import com.ashokit.repo.PassportRepo;
import com.ashokit.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	
	public void savePerson() {
		
		Person p = new Person();
		p.setName("Allu");
		p.setGender("Male");
		
		
		Passport pp1 = new Passport();
		pp1.setPassportNum("TJUH8899");
		pp1.setIssueDate(LocalDate.now());
		pp1.setExpDate(LocalDate.now().plusYears(5));
		
		//associating person with person
		p.setPassport(pp1);
		
		//associating passport with person
		pp1.setPerson(p);
		
		//saving the method
		personRepo.save(p);
		
		
	}
	
}
