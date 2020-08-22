package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context =  SpringApplication.run(FirstProjApplication.class, args);
		
		User user = context.getBean(User.class);
		user.show();
		
		User user1 = context.getBean(User.class);
        user.show();
	}

}
