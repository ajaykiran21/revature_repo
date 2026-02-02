package com.example.demo;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;


@Service
public class BankService {
	
	 @PreAuthorize("#amount > 5000")
	    public void withdraw(int amount) {
	        System.out.println("Money withdrawn: " + amount);
	    }

}
