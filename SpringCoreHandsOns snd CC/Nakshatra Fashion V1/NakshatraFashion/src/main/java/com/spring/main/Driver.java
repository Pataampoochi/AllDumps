package com.spring.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidCouponCodeException;
import com.spring.service.ShipmentService;

public class Driver {

	public static void main(String[] args) {
		// fill the code
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Item Id:");
		String itemId = sc.nextLine();
		System.out.println("Enter the Item Type:");
		String itemType = sc.nextLine();
		System.out.println("Enter the Price:");
		double price = Double.parseDouble(sc.nextLine());

		System.out.println("Enter the Shipment Details");
		System.out.println("Enter the Shipment Id:");
		String shipId = sc.nextLine();
		System.out.println("Enter the Shipment Date:");
		String shipDate = sc.nextLine();
		System.out.println("Enter the Shipment Address:");
		String shipAddress = sc.nextLine();
		System.out.println("Enter the Coupon code:");
		String couponCode = sc.nextLine();
		try {
			ShipmentService service = ctx.getBean(ShipmentService.class);

			double amount = service.processDiscount(shipId, shipDate, itemId, itemType, price, shipAddress, couponCode);
			System.out.print("Discounted Amount: " + amount);
		} catch (InvalidCouponCodeException e) {
			System.out.println(e.getMessage());
		}
	}

}
