package com.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course.entities.OrderItem;


public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{}
