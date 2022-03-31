package com.cts.insurance.entity;

public class PropertyDetails {
	private Integer builtUpArea;
	private Integer builtYear;
	private Integer reconstructionCost;
	private Integer householdValuation;
	private String burglaryCoverReqd;
	private String politicalUnrestCoverReqd;
	private Integer sumAssured;	
	
	public PropertyDetails() {
		
	}	

	public Integer getBuiltUpArea() {
		return builtUpArea;
	}

	public void setBuiltUpArea(Integer builtUpArea) {
		this.builtUpArea = builtUpArea;
	}
	
	public Integer getBuiltYear() {
		return builtYear;
	}

	public void setBuiltYear(Integer builtYear) {
		this.builtYear = builtYear;
	}

	public Integer getReconstructionCost() {
		return reconstructionCost;
	}

	public void setReconstructionCost(Integer reconstructionCost) {
		this.reconstructionCost = reconstructionCost;
	}

	public Integer getHouseholdValuation() {
		return householdValuation;
	}

	public void setHouseholdValuation(Integer householdValuation) {
		this.householdValuation = householdValuation;
	}	

	public String getBurglaryCoverReqd() {
		return burglaryCoverReqd;
	}

	public void setBurglaryCoverReqd(String burglaryCoverReqd) {
		this.burglaryCoverReqd = burglaryCoverReqd;
	}

	public String getPoliticalUnrestCoverReqd() {
		return politicalUnrestCoverReqd;
	}

	public void setPoliticalUnrestCoverReqd(String politicalUnrestCoverReqd) {
		this.politicalUnrestCoverReqd = politicalUnrestCoverReqd;
	}

	public Integer getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(Integer sumAssured) {
		this.sumAssured = sumAssured;
	}

	public PropertyDetails(Integer builtUpArea,Integer builtYear, Integer reconstructionCost, Integer householdValuation,
			String burglaryCoverReqd, String politicalUnrestCoverReqd) {
		super();		
		this.builtUpArea = builtUpArea;
		this.builtYear=builtYear;
		this.reconstructionCost = reconstructionCost;
		this.householdValuation = householdValuation;
		this.burglaryCoverReqd = burglaryCoverReqd;
		this.politicalUnrestCoverReqd = politicalUnrestCoverReqd;		
	}
	

}
