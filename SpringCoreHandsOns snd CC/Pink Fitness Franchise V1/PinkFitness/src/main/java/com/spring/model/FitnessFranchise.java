package com.spring.model;

import java.util.Map;
// implement the FitnessFranchisor interface
public class FitnessFranchise implements FitnessFranchisor {
	private String location;
	private double totalIncome;	
	private double trainerSalary;	
	private double franchiseAmount;
	private double percentage;
	private Map<String, Double> commonExpenses;	

	public FitnessFranchise(double percentage, Map<String, Double> commonExpenses) {
		super();
		this.percentage = percentage;
		this.commonExpenses = commonExpenses;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getPercentage() {
		return percentage;
	}

	public double getFranchiseAmount() {
		return franchiseAmount;
	}

	public Map<String, Double> getCommonExpenses() {
		return commonExpenses;
	}

	public void setCommonExpenses(Map<String, Double> commonExpenses) {
		this.commonExpenses = commonExpenses;
	}

	public void setFranchiseAmount(double franchiseAmount) {
		this.franchiseAmount = franchiseAmount;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public double getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}


	public double getTrainerSalary() {
		return trainerSalary;
	}

	public void setTrainerSalary(double trainerSalary) {
		this.trainerSalary = trainerSalary;
	}

	public void calculateFranchiseAmount(double netProfit) {

	//Calculating Franchise Amount
		this.franchiseAmount=netProfit*(percentage)/100;
		
	}
}
