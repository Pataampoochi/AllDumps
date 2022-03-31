package com.cts.irctc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.irctc.exception.ApplicationException;
import com.cts.irctc.model.TicketBooking;
import com.cts.irctc.model.TrainInfo;

@Service
public class IrctcService {
	
	public TrainInfo getTicketBookingResult(TicketBooking ticketBooking) throws ApplicationException {
		//Add code here..
		TrainInfo trainInfo = null;
		
		List<TrainInfo> trainList = buildTrains();
		
		for(TrainInfo t : trainList) {
			String tc = "";
			if(ticketBooking.getTravelClass().equalsIgnoreCase("AC First Class (1A)")) {
				tc = "1A";
			}
			if(ticketBooking.getTravelClass().equalsIgnoreCase("AC 2 Tier (2A)")) {
				tc = "2A";
			}
			if(ticketBooking.getTravelClass().equalsIgnoreCase("AC 3 Tier (3A)")) {
				tc = "3A";
			}
			if(ticketBooking.getTravelClass().equalsIgnoreCase("Sleeper (SL)")) {
				tc = "SL";
			}
			if(ticketBooking.getTravelClass().equalsIgnoreCase("Second Sitting (2S)")) {
				tc = "2S";
			}
			if(t.getFrom().equalsIgnoreCase(ticketBooking.getFromCity()) && t.getTo().equalsIgnoreCase(ticketBooking.getToCity()) 
					&& t.getTavelClass().equalsIgnoreCase(tc)) {
				trainInfo = t;
				
				return trainInfo;
			}
			
		}
		
		return trainInfo;  //TODO, modify return value
	}
	
	public String getPNRNumber(TicketBooking ticketBooking) throws ApplicationException {
		//Add code here..
		
		TrainInfo getforpnr = getTicketBookingResult(ticketBooking);
		
		
		String pnrNumber = getforpnr.getTrainNumber().substring(0, 3)+"-"+ticketBooking.getMobileNumber().substring(0, 7);
		
		return pnrNumber;  //TODO, modify return value
		
	}
	
	// DO NOT MODIFY THIS METHOD 
    //DO NOT MODIFY CODE WITHIN METHOD
	private List<TrainInfo> buildTrains() {
		List<TrainInfo> trains = new ArrayList<TrainInfo>();
		
		//String trainNumber, String trainName, String from, String to, String tavelClass, String departure,
		//String duration, String arrival, double farePerPassenger
		//pune to bangalore
		TrainInfo trainInfo1=new TrainInfo("01013", "LTT CBE SPL", "Pune", "Bangalore", "1A", "1:55 AM", "20 hr 30 min", "10:25 PM", 3080);
		TrainInfo trainInfo2=new TrainInfo("01013", "LTT CBE SPL", "Pune", "Bangalore", "2A", "1:55 AM", "20 hr 30 min", "10:25 PM", 1825);
		TrainInfo trainInfo3=new TrainInfo("01013", "LTT CBE SPL", "Pune", "Bangalore", "3A", "1:55 AM", "20 hr 30 min", "10:25 PM", 1150);
		TrainInfo trainInfo4=new TrainInfo("01013", "LTT CBE SPL", "Pune", "Bangalore", "SL", "1:55 AM", "20 hr 30 min", "10:25 PM", 475);
		TrainInfo trainInfo5=new TrainInfo("01013", "LTT CBE SPL", "Pune", "Bangalore", "2S", "1:55 AM", "20 hr 30 min", "10:25 PM", 285);
		
		//bagalore to pune
		TrainInfo trainInfo6=new TrainInfo("01302", "UDYAN EXP",  "Bangalore", "Pune","1A", "8:20 PM", "19 hr 40 min", "4:00 PM", 3080);
		TrainInfo trainInfo7=new TrainInfo("01302", "UDYAN EXP", "Bangalore", "Pune", "2A", "8:20 PM", "19 hr 40 min", "4:00 PM", 1825);
		TrainInfo trainInfo8=new TrainInfo("01302", "UDYAN EXP", "Bangalore","Pune",  "3A", "8:20 PM", "19 hr 40 min", "4:00 PM", 1275);
		TrainInfo trainInfo9=new TrainInfo("01302", "UDYAN EXP", "Bangalore","Pune",  "SL", "8:20 PM", "19 hr 40 min", "4:00 PM", 475);
		TrainInfo trainInfo10=new TrainInfo("01302", "UDYAN EXP", "Bangalore","Pune",  "2S", "8:20 PM", "19 hr 40 min", "4:00 PM", 285);
		
		//chennai to pune 
		TrainInfo trainInfo11=new TrainInfo("02164", "MAS LTT EXPRESS", "Chennai", "Pune", "2A", "6:25 PM", "16 hr 45 min", "11:10 AM", 2440);
		TrainInfo trainInfo12=new TrainInfo("02164", "MAS LTT EXPRESS", "Chennai","Pune",  "3A", "6:25 PM", "16 hr 45 min", "11:10 AM", 1785);
		TrainInfo trainInfo13=new TrainInfo("02164", "MAS LTT EXPRESS", "Chennai","Pune",  "SL", "6:25 PM", "16 hr 45 min", "11:10 AM", 685);
		TrainInfo trainInfo14=new TrainInfo("02164", "MAS LTT EXPRESS", "Chennai","Pune",  "2S", "6:25 PM", "16 hr 45 min", "11:10 AM", 335);
		
		//bangalore to chennai
		TrainInfo trainInfo15=new TrainInfo("02295", "SANGHAMITRA EXP",  "Bangalore","Chennai", "2A", "9:00 AM", "6 hr 15 min", "3:15 PM", 945);
		TrainInfo trainInfo16=new TrainInfo("02295", "SANGHAMITRA EXP", "Bangalore", "Chennai", "3A", "9:00 AM", "6 hr 15 min", "3:15 PM", 625);
		TrainInfo trainInfo17=new TrainInfo("02295", "SANGHAMITRA EXP", "Bangalore","Chennai",  "SL", "9:00 AM", "6 hr 15 min", "3:15 PM", 265);
		TrainInfo trainInfo18=new TrainInfo("02295", "SANGHAMITRA EXP", "Bangalore", "Chennai", "2S", "9:00 AM", "6 hr 15 min", "3:15 PM", 160);
		
		//chennai to bangalore
		TrainInfo trainInfo19=new TrainInfo("02296", "DNR SBC SPL",  "Chennai","Bangalore", "2A", "1:55 PM", "6 hr 25 min", "8:20 PM", 945);
		TrainInfo trainInfo20=new TrainInfo("02296", "DNR SBC SPL",  "Chennai","Bangalore", "3A", "1:55 PM", "6 hr 25 min", "8:20 PM", 680);
		TrainInfo trainInfo21=new TrainInfo("02296", "DNR SBC SPL",  "Chennai","Bangalore", "SL", "1:55 PM", "6 hr 25 min", "8:20 PM", 265);
		TrainInfo trainInfo22=new TrainInfo("02296", "DNR SBC SPL",  "Chennai","Bangalore", "2S", "1:55 PM", "6 hr 25 min", "8:20 PM", 160);
		
		trains.add(trainInfo1);
		trains.add(trainInfo2);
		trains.add(trainInfo3);
		trains.add(trainInfo4);
		trains.add(trainInfo5);
		trains.add(trainInfo6);
		trains.add(trainInfo7);
		trains.add(trainInfo8);
		trains.add(trainInfo9);
		trains.add(trainInfo10);
		trains.add(trainInfo11);
		trains.add(trainInfo12);
		trains.add(trainInfo13);
		trains.add(trainInfo14);
		trains.add(trainInfo15);
		trains.add(trainInfo16);
		trains.add(trainInfo17);
		trains.add(trainInfo18);
		trains.add(trainInfo19);
		trains.add(trainInfo20);
		trains.add(trainInfo21);
		trains.add(trainInfo22);
		
		return trains;
	}
}
