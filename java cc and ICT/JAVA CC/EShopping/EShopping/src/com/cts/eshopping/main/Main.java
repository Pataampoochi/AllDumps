package com.cts.eshopping.main;

import com.cts.eshopping.orderservice.CartService;
import com.cts.eshopping.skeletonvalidator.SkeletonValidator;
import com.cts.eshopping.vo.OrderLineItem;

public class Main {

	public static void main(String ag[]) {
		
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE
		SkeletonValidator validator = new SkeletonValidator();
		// CODE SKELETON - VALIDATION ENDS
		
		// Please start your code from here
		
		OrderLineItem it1 = new OrderLineItem("AM33","Book",200,3);
		OrderLineItem it2 = new OrderLineItem("AM345","Watch",1000,2);
		CartService cs    = new CartService();
		
		OrderLineItem[] arr = {it1, it2};
		double amt = cs.calculateOrderTotalAmount(arr);
		System.out.println(cs.calculateDiscount(amt));
		

	}

}
