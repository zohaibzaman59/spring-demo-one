package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// create spring container or application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(IConfigConstants.CONFIG_FILE);

		ICoach coach = context.getBean(IConfigConstants.FOOTBALL_COACH, ICoach.class);
		
		System.out.println(coach.getWorkToDo());
		
		context.close();

	}

}
