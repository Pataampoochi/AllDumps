package com.cts.carstore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.carstore.exception.ApplicationException;
import com.cts.carstore.model.Car;
import com.cts.carstore.model.CarSearch;
import com.cts.carstore.service.CarStoreService;


@Controller
public class CarStoreController {

	@Autowired
	private CarStoreService service;
	
	@Autowired
	private Validator validator;
	
	public CarStoreController() {
		System.out.println("in default constr of controller");
		
	}
	
	  @Autowired 
	  public CarStoreController(CarStoreService service, Validator validator) {
	    this.service=service; 
	    this.validator=validator;
	  }
	 
	@RequestMapping(value="/showCarSearchForm",method=RequestMethod.GET)
	public String showCarSearchForm(@ModelAttribute("carSearch") CarSearch carSearch) {	
		return "carSearch"; //TODO, modify return value
	}
	 
	@RequestMapping(value="/getCarSearchResultForm",method=RequestMethod.POST)
	public String getCarSearchResultForm(@ModelAttribute("carSearch")  @Valid CarSearch carSearch, ModelMap map,
	BindingResult result)throws ApplicationException  {
		
		if(result.hasErrors()) {
			return "carSearch";
		}
		List<Car> l=service.getCarSearchResult(carSearch);
		System.out.println(l);
		if(l.isEmpty())
			return "error";
		map.addAttribute("list",l);
		return "carSearchResult"; //TODO, modify return value
	}
	@ModelAttribute("cities")
	public List<String> populateCities() {
		List<String> cities = new ArrayList<String>();

		 cities.add("Chennai"); 
		  cities.add("Mumbai");
		  cities.add("Delhi"); 
		  cities.add("Bangalore"); 
		  cities.add("Pune");
		  cities.add("Kolkatta");
		 
		
		return cities;
	}
	@ModelAttribute("brands")
	public List<String> populateBrands() {
		List<String> brands = new ArrayList<String>();
		 
		  brands.add("Maruti Suzuki"); 
		  brands.add("Honda");
		  brands.add("Mahindra"); 
		  brands.add("Toyota"); 
		  brands.add("Hundai");		
		
		return brands;
	}	 	  	 	      	      	 	      	   	 	
	@ModelAttribute("budgetUpto")
	public List<String> populateBudget() {
		List<String> budgetUpto = new ArrayList<String>();
		  
		 budgetUpto.add("Below 3 Lakh");
		  budgetUpto.add("3 Lakh"); 
		  budgetUpto.add("5 Lakh");
		  budgetUpto.add("7 Lakh"); 
		  budgetUpto.add("10 Lakh"); 
		  
			
		return budgetUpto;
	}
	@ModelAttribute("fuelTypes")
	public List<String> populateFuelTypes() {
		List<String> fuelTypes = new ArrayList<String>();
		 
		 fuelTypes.add("Petrol"); 
		  fuelTypes.add("Diesel");
		  fuelTypes.add("CNG"); 
		  
		return fuelTypes;
	}
}

	 	  	 	      	      	 	      	   	 	
