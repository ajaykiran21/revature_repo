package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("I am Using Card Pyment");
	}

}
