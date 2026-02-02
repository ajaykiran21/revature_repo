package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Room {
	
		Fan f;
		public Room(Fan f) {
			this.f=f;
			System.out.println("room created");
//			f.rotate();
		}

}
