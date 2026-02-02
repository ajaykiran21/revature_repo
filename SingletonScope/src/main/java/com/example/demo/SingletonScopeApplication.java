package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SingletonScopeApplication {

	public static void main(String[] args) {
		 ApplicationContext context =
	                SpringApplication.run(SingletonScopeApplication.class, args);
		 
		 MessageService m1 = context.getBean(MessageService.class);
		 MessageService m2 = context.getBean(MessageService.class);
		 System.out.println(m1 == m2);

	}

}
