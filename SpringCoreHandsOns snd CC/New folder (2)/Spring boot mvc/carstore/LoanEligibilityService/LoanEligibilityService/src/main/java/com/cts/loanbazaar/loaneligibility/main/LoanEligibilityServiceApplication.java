/***********************************************************************************************************
 * This class LoanEligibilityServiceApplication is the starter class for Spring Boot
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE 
 *
************************************************************************************************************/
package com.cts.loanbazaar.loaneligibility.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"com.cts.loanbazaar.loaneligibility.controller","com.cts.loanbazaar.loaneligibility.model","com.cts.loanbazaar.loaneligibility.service","com.cts.loanbazaar.loaneligibility.exception"})
public class LoanEligibilityServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LoanEligibilityServiceApplication.class, args);
	}

	
}
