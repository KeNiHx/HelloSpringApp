package com.klam.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
	
	//create an array of fortunes
	private String[] data = {
			"Your ability for accomplishment will follow with success.",
			"A short stranger will soon enter your life with blessings to share.",
			"What ever you're goal is in life, embrace it visualize it, and for it will be yours.",
			"Jealousy doesn't open doors, it closes them!",
			"If you have something good in your life, don't let it go!"			
			
	};
	
	//create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}
	
}
