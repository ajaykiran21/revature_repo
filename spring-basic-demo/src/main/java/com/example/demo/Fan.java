package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Fan {
	public Fan() {
		System.out.println("Fan Created");
	}
	public void rotate() {
		System.out.println("Fan is rotating");
	}

}
