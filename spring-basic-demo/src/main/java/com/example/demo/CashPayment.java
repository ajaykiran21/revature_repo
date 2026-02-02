package com.example.demo;

import org.springframework.stereotype.Component;

@Component("CashPayment")
public class CashPayment implements PaymentService {

	public void pay() {
		
		System.out.println("Cash payment");
	}
}
