package com.said.apps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.said.apps.entities.Category;
import com.said.apps.repositories.CategoryRepository;
import com.said.apps.services.exceptions.DatabaseException;
import com.said.apps.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
	public Category insert(Category obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			if(!repository.existsById(id)) {
				throw new ResourceNotFoundException(id);
			}
			repository.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
}