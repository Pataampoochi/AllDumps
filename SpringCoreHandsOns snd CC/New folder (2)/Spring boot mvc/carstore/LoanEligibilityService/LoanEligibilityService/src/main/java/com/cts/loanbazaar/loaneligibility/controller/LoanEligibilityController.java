/***********************************************************************************************************
 * This class LoanEligibilityController is control the views and model objects 
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE
 * ADD REQUEST MAPPING URI AND RETURN TYPE AS PER DESIGN DOCUMENT
 *
************************************************************************************************************/
package com.cts.loanbazaar.loaneligibility.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.loanbazaar.loaneligibility.exception.ApplicationException;
import com.cts.loanbazaar.loaneligibility.model.CustomerDetails;
import com.cts.loanbazaar.loaneligibility.model.LoanProduct;
import com.cts.loanbazaar.loaneligibility.service.LoanEligibilityService;

/**
 * Loan Eligibility Controller
 *
 */
@Controller
public class LoanEligibilityController {

	@Autowired
	LoanEligibilityService loanEligibilityService;

	/**
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHomePage(Model model) {
		CustomerDetails customerDetails = new CustomerDetails();
		model.addAttribute("customerDetails", customerDetails);
		return "loanEligibility";
	}

	/**
	 * @param model
	 * @param request
	 * @param response
	 * @param customerDetails
	 * @param result
	 * @return String
	 * @throws ApplicationException
	 */
	@RequestMapping(value = "/eligibilityCheck", method = RequestMethod.POST)
	public String getLoanProducts(Model model, HttpServletRequest request, HttpServletResponse response,
			@Valid CustomerDetails customerDetails, BindingResult result) throws ApplicationException {
		if (!result.hasErrors()) {

			List<LoanProduct> data = new ArrayList<LoanProduct>();
			data = loanEligibilityService.checkEligibleLoanProducts(customerDetails);
			if (data.isEmpty()) {
				model.addAttribute("msg", "Sorry, no loan products matching your profile.");
			} else {
				model.addAttribute("data", data);
				model.addAttribute("msg", "Congratulations. You are Eligible for the below Loan Products:");
			}
		}
		return (result.hasErrors()?"loanEligibility":"results");

	}

	/**
	 * @return List<String>
	 */
	@ModelAttribute("cityList")
	public List<String> getCities() {
		List<String> cityList = new ArrayList<String>();
		cityList.add("");
		cityList.add("Chennai");
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Delhi");
		// cityList.add("Pune");
		cityList.add("Kolkatta");
		// cityList.add("Delhi");
		// cityList.add("Bangalore");
		return cityList;
	}

	/**
	 * @return List<String>
	 */
	@ModelAttribute("employeeList")
	public List<String> getEmploymentTypes() {
		List<String> employeeList = new ArrayList<String>();
		employeeList.add("");
		employeeList.add("Salaried");
		employeeList.add("Self-Employed");
		employeeList.add("Contractual Employment");
		employeeList.add("Student");
		employeeList.add("Pensioner");
		return employeeList;
	}

	/**
	 * @return List<String>
	 */
	@ModelAttribute("genderList")
	public List<String> getGenderOptions() {
		List<String> genderList = new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");
		return genderList;
	}

}
