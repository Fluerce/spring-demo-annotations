package com.vqiicadiz.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> Tennis Coach: inside default constructor");
	}
	
//	@PostConstruct
//	public void doMyStartupStuff() {
//		System.out.println("POSTCONSTRUCT");
//	}
//	
//	@PreDestroy
//	public void doMyCleanupStuff() {
//		System.out.println("PREDESTROY");
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> Tennis Coach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Pracice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	
	
	

}
