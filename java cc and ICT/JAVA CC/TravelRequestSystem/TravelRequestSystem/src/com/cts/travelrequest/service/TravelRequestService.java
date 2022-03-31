package com.cts.travelrequest.service;

import java.util.List;

import com.cts.travelrequest.dao.TravelRequestDao;
import com.cts.travelrequest.vo.TravelRequest;

public class TravelRequestService {

	/**
	 * Method to validate approval status
	 * 
	 * @return status
	 */
	public String validateApprovalStatus(String approvalStatus) {
	    if(approvalStatus.equalsIgnoreCase("Approved")||approvalStatus.equalsIgnoreCase("Pending")){
	        return "valid";
	    }
		return "invalid";  //TODO change this return value
	}

	/**
	 * Method to validate source and destination city
	 * 
	 * @return status
	 */
	public String validateSourceAndDestination(String sourceCity, String destinationCity) {
	    if(!sourceCity.equalsIgnoreCase(destinationCity)){
	        if(sourceCity.equalsIgnoreCase("Pune")|| sourceCity.equalsIgnoreCase("Mumbai")|| sourceCity.equalsIgnoreCase("Chennai")|| sourceCity.equalsIgnoreCase("Bangalore")|| sourceCity.equalsIgnoreCase("Hydrabad")){
	            if(destinationCity.equalsIgnoreCase("Pune")|| destinationCity.equalsIgnoreCase("Mumbai")||destinationCity.equalsIgnoreCase("Chennai")|| destinationCity.equalsIgnoreCase("Bangalore")|| destinationCity.equalsIgnoreCase("Hydrabad")){
	                return "valid";
	            }
	            else{
	                return "invalid";
	            }
	        }
	        else{
	            return "invalid";
	        }
	    }
	    else{
	        return "invalid";
	    }
	}

	/**
	 * Method to invoke getTravelDetails method of TravelRequestDao class
	 * 
	 * @return listOfTravelRequest
	 */
	public List<TravelRequest> getTravelDetails(String sourceCity, String destinationCity) {
	    if(this.validateSourceAndDestination(sourceCity,destinationCity).contentEquals("valid")){
	        return TravelRequestDao.getTravelDetails(sourceCity,destinationCity);
	    }
	    else{
	        return null;
	    }
	}

	/**
	 * Method to invoke calculateTotalTravelCost method of TravelRequestDao class
	 * 
	 * @return totalCost
	 */
	public double calculateTotalTravelCost(String approvalStatus) {
	    if(this.validateApprovalStatus(approvalStatus).equals("valid")){
	        return TravelRequestDao.calculateTotalTravelCost(approvalStatus);
	    }
	    else{
	        return -1;   
	    }
	}
}
