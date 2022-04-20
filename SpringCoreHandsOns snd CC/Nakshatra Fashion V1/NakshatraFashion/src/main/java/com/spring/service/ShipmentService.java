package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.bo.ShipmentBO;
import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidCouponCodeException;
import com.spring.model.CouponUtility;
import com.spring.model.Shipment;

//use appropriate annotation to make this class as component class
@Component
public class ShipmentService {

	private ShipmentBO shipmentBOObj;

	// fill the code
	@Autowired
	public ShipmentService(ShipmentBO shipmentBOObj) {
		super();
		this.shipmentBOObj = shipmentBOObj;
	}

	public ShipmentBO getShipmentBOObj() {
		return shipmentBOObj;
	}

	public void setShipmentBOObj(ShipmentBO shipmentBOObj) {
		this.shipmentBOObj = shipmentBOObj;
	}

	public double processDiscount(String shipmentId, String shipmentDate, String itemId, String itemType, double price,
			String address, String couponCode) throws InvalidCouponCodeException {
		double amount = 0;
		// fill the code
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CouponUtility util = ctx.getBean(CouponUtility.class);

		if (!util.getCouponCodes().containsKey(couponCode))
			throw new InvalidCouponCodeException("Invalid Coupon Code");
		
		Shipment spmt = ctx.getBean(Shipment.class);
		ShipmentBO bo = ctx.getBean(ShipmentBO.class);
		
		spmt.setCouponCode(couponCode);
		spmt.setDeliveryAddress(address);
		spmt.setShipmentDate(shipmentDate);
		spmt.setShipmentId(shipmentId);
		spmt.getItem().setItemId(itemId);
		spmt.getItem().setItemType(itemType);
		spmt.getItem().setPrice(price);
		
		amount = bo.processDiscount(spmt);
		
		return amount;
	}

}
