package com.controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import com.model.Order;
import com.service.AgencyService;

//use appropriate annotation to configure AgencyController as Controller
public class AgencyController {
	
	//Use appropriate annotation
	private AgencyService service;
	
	
	//invoke the service class - searchDeliveryOrders method.
	public String searchDeliveryOrders(@ModelAttribute("orderBean") Order orderBean, BindingResult result,
			ModelMap model)  {		
		//fill the code
		return null;
	}
	
	//use appropriate annotation to handle the Exception
	public ModelAndView exceptionHandler(Exception e) {
		
		//fill the code
		return null;
	}
}
