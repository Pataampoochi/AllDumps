/***********************************************************************************************************
 * This class ErrorResponse is the value object that must be binded to results view
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE 
 *
************************************************************************************************************/
package com.cts.loanbazaar.loaneligibility.model;

public class LoanProduct {
	///DO NOT CHANGE THE VARIABLE NAMES OR DATA TYPES OR ACCESS SPECIFIERS
	public String bankName;
	public String loanProductName;
	public Double maxLoanAmount;
	public Integer tenure;
	public Double interest;
	public Double monthlyInstallment;
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the loanProductName
	 */
	public String getLoanProductName() {
		return loanProductName;
	}
	/**
	 * @param loanProductName the loanProductName to set
	 */
	public void setLoanProductName(String loanProductName) {
		this.loanProductName = loanProductName;
	}
	/**
	 * @return the maxLoanAmount
	 */
	public Double getMaxLoanAmount() {
		return maxLoanAmount;
	}
	/**
	 * @param maxLoanAmount the maxLoanAmount to set
	 */
	public void setMaxLoanAmount(Double maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	/**
	 * @return the tenure
	 */
	public Integer getTenure() {
		return tenure;
	}
	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	/**
	 * @return the interest
	 */
	public Double getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	/**
	 * @return the monthlyInstallment
	 */
	public Double getMonthlyInstallment() {
		return monthlyInstallment;
	}
	/**
	 * @param monthlyInstallment the monthlyInstallment to set
	 */
	public void setMonthlyInstallment(Double monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}

}