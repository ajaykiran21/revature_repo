package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	Engine e;
	public Car(Engine e) {
		this.e=e;
		System.out.println("Car been created...");
	}
	
	public void drive() {
		System.out.println("car beeing started...");
	}

}
