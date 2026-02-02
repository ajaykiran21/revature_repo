package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configr {
	
	@Bean
	public Fan fan() {
		return new Fan();
	}

}
