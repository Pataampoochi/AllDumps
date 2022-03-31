package com.cts.insurance.services;

import com.cts.insurance.entity.PropertyDetails;
import com.cts.insurance.misc.Constants;

import java.time.LocalDate;

public class CalculatePremiumService {
	public boolean checkOwnerDetails(String name,String mobile) {
		//name cannot have numbers or special characters; minimum length of name=2
		//mobile number begins with any digit between 6 and 9; length=10 
		return name.matches("^[a-zA-Z ]{2,}$") && mobile.matches("^[6-9][0-9]{9}$");
	}
	public double getPremiumAmount(PropertyDetails propertyDetails) {
		double amountToBePaid = 0;
		double additionalAmount1=0;
		double additionalAmount2=0;
		/*invoke validatePropertyParameters(propertDetails) and check the response
		 * if true ,calculate premium amount to be paid by calling
		 * the methods calculatePremiumByPropertyAge(propertyDetails),
		 * calculatePremiumForBurglaryCoverage(propertyDetails, amountToBePaid) and
		 * calculatePremiumForPoliticalUnrestCoverage(propertyDetails, amountToBePaid)
		 * 
		 * return the premium amount rounded off to zero decimal places
		 * else return 0;
		 */
		 if(!validatePropertyParameters(propertyDetails)) {
		     return 0;
		 }
		 
		amountToBePaid=calculatePremiumByPropertyAge(propertyDetails);	
		additionalAmount1=calculatePremiumForBurglaryCoverage(propertyDetails, amountToBePaid);
		additionalAmount2=calculatePremiumForPoliticalUnrestCoverage(propertyDetails, amountToBePaid);
		
		return Math.round(amountToBePaid+additionalAmount1+additionalAmount2);
	}
	public boolean validatePropertyParameters(PropertyDetails propertyDetails) {
		/*
		* conditions to be checked
		* builtUpArea between 400 and 15,000 sq. ft.
		* reconstructionCost between Rs.1,000 and Rs.10,000
		* householdValuation either same as Constants.MIN_HOUSEHOLD_VALUATION
		* between Rs.1,00,000 and Rs.15,00,000
		* builtYear between 2000 and current year
		*/
		int builtUpArea = propertyDetails.getBuiltUpArea();
		if(!(builtUpArea>=400 && builtUpArea<=15000)) return false;
		int reconstructionCost = propertyDetails.getReconstructionCost();
		if(!(reconstructionCost>=1000 && reconstructionCost<=10000)) return false;
		int householdValuation = propertyDetails.getHouseholdValuation();
		if(!((householdValuation==Constants.MIN_HOUSEHOLD_VALUATION) || (householdValuation >= 100000 && householdValuation <= 1500000))) {
		    return false;
		}
		int builtYear = propertyDetails.getBuiltYear();
		if(!(builtYear>=2000 && builtYear<=LocalDate.now().getYear())) {
		    return false;
		}
		return true;
	}
	public double calculatePremiumByPropertyAge(PropertyDetails propertyDetails) {
		//Write your code here based on business rules
		//Use Constants.MIN_PREMIUM_AMOUNT
		int sumAssured = propertyDetails.getBuiltUpArea()*propertyDetails.getReconstructionCost()+propertyDetails.getHouseholdValuation();
		int propertyAge = LocalDate.now().getYear()-propertyDetails.getBuiltYear();
		propertyDetails.setSumAssured(sumAssured);
		double premium = 0;
		if(propertyAge>15) {
		    premium = Constants.MIN_PREMIUM_AMOUNT+(propertyDetails.getSumAssured()*0.35);
		}
		else if(propertyAge>=6) {
		    premium = Constants.MIN_PREMIUM_AMOUNT+(propertyDetails.getSumAssured()*0.2);
		}
		else {
		    premium = Constants.MIN_PREMIUM_AMOUNT+(propertyDetails.getSumAssured()*0.1);
		}
		return premium;
	}

	public double calculatePremiumForBurglaryCoverage(PropertyDetails propertyDetails, double amount) {
		//write your code here based on business rules
		if(propertyDetails.getBurglaryCoverReqd().equalsIgnoreCase(Constants.YES)) {
		    return amount*.01;
		}
		return 0;
	}

	public double calculatePremiumForPoliticalUnrestCoverage(PropertyDetails propertyDetails, double amount) {
		//Write your code here based on business rules
		//Ex:-propertyDetails.getPoliticalUnrestCoverReqd().equalsIgnoreCase(Constants.YES) to check condition
		if(propertyDetails.getPoliticalUnrestCoverReqd().equalsIgnoreCase(Constants.YES)) {
		    return amount*.01;
		}
		return 0;
		
	}
}
