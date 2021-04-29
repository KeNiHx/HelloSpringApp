package com.klam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GolfCoachHelloSpringApp {
	public static void main(String[] args) {
			
			// load the spring configuration file
					ClassPathXmlApplicationContext context = 
							new ClassPathXmlApplicationContext("applicationContext.xml");
							
					// retrieve bean from spring container
					Coach theCoach = context.getBean("myGolfCoach", Coach.class);
					
					// call methods on the bean
					System.out.println("Daily Workout: " + theCoach.getDailyWorkout());
					
					// let's call our new method for fortunes
					System.out.println("Fortune: " + theCoach.getDailyFortune());
					
					// close the context
					context.close();
	
		}

}
