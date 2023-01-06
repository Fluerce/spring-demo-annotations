package com.vqiicadiz.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Wow so lucky",
			"Kinda meh",
			"OH NO DO NOT"
	};
	
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(data.length);
		return data[index];
	}

}
