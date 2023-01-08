package com.vqiicadiz.springdemo;

public class FinalCoach implements Coach {

	private FortuneService fortuneService;
	
	public FinalCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "You did it, you are done!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
