package com.spring.bo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.config.ApplicationConfig;
import com.spring.model.CouponUtility;
import com.spring.model.Shipment;

//use appropriate annotation to make this class as component class
@Component
public class ShipmentBO {

	public double processDiscount(Shipment shipmentObj) {
		double amount = 0;
		// fill the code
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CouponUtility util = ctx.getBean(CouponUtility.class);

		int couponCode = util.getCouponCodes().get(shipmentObj.getCouponCode());
		double price = shipmentObj.getItem().getPrice();

		amount = price - (price * couponCode) / 100.0;
		
		return amount;
	}

}
