package com.klam.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	//create a no-arg constructor
	public CricketCoach() {
		//System.out.println("CricketCoach: inside no-arg constructor");
		
	}		
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		//System.out.print("CricketCoach: inside setter method -setEmailAddress ");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		//System.out.print("CricketCoach: inside setter method -setTeam");
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	// our setter method 
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
