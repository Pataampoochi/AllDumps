package com.cts.travelrequest.vo;

import java.util.Date;

public class TravelRequest {
	// member variables
	private String travelReqId;
	private Date travelDate;
	private String approvalStatus;
	private String sourceCity;
	private String destinationCity;
	private double travelCost;
	
	public TravelRequest() {
	    super();
		// TODO Auto-generated constructor stub
	}
	// parameterized constructor
	public TravelRequest(String travelReqId, Date travelDate, String approvalStatus, String sourceCity,
			String destinationCity, double travelCost) {
		super();
		this.travelReqId = travelReqId;
		this.travelDate = travelDate;
		this.approvalStatus = approvalStatus;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.travelCost = travelCost;
	}
	// setter, getter

	/**
	 * @return the travelReqId
	 */	
	public String getTravelReqId() {
		return travelReqId;
	}
	/**
	 * @param travelReqId
	 *            the travelReqId to set
	 */
	public void setTravelReqId(String travelReqId) {
		this.travelReqId = travelReqId;
	}
	/**
	 * @return the travelDate
	 */	
	public Date getTravelDate() {
		return travelDate;
	}
	/**
	 * @param travelDate
	 *            the travelDate to set
	 */
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	/**
	 * @return the approvalStatus
	 */	
	public String getApprovalStatus() {
		return approvalStatus;
	}
	/**
	 * @param approvalStatus
	 *            the approvalStatus to set
	 */
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	/**
	 * @return the sourceCity
	 */	
	public String getSourceCity() {
		return sourceCity;
	}
	/**
	 * @param sourceCity
	 *            the sourceCity to set
	 */
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	/**
	 * @return the sourceCity
	 */
	public String getDestinationCity() {
		return destinationCity;
	}
	/**
	 * @param destinationCity
	 *            the destinationCity to set
	 */
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	/**
	 * @return the travelCost
	 */
	public double getTravelCost() {
		return travelCost;
	}
	/**
	 * @param travelCost
	 *            the travelCost to set
	 */
	public void setTravelCost(double travelCost) {
		this.travelCost = travelCost;
	}
		
}
