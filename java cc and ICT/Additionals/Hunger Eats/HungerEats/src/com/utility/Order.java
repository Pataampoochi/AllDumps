package com.utility;

import java.util.*;
import com.bean.FoodProduct;

public class Order {

    private double discountPercentage;
	private List<FoodProduct> foodList=new ArrayList<FoodProduct>();
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public List<FoodProduct> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<FoodProduct> foodList) {
		this.foodList = foodList;
	}
	
	//This method should set the discount percentage based on bank passed as argument 
	public void findDiscount(String bankName) {

		// fill the code
		if(bankName.equals("HDFC")){
		    discountPercentage=15.0;
		}
		else if(bankName.equals("ICICI")){
		    discountPercentage=25.0;
		}
		else if(bankName.equals("CUB")){
		    discountPercentage=30.0;
		}
		else if(bankName.equals("SBI")){
		    discountPercentage=50.0;
		}
		else if(bankName.equals("OTHERS")){
		    discountPercentage=0.0;
		}
		
	}
	
	//This method should add the FoodProduct Object into Food List
	public void addToCart(FoodProduct foodProductObject) {

		// fill the code
		List<FoodProduct> f=getFoodList();
		f.add(foodProductObject);
		setFoodList(f);
				
	}
			
	//method should return the total bill amount after discount 
	// based on the bank name
	public double calculateTotalBill() {

		// fill the code
		double bill=0;
		List<FoodProduct> f=getFoodList();
		for(int i=0;i<f.size();i++){
		    //
		  //  System.out.println(f.get(i).getCostPerUnit());
		    //
		  //  System.out.println(f.get(i).getQuantity());
		    bill+=f.get(i).getQuantity()*f.get(i).getCostPerUnit()*1.0;
		}
		bill=bill-((bill*discountPercentage)/100);

		return bill;
	}
			
			
}
