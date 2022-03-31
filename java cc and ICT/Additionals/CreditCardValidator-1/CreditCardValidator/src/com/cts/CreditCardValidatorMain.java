package com.cts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cts.entity.CreditCard;
import com.cts.services.CreditCardService;
import com.cts.skeletonvalidator.SkeletonValidator;

public class CreditCardValidatorMain {
	public static void main(String[] args) throws IOException {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
	
		String cardNumber = b.readLine();
		CreditCard creditCard = new CreditCard();
		creditCard.setNumber(cardNumber);
		//Write your code here read card numnber and create CreditCard object based on cardnumber
		CreditCardService creditCardService = new CreditCardService();
		
		String validationMessage=creditCardService.validate(creditCard, "resources/blacklist.csv");
		System.out.println(validationMessage);
	}
}
