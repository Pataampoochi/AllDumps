/***********************************************************************************************************
 * This class LoanEligibilityService is to build the eligible loan products for the customer employment type
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE 
 *
************************************************************************************************************/
package com.cts.loanbazaar.loaneligibility.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.loanbazaar.loaneligibility.exception.ApplicationException;
import com.cts.loanbazaar.loaneligibility.model.CustomerDetails;
import com.cts.loanbazaar.loaneligibility.model.LoanProduct;

@Service
public class LoanEligibilityService {

	/**
	 * @param details
	 * @return List<LoanProduct>
	 * @throws ApplicationException
	 */
	public List<LoanProduct> checkEligibleLoanProducts(CustomerDetails details) throws ApplicationException {

		 //TODO add your code here
		if(details.getDesiredLoanAmount()> (12*details.getMonthlyIncome())) {
			throw new ApplicationException("Customer Not Eligible for the Loan");
		}
		List<LoanProduct> data = new ArrayList<LoanProduct>();
		if(details.getEmploymentType().length()>=4 &&details.getEmploymentType().length()<=30) {
		
		String employmentType = details.getEmploymentType();
		List<LoanProduct> product = new ArrayList<LoanProduct>();
		product = buildLoanProducts();
		for(int i=0;i<product.size();i++) {
			if(product.get(i).getLoanProductName().contains(employmentType)) {
				data.add(product.get(i));
			}
		}
		}
		return data; 	//TODO CHANGE THIS RETURN TYPE
	}

	
	
	/**
	 * Use the below method to test the appropriate loan products based on employment type of the customer
	 * DO NOT CHANGE THE VALUES OF THE LOAN PRODUCT DETAILS 
	 * @return List<LoanProduct>
	 */
	private List<LoanProduct> buildLoanProducts() {
		List<LoanProduct> products = new ArrayList<LoanProduct>();

		LoanProduct product1 = new LoanProduct();
		product1.setBankName("MNQ Bank");
		product1.setLoanProductName("Pensioner Pre-Approved Personal Loan");
		product1.setMaxLoanAmount(500000.00);
		product1.setMonthlyInstallment(7000.00);
		product1.setTenure(24);
		product1.setInterest(16.40);
		products.add(product1);

		LoanProduct product2 = new LoanProduct();
		product2.setBankName("PMT Bank");
		product2.setLoanProductName("Student Pre-Approved Education Loan");
		product2.setMaxLoanAmount(1200000.00);
		product2.setMonthlyInstallment(11000.00);
		product2.setTenure(48);
		product2.setInterest(12.40);
		products.add(product2);

		LoanProduct product3 = new LoanProduct();
		product3.setBankName("MNQ Bank");
		product3.setLoanProductName("Pre-Approved Personal Loan for Salaried");
		product3.setMaxLoanAmount(1000000.00);
		product3.setMonthlyInstallment(9000.00);
		product3.setTenure(36);
		product3.setInterest(15.40);
		products.add(product3);

		LoanProduct product4 = new LoanProduct();
		product4.setBankName("MNQ Bank");
		product4.setLoanProductName("Pre-Approved Personal Loan for Salaried");
		product4.setMaxLoanAmount(700000.00);
		product4.setMonthlyInstallment(8000.00);
		product4.setTenure(24);
		product4.setInterest(15.20);
		products.add(product4);

		LoanProduct product5 = new LoanProduct();
		product5.setBankName("MNQ Bank");
		product5.setLoanProductName("Pre-Approved Personal Loan for Self-Employed");
		product5.setMaxLoanAmount(2500000.00);
		product5.setMonthlyInstallment(34000.00);
		product5.setTenure(720);
		product5.setInterest(11.40);
		products.add(product5);

		return products;

	}


	
	

}
