package com.vqiicadiz.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	@Value("${fortunes}")
	private String[] fortunes;
	
	@PostConstruct
	public void beanPostConstruct() {
		try {
			BufferedReader bufferedReader = 
					new BufferedReader(new FileReader("src/fortune.txt"));
			String[] fortunes = bufferedReader.readLine().split(", ");
			this.fortunes = fortunes;
//			for(String fortune: fortunes) {
//				System.out.println(fortune);
//			}
			bufferedReader.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

	@Override
	public String getFortune() {
		Random rand = new Random();
		int index = rand.nextInt(fortunes.length);
		return fortunes[index];
	}

}
