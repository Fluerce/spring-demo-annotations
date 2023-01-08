package com.vqiicadiz.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FinalDemoApp {
	
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(FinalConfig.class);
		
		Coach theCoach = context.getBean("finalCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
