package com.said.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.said.apps.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
