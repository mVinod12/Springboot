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
	
	public void getPassport() {
		passportRepo.findById(1);
	}
	
	public void getPerson() {
		personRepo.findById(1);
	}

	
	public void savePerson() {
		
		Person p = new Person();
		p.setName("Vinod");
		p.setGender("Male");
		
		
		Passport pp = new Passport();
		pp.setPassportNum("NUk88768");
		pp.setIssueDate(LocalDate.now());
		pp.setExpDate(LocalDate.now().plusYears(10));
		
		//associating person with passport
		p.setPassport(pp);
		
		//associating with person
		pp.setPerson(p);
		
		//saving
		personRepo.save(p);
		
		System.out.println("Record inserted ..... Successfully");
		
	}

}
