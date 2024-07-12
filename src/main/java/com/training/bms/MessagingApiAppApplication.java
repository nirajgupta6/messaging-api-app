package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {
	
	public void printGreetings() {
		System.out.println("Hi Oracle.");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
		System.out.println("Hi Oracle.");
		System.out.println("Hi Oracle.");
		System.out.println("Hi Oracle.");
	}

}
