package com.example.provaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProvaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaSpringApplication.class, args);
		System.out.println("ciao");
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

	System.out.println(context.getBean("act"));
	}

}
