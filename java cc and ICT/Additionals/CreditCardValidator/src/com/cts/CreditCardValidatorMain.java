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

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String cardNumber=br.readLine();
	    CreditCard creditCard=new CreditCard(cardNumber);
		//Write your code here read card numnber and create CreditCard object based on cardnumber
		String validationMessage=CreditCardService.validate(creditCard, "resources/blacklist.csv");
		System.out.println(validationMessage);
	}
}
