package com.vqiicadiz.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FinalConfig {
	
	@Bean
	public FortuneService finalFortuneService() {
		return new FinalFortuneService();
	}
	
	@Bean
	public Coach finalCoach() {
		return new FinalCoach(finalFortuneService());
	}
}
