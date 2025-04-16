package com.said.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.said.apps.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
