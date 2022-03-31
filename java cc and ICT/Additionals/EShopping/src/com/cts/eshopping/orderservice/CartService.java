package com.cts.eshopping.orderservice;

import com.cts.eshopping.vo.OrderLineItem;

/**
 *
 */
public class CartService {

	/**
	 * Method to calculate total purchase amount for all the order line items
	 * 
	 * @param orderLineItems
	 * @return totalOrderAmount
	 */
	public double calculateOrderTotalAmount(OrderLineItem[] orderLineItems) {

        double totalOrderAmount = 0;
        int qt =0;
        double cost =0.0;
        
        for(int i=0;i<orderLineItems.length;i++){
            qt = orderLineItems[i].quantity;
            cost = orderLineItems[i].itemCostPerQuantity;
            totalOrderAmount += (qt*cost);
        }
		return totalOrderAmount; // TODO change this return value
	}

	/**
	 * Method to calculate discount based on order total amount
	 * 
	 * @param totalOrderAmount
	 * @return discount
	 */
	public double calculateDiscount(double totalOrderAmount) {
        double discount = 0.0;
        
        if(totalOrderAmount<1000){
            discount = (totalOrderAmount*10)/100;
        }
        else if(totalOrderAmount>=1000 && totalOrderAmount<10000){
            discount = (totalOrderAmount*20)/100;
        }
        else if(totalOrderAmount>=10000){
            discount = (totalOrderAmount*30)/100;
        }
		return discount; // TODO change this return value
	}

	/**
	 * Method to verify if the order line item is flagged as Bulk Order or not
	 * 
	 * @param lineItem
	 * @return boolean
	 */
	public boolean isBulkOrder(OrderLineItem lineItem) {
        boolean result=false;
        
        if(lineItem.quantity>5){
            result = true;
        }
        else if(lineItem.quantity<=5 && lineItem.quantity>=1){
            result=false;
        }
		return result; // TODO change this return value
	}

	/**
	 * Count the number of line items which are ordered in bulk
	 * 
	 * @param orderLineItems
	 * @return
	 */
	public int countOfBulkOrderLineItems(OrderLineItem[] orderLineItems) {
        int count = 0;
        
        for(int i=0;i<orderLineItems.length;i++){
            if(isBulkOrder(orderLineItems[i])){
                count++;
            }
        }
		return count; // TODO change this return value
	}

}
