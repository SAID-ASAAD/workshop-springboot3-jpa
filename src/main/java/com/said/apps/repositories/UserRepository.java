package com.said.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.said.apps.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
