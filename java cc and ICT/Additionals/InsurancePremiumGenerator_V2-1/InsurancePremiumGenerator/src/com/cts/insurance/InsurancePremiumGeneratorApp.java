package com.cts.insurance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cts.insurance.entity.PropertyDetails;
import com.cts.insurance.misc.Constants;
import com.cts.insurance.services.CalculatePremiumService;
import com.cts.insurance.skeleton.SkeletonValidator;

public class InsurancePremiumGeneratorApp {

	public static void main(String[] args)throws IOException {
		
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE
		
		SkeletonValidator validator = new SkeletonValidator();
		
		// CODE SKELETON - VALIDATION ENDS
		
		// Please start your code from here
		String name = "";
		String mobile = "";
		Integer builtUpArea = 0;
		Integer builtYear=0;
		Integer reconstructionCost = 0;
		Integer householdValuation = Constants.MIN_HOUSEHOLD_VALUATION;
		String burglaryCoverReqd = "";
		String politicalUnrestCoverReqd = "";
		
		//writer the code for creating BufferedReader object here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CalculatePremiumService premiumService = new CalculatePremiumService();
		
		System.out.println("Enter the name");
		//read name
		name = br.readLine();
		System.out.println("Enter the mobile");
		//read mobile
		mobile = br.readLine();
		//validate name and mobile format; continue if true
		if(premiumService.checkOwnerDetails(name, mobile)) {
		System.out.println("Enter the Built-Up Area(In sq.ft.)between 400 and 15,000");
		//read builtUpArea
		builtUpArea = Integer.parseInt(br.readLine());
		System.out.println("Enter the year the house was built");
		//read builtYear
		builtYear = Integer.parseInt(br.readLine());
		System.out.println("Enter the Re-construction cost(per sq.ft.)between 1,000 and 10,000");
		//read reconstructionCost
		reconstructionCost = Integer.parseInt(br.readLine());
		System.out.println(
				"Do you want to include valuation of HouseHold Articles? Please provide yes/no");
		//read response
        String response = br.readLine();
        
		//if (response is "yes" case insensitive) 
		if(response.equalsIgnoreCase("yes")) {
		    System.out.println("Enter the Household valuation between Rs.1,00,000 and Rs.15,00,000");
		    //read householdValuation
		    householdValuation = Integer.parseInt(br.readLine());
		}
		

		System.out.println("Do you want to include Burglary cover? Please provide yes/no");
		//read burglaryCoverReqd 			
        burglaryCoverReqd = br.readLine();
		System.out.println("Do you want to include Political unrest cover? Please provide yes/no");
		//read politicalUnrestCoverReqd			
        politicalUnrestCoverReqd = br.readLine();
		//create PropertyDetails Object
		PropertyDetails propertyDetails = new PropertyDetails(builtUpArea, builtYear, reconstructionCost, householdValuation, burglaryCoverReqd, politicalUnrestCoverReqd);
		double premiumAmount = premiumService.getPremiumAmount(propertyDetails);
		if(premiumAmount==0.0) {
			System.out.println("Incorrect figures provided");
		}else {
			System.out.println("Sum Insured: Rs."+propertyDetails.getSumAssured()+"\nInsurance Premium for the property of " + name + ": Rs." + premiumAmount);
		}
		}
		else {System.out.println("Invalid Details");}			
		
	}

}
