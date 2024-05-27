package com.l100n.dbpractice.UserRolManagement;

import com.l100n.dbpractice.UserRolManagement.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class UserRolManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(UserRolManagementApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		userRepository.findAll().forEach(user -> log.info(user.toString()));
	}

}
