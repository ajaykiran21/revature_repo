package com.example.demo;

import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
//@RequestScope
//@SessionScope
@ApplicationScope
public class RequestBean {

    private String requestId;

    public RequestBean() {
        this.requestId = UUID.randomUUID().toString();
        System.out.println("RequestBean Created: " + requestId);
    }

    public String getRequestId() {
        return requestId;
    }

}
