package com.vqiicadiz.springdemo;

public class FinalFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You have learned XML and no XML IoC and dependency injections!";
	}

}
