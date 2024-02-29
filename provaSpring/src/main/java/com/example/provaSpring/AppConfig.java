package com.example.provaSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "act")
	public Actor MyBean() {
		return new Actor();
	}



}
