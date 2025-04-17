package com.said.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.said.apps.entities.OrderItem;
import com.said.apps.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}