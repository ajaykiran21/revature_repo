package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMotor {
	
	@Bean
	public Motor motor() {
		return new Motor();
	}

}
