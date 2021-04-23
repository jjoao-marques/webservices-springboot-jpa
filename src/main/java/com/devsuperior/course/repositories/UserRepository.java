package com.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{}
