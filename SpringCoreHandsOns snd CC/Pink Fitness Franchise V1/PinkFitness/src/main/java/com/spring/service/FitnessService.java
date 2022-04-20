package com.spring.service;

import com.spring.bo.FitnessBO;
import com.spring.exception.NoProfitException;
import com.spring.model.FitnessFranchise;

public class FitnessService {

	private FitnessBO fitnessBO;

	
	public FitnessBO getFitnessBO() {
		return fitnessBO;
	}

	public void setFitnessBO(FitnessBO fitnessBO) {
		this.fitnessBO = fitnessBO;
	}
	public void calculateNetProfit(FitnessFranchise franchise) throws NoProfitException {
		//fill the code
		
		double netProfit=fitnessBO.calculateNetProfit(franchise);
		
		if(netProfit<0)
		{
			throw new NoProfitException("No profit to calculate franchise amount");
		}
		else
		{
			franchise.calculateFranchiseAmount(netProfit);
		}
	}

	public FitnessService(FitnessBO fitnessBO) {
		super();
		this.fitnessBO = fitnessBO;
	}

	
	
}
