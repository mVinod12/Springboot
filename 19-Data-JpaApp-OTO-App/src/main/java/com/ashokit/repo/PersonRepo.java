package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
