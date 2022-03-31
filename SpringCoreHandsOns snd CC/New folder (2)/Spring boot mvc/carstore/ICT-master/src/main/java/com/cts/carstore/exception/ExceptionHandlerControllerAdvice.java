package com.cts.carstore.exception;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.web.servlet.ModelAndView;




@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleResourceNotFound(final ApplicationException exception,
			final HttpServletRequest request, final Model model) {
		
		//Add code here..
		
		String message="Low Budget- No car available below 3 lakh price";
		Date date= new Date();
		
		//add attribute error and timestamp
		
		
		return null; //TODO, change return value
	}
}
	 	  	 	      	      	 	      	   	 	
