package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
