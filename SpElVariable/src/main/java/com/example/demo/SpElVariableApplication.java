package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpElVariableApplication {

	public static void main(String[] args) {
		ApplicationContext context =
                SpringApplication.run( SpElVariableApplication .class, args);		
		BankService b = context.getBean(BankService.class);
		b.withdraw(10000);
	}

}
