package com.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course.entities.Order;


public interface OrderRepository  extends JpaRepository<Order, Long>{}
