package com.cts.travelrequest.main;

import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import com.cts.travelrequest.service.TravelRequestService;
import com.cts.travelrequest.skeletonvalidator.SkeletonValidator;
import com.cts.travelrequest.vo.TravelRequest;
public class Main {

	public static void main(String[] args) throws SQLException {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE
		new SkeletonValidator();
		// CODE SKELETON - VALIDATION ENDS
		//TravelRequest tr=new TravelRequest();
		//List<TravelRequest> ltr=new ArrayList<>();		
		TravelRequestService service = new TravelRequestService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter source city:");
		String sourceCity=sc.next();
		System.out.println("Enter destination city:");
		String destinationCity=sc.next();
		System.out.println("Enter approval status to find total travel cost:");
		String status=sc.next();
		
		if(service.validateSourceAndDestination(sourceCity,destinationCity).equals("valid")){
		    List<TravelRequest> ltr=service.getTravelDetails(sourceCity, destinationCity);
		    if(ltr.isEmpty()){
		        System.out.println("No travel request raised for given source and destination cities");
		    }
		    else{
		        for(TravelRequest t:ltr){
		            SimpleDateFormat sd= new SimpleDateFormat("dd-MMM-YYYY");
		            String d=sd.format(t.getTravelDate());
		            System.out.println(t.getTravelReqId()+"\t| "+d+"\t| "+t.getApprovalStatus()+"\t| "+t.getSourceCity()+"\t| "+t.getDestinationCity()+"\t| "+t.getTravelCost());
		        }
		    }
		}
		else{
		    System.out.println("Provide correct source and destination city");
		}
		if(service.validateApprovalStatus(status).contentEquals("valid")){
		    System.out.println(service.calculateTotalTravelCost(status));
		}
		else{
		    System.out.println("Provide valid approval status");
		}
		

	}

}
