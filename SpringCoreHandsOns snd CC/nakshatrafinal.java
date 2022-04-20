********ShipmentBo**********

package com.spring.bo;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.spring.config.ApplicationConfig;
import com.spring.model.CouponUtility;
import com.spring.model.Shipment;
 
//use appropriate annotation to make this class as component class

@Component
@PropertySource("classpath:couponCode.properties")
public class ShipmentBO {
	CouponUtility cu;
	public double processDiscount(Shipment shipmentObj) {
		double amount=0;
		//	fill the code
		String code=shipmentObj.getCouponCode();
		int discount=cu.getCouponCodes().get(code);
		double price=shipmentObj.getItem().getPrice();
		amount=price-(price*discount)/100;
		return amount;
	}
	
	

}


**********ApplicationConfig**********

package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.bo.ShipmentBO;
import com.spring.model.CouponUtility;
import com.spring.model.Item;
import com.spring.model.Shipment;
import com.spring.service.ShipmentService;

//Use appropriate annotation
@Configuration
@ComponentScan
@PropertySource("classpath:couponCode.properties")
public class ApplicationConfig {
	
		    	@Bean
		    	public Shipment shipment() {
		    		return new Shipment(item());
		    	}
		    	@Bean
		    	public Item item() {
		    		return new Item();
		    	}
		    	@Bean
		    	public CouponUtility couponUtility() {
		    		return new CouponUtility();
		    	}
		    	@Bean
		    	public ShipmentBO shipmentBo() {
		    		return new ShipmentBO();
		    	}
		    	@Bean
		    	public ShipmentService shipmentService() {
		   		return new ShipmentService(shipmentBo());
		    	}

	
}


**********InvalidCouponCodeException***********

package com.spring.exception;

public class InvalidCouponCodeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCouponCodeException(String msg) {

		// fill the code
		super(msg);
	}

}


**********Driver*********

package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidCouponCodeException;
import com.spring.service.ShipmentService;

public class Driver {

	public static void main(String[] args) throws InvalidCouponCodeException {

		// fill the code
		Scanner in=new Scanner(System.in);
		
		    		
		    		// fill the code
		    		System.out.println("Enter the Item Id:");
		    		String a=in.nextLine();
		  		System.out.println("Enter the Item Type:");
		    		String b=in.nextLine();
		    		System.out.println("Enter the Price:");
		    		Double c=in.nextDouble();
		    	    String temp=in.nextLine();
		    		System.out.println("Enter the Shipment Details");
		    		System.out.println("Enter the Shipment Id:");
		    		String d=in.nextLine();
		    		System.out.println("Enter the Shipment Date:");
		    		String e=in.nextLine();
		    		System.out.println("Enter the Shipment Address:");
		    		String f=in.nextLine();
		    		System.out.println("Enter the Coupon code:");
		    		String g=in.nextLine();
		    		try {
		    		
		    		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		    		
		    		ShipmentService ams=(ShipmentService)context.getBean(ShipmentService.class);
		    		double discountedAmount=ams.processDiscount(d, e, a, b, c,f, g);
		    		System.out.println("Discounted Amount: "+discountedAmount);
		    	}
		    		catch(InvalidCouponCodeException s)
		   
		    			{
		    			System.out.println(s.getMessage());
		    			}
		    		
	
		    


	}


}


***********CouponUtility*********

package com.spring.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;



//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class


@Component
@Configuration
@PropertySource(value="classpath:couponCode.properties")

public class CouponUtility {
	
	
	public  Map<String, Integer> getCouponCodes() {
		return couponCodes;
	}

	public  void setCouponCodes(Map<String, Integer> couponCodes) {
		this.couponCodes = couponCodes;
	}

	 //Fill the code
	
	@Value("#{${couponCodes.map:{'MAX':'40', 'EPIC':'30', 'GRAB':'60', 'MARK':'55'}}}")
	private   Map<String,Integer> couponCodes;
	
	
		}
		

		
	
*********Item**********

package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class Item {
	
	
	private String itemId;
	private String itemType;
	private double price;
	
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}


*******Shipment********

package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class Shipment {

	private String shipmentId;
	private String shipmentDate; 	
	private Item item;
	private String deliveryAddress;
	private String couponCode;
	
	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

@Autowired
	public Shipment(Item item) {
		super();
		this.item = item;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
		
}


*********Shipment service**********

package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.bo.ShipmentBO;
import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidCouponCodeException;
import com.spring.model.Item;
import com.spring.model.Shipment;

//use appropriate annotation to make this class as component class
@Component
public class ShipmentService {
	
	private ShipmentBO shipmentBOObj;

	//fill the code
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


	public double processDiscount(String shipmentId,String shipmentDate,String itemId,String itemType,double price, String address,String couponCode) throws InvalidCouponCodeException{

		double amount=0;
		// fill the code
		if(couponCode.equals("MAX")||couponCode.equals("EPIC")||couponCode.equals("GRAB")||couponCode.equals("MARK"))
			    		{
			    			ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
			    			//ApplicationConfig config=new ApplicationConfig();
			    			Shipment shipment=(Shipment)context.getBean(Shipment.class);
			    			shipment.setShipmentId(shipmentId);
			    			shipment.setShipmentDate(shipmentDate);
			    			shipment.setDeliveryAddress(address);
			    			Item item=(Item)context.getBean(Item.class);
			    			item.setItemId(itemId);
			    			item.setItemType(itemType);
			    			item.setPrice(price);
			    			
			    			amount=shipmentBOObj.processDiscount(shipment);
			    		}
			    		else
			    		{
			    			throw new InvalidCouponCodeException("Invalid Coupon Code");
			    		}
			   		
			   		return amount;
			   	

		
	}

}
