package com.spring.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class CouponUtility {
	public Map<String, Integer> getCouponCodes() {
		return couponCodes;
	}

	public void setCouponCodes(Map<String, Integer> couponCodes) {
		this.couponCodes = couponCodes;
	}

	// Fill the code
	@Value(value = "#{${couponCodes.map}}")
	private Map<String, Integer> couponCodes;
}
