package com.cts.paymentProcess.model;

import java.util.Date;

public class Payment {

	private int customerNumber;
	private String chequeNumber;
	private Date paymentDate;
	private int amount;

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {

		return String.format("%15s%15s%15s%15s", customerNumber, chequeNumber, paymentDate, amount);

	}

}
