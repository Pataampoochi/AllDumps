package com.cts.eshopping.vo;

/**
 * @author Value Object - OrderLineItem 
 *
 */
public class OrderLineItem {
   
    public String itemId;
    public String itemName;
    public double itemCostPerQuantity;
    public int quantity;
    
    public String getItemId(){
        return itemId;
    }
    public void setItemId(String itemId){
        this.itemId = itemId;
    }
    
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    
    public double getitemCostPerQuantity(){
        return itemCostPerQuantity;
    }
    public void setitemCostPerQuantity(double itemCostPerQuantity){
        this.itemCostPerQuantity = itemCostPerQuantity;
    }

   public int getQuantity(){
        return quantity;
    }
    public void setItemId(int quantity){
        this.quantity = quantity;
    }
    
    public OrderLineItem(String itemId, String itemName, double itemCostPerQuantity, int quantity){
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCostPerQuantity=itemCostPerQuantity;
        this.quantity = quantity;
    }
}
