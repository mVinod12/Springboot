package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
