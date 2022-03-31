/***********************************************************************************************************
 * This class ApplicationException is a user defined exception for the proposed system
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE 
 * ADD CONSTRUCTORS AS NEEDED
 *
************************************************************************************************************/
package com.cts.loanbazaar.loaneligibility.exception;

/**
 *
 */

public class ApplicationException extends Exception {

	private static final long serialVersionUID = -9079454849611061074L;

	public ApplicationException(String message) {
		super(message);
	}
	
	
}
