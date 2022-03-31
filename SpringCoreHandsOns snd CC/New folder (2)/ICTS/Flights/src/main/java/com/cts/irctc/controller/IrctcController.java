package com.cts.irctc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.irctc.exception.ApplicationException;
import com.cts.irctc.model.TicketBooking;
import com.cts.irctc.model.TrainInfo;
import com.cts.irctc.service.IrctcService;

@Controller
public class IrctcController {
	private IrctcService service;

	
	@Autowired
	public IrctcController(IrctcService service) {
		super();
		this.service = service;
	}

	@RequestMapping(value="/showTicketBookingForm", method=RequestMethod.GET)
	public String showTicketBookingForm(@ModelAttribute("ticketBooking") TicketBooking ticketBooking) {
		
		//Add code here..
		ticketBooking = new TicketBooking();
		return "ticketBooking"; // TODO, modify this value
	}
	
	@RequestMapping(value="/getTicketBookingResultPage", method=RequestMethod.POST)
	public String getCarSearchResultForm(@Valid @ModelAttribute("ticketBooking") TicketBooking ticketBooking,BindingResult result,ModelMap map) throws ApplicationException {
		
		//Add code here..
		if(result.hasErrors()) {
			return "ticketBooking";
		}
		
		if(ticketBooking.getFromCity().equalsIgnoreCase(ticketBooking.getToCity())) {
			throw new ApplicationException();
		}
		
		TrainInfo t = service.getTicketBookingResult(ticketBooking);
		if(t == null) {
			
			map.addAttribute("noResultMessage","Sorry, currently no train available for given details!!!");
			return "trainNotAvailable";
		}
		
		String pnr = service.getPNRNumber(ticketBooking);
		ticketBooking.setPnrNumber(pnr);
		
		ticketBooking.setDateOfTravel(LocalDate.now().plusDays(1));
		ticketBooking.setTotalfareAmount(t.getFarePerPassenger()*ticketBooking.getNoOfTickets());
		
		map.addAttribute("train", t);
		map.addAttribute("ticketBook", ticketBooking);
		return "ticketBookingResult"; // TODO, modify this value
	}
	
	@ModelAttribute("fromCityList")
	public List<String> populateFromCities() {
		List<String> fromCities = new ArrayList<String>();

		 fromCities.add("Chennai"); 
		  fromCities.add("Delhi"); 
		  fromCities.add("Bangalore"); 
		  fromCities.add("Pune");
				
		return fromCities;
	}
	
	@ModelAttribute("toCityList")
	public List<String> populateToCities() {
		List<String> toCities = new ArrayList<String>();
		 
		  toCities.add("Chennai"); 
		  toCities.add("Delhi");
		  toCities.add("Bangalore"); 
		  toCities.add("Pune");		 	
		
		return toCities;
	}
	
	@ModelAttribute("classTypeList")
	public List<String> populateClassType() {
		List<String> classTypes = new ArrayList<String>();
		  
		 classTypes.add("AC First Class (1A)");
		  classTypes.add("AC 2 Tier (2A)"); 
		  classTypes.add("AC 3 Tier (3A)");
		  classTypes.add("Sleeper (SL)"); 
		  classTypes.add("Second Sitting (2S)"); 
		  
			
		return classTypes;
	}
	
	
}
