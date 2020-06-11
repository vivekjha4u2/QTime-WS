package com.infy;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankLoanToTraineeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankLoanToTraineeApplication.class, args);
		
		
		Random r = new Random();
		System.out.println(r.nextInt((100 - 1) + 1) + 1);
		//System.out.println(getRandomNumberInRange(16, 20));
	}

}
