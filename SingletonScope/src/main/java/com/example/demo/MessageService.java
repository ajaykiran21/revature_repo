package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	

	public MessageService() {
		System.out.println("Bean Created only once....");
	}
	
	public String getMessage() {
		return "hello .. i am singleton bean...";
	}
}
