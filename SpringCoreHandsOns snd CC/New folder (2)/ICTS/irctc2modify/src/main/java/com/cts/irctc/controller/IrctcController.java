package com.cts.irctc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.irctc.exception.ApplicationException;
import com.cts.irctc.model.Login;
import com.cts.irctc.model.TicketBooking;
import com.cts.irctc.model.Traininfo;
import com.cts.irctc.service.IrctcService;
import com.cts.irctc.service.TrainRepo;

@Controller
public class IrctcController {
	@Autowired
	private IrctcService servicess;
	
	@GetMapping(value = "/index")
	public String Index() {
		return "index";
	}
	
	
	@GetMapping(value = "/login")
	public String login(@ModelAttribute("login") Login login) {
		login = new Login();
		return "login";
	}

	@PostMapping(value = "/showTicketBookingForm")
	public String showTicketBookingForm(@ModelAttribute("ticketBooking") TicketBooking ticketBooking , Login login ) {
		if(!(servicess.login1(login.getUser(), login.getPassword()))){
		System.out.println(login.getUser()+login.getPassword());
		ticketBooking = new TicketBooking();
		return "ticketBooking";
		}
		return "login";
		
	}

	@PostMapping(value = "/getTicketBookingResultPage")
	@ResponseBody
	public String getCarSearchResultForm(@Valid @ModelAttribute("ticketBooking") TicketBooking ticketBooking,
			BindingResult result, ModelMap map) throws ApplicationException {
		if (result.hasErrors()) {
			return "ticketBooking";
		}

		if (ticketBooking.getFromCity().equalsIgnoreCase(ticketBooking.getToCity())) {
			throw new ApplicationException();
		}
		
		//System.out.println(t.getTrainfrom()+t.getTrainto());
		//map.addAttribute("t", ticketBooking.getFromCity());
		List<Traininfo> t = servicess.findBytrain(ticketBooking.getFromCity(),ticketBooking.getToCity());
		if(t.isEmpty()) {
			throw new ApplicationException();
		}
		
		
		return t.toString(); 
	}

	@ModelAttribute("fromCityList")
	public List<String> populateFromCities() {
		List<String> fromCities = new ArrayList<String>();
		fromCities.add("");
		fromCities.add("Chennai");
		fromCities.add("Delhi");
		fromCities.add("Bangalore");
		fromCities.add("Pune");

		return fromCities;
	}

	@ModelAttribute("toCityList")
	public List<String> populateToCities() {
		List<String> toCities = new ArrayList<String>();
		toCities.add("");
		toCities.add("Chennai");
		toCities.add("Delhi");
		toCities.add("Bangalore");
		toCities.add("Pune");

		return toCities;
	}

}
