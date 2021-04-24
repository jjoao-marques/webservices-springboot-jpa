package com.devsuperior.course.config;


import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devsuperior.course.entities.Order;
import com.devsuperior.course.entities.User;
import com.devsuperior.course.repositories.OrderRepository;
import com.devsuperior.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "João Marques", "joao@gmail.com", "16997990177", "123456") ;
		User u2 = new User(null, "Taiane","taiane@gmail.com", "16988445818", "12345678");
		User u3 = new User(null, "Leonidas","leonidas@gmail.com", "16997079978", "010203");
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u3);
		 
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
