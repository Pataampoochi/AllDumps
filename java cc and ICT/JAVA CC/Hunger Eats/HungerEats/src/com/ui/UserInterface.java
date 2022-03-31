package com.ui;
import java.util.Scanner;
import com.utility.Order;
import com.bean.FoodProduct;

public class UserInterface {

	public static void main(String[] args) {
	
		// fill the code
		Scanner sc=new Scanner(System.in);
		int itemno;
		String bank;
		System.out.println("Enter the number of items");
		itemno=sc.nextInt();
		System.out.println("Enter the item details");
		Order z=new Order();
		for(int i=0;i<itemno;i++){
		    FoodProduct fd=new FoodProduct();
		    System.out.println("Enter the item id");
		    fd.setFoodId(sc.nextInt());
		    System.out.println("Enter the item name");
		    fd.setFoodName(sc.next());
		    System.out.println("Enter the cost per unit");
		    fd.setCostPerUnit(sc.nextDouble());
		    System.out.println("Enter the quantity");
		    fd.setQuantity(sc.nextInt());
		    z.addToCart(fd);
		}
		System.out.println("Enter the bank name to avail offer");
		bank=sc.next();
		z.findDiscount(bank);
		System.out.println("Calculated Bill Amount:"+z.calculateTotalBill());
	
	}
}
