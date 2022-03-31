/***********************************************************************************************************
 * This class ExceptionHandlerControllerAdvice is used to handle different exceptions raised by Controller
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE 
 *
************************************************************************************************************/
package com.cts.loanbazaar.loaneligibility.exception;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;

import com.cts.loanbazaar.loaneligibility.model.ErrorResponse;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(ApplicationException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ModelAndView handleResourceNotFound(final ApplicationException exception, final HttpServletRequest request,
			final Model model) {
		// TODO add your code here
		int statusCode = 0;
		ErrorResponse err = new ErrorResponse();
		ModelAndView mav = new ModelAndView();
		err.setErrorMessage(exception.getMessage());
		err.setRequestedURI("http://localhost:8085/" + request.getRequestURI());
		
		try {
			URL url = new URL(err.getRequestedURI());
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			statusCode = http.getResponseCode();
			mav.addObject("code", statusCode);
			mav.addObject("curtime", new Date());
			mav.addObject("message", err.getErrorMessage());
			mav.setViewName("error");
		} catch (IOException e) {
			System.out.println(e);
		}
		return mav; // TODO change the return type here
	}
}
