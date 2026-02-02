package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.SayHello.Hello;



@SpringBootApplication
public class SpringBasicDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBasicDemoApplication.class, args);
		ApplicationContext context =
                SpringApplication.run(SpringBasicDemoApplication.class, args);
//
//
//		
//		Shopping s = context.getBean(Shopping.class);	
//		s.check();
//		BeanLifeCycle b = context.getBean(BeanLifeCycle.class);
//		b.work();
		
//		Room r = context.getBean(Room.class);
//		Motor m = context.getBean(Motor.class);
//		Motor m2 = context.getBean(Motor.class);
//		System.out.println(m==m2);
//		ApplicationContext context =
//		        new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		Calculator calc = context.getBean("calculator", Calculator.class);
//		calc.show();
		
		
	
	}
	
	

}
