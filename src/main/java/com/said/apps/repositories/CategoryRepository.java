package com.said.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.said.apps.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}