package com.devsuperior.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devsuperior.course.entities.User;
import com.devsuperior.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "João Marques", "joao@gmail.com", "16997990177", "123456") ;
		User u2 = new User(null, "Taiane","taiane@gmail.com", "16988445818", "12345678");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
