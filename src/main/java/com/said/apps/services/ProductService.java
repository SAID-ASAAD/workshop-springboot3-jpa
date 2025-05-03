package com.said.apps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.said.apps.entities.Product;
import com.said.apps.repositories.ProductRepository;
import com.said.apps.services.exceptions.DatabaseException;
import com.said.apps.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

	public Product insert(Product obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			if (!repository.existsById(id)) {
				throw new ResourceNotFoundException(id);
			}
			repository.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
}
