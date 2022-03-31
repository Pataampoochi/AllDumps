package java_lc_cc.Busy_Day_of_the_week;
//package com.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class LMCBO {
	
private List<String> appointmentDetailsList=new ArrayList<>();
	
	
	public List<String> getAppointmentDetailsList() {
		return appointmentDetailsList;
	}


	public void setAppointmentDetailsList(List<String> appointmentDetailsList) {
		this.appointmentDetailsList = appointmentDetailsList;
	}


	//This method should add the appointmentDay passed as argument into the appointmentDetailsList
	public void addAppointmentDayDetails (String appointmentDay)
	{
	    //System.out.println("APP Day:"+appointmentDay);
		appointmentDetailsList.add(appointmentDay);
	//	System.out.println("added value:"+appointmentDetailsList.get(0));
	}
	
	
	/* This method should return the maximum number of appointments made based on values available in the appointmentDetailsList 
	
	For Example:
	 if the list contains the following values as [Saturday,Friday,Saturday,Saturday,Monday]
	 the output should be Saturday

	 */
	public int findAppointmentCount(String findDay) 
	{  if (appointmentDetailsList.size() == 0)
			return -1;
		else {
			int count = 0;
			for (String day : appointmentDetailsList) {
				if (day.equals(findDay))
					count++;
			}
			return count;
			
		}
		
		// type your code here
		
				
	}
}
