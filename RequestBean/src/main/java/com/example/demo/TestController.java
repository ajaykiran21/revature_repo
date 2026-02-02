package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	RequestBean rb;
	public TestController(RequestBean rb) {
		this.rb = rb;
	}
	
	
	@GetMapping("/test")
	public String requestScope() {
		
		return "Request ID: " + rb.getRequestId()
        + " | Bean hashCode: " + rb.hashCode();

	}
	
}
