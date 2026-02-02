package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student() {
        System.out.println("Student object created");
    }

    public void study() {
        System.out.println("Student is studying");
    }
}