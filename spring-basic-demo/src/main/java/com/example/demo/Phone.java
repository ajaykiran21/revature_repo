package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	@Autowired
	Charger c;
	
	public Phone() {
		System.out.println("Phone Created");
	}
	
	
//	@Autowired
//	public void setCharger(Charger c) {
//		this .c=c;
//		System.out.println("Charger injected using setter");
//	}
	public void use() {
		c.charger();
		System.out.println("phone is used");
	}

}
