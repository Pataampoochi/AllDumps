package com.spring.model;

//pojo class with required attributes,getters and setters 
public class Recharge {

	private String rechargeId;	
	private long phoneNumber;
	private double rechargeAmount;
	private RechargePlan rechargePlan;
    private int cashBackPercent;
	public int getCashBackPercent() {
		return cashBackPercent;
	}

	public void setCashBackPercent(int cashBackPercent) {
		
		this.cashBackPercent = cashBackPercent;
	}

	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}

	public RechargePlan getRechargePlan() {
		return rechargePlan;
	}

	public void setRechargePlan(RechargePlan rechargePlan) {
		this.rechargePlan = rechargePlan;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	public double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	
}
