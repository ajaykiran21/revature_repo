package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle {
	public BeanLifeCycle() {
		System.out.println("Bean Created......1");
	}
	
	@PostConstruct
	public void  step2() {
		System.out.println("intilization...2");
	}
	
	public void work() {
		System.out.println("working");
	}
	
	@PreDestroy
	public void step3() {
		System.out.println("bean destroyed");
	}

}
