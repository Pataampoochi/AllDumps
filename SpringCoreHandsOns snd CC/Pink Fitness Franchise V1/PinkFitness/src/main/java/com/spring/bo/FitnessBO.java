package com.spring.bo;

import com.spring.model.FitnessFranchise;

public class FitnessBO {

	public double calculateNetProfit(FitnessFranchise franchise) {

		//// Calculating netProfit based on factors

		double expense = franchise.getTotalIncome() - (franchise.getTrainerSalary()
				+ franchise.getCommonExpenses().get("Rent") + franchise.getCommonExpenses().get("HouseKeeping")
				+ franchise.getCommonExpenses().get("ElectricityCharges")
				+ franchise.getCommonExpenses().get("Maintenence"));

		return expense;

	}
}
