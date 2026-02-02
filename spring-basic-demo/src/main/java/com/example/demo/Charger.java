package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Charger {
	
	public Charger() {
		System.out.println("Charger created");
	}
	
	public void charger() {
		System.out.println("Charging phone");
	}

}
