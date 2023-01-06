package com.vqiicadiz.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public GymCoach() {
		System.out.println(">> Gym Coach: inside default constructor");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> Gym Coach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Do ten more bench presses";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
