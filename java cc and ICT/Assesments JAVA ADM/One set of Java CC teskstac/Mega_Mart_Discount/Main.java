package java_lc_cc.Mega_Mart_Discount;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Id");
		int custId = sc.nextInt();
		
		if (custId < 1) {
			System.out.println(custId+" is not a valid Customer Id");
		} else {
			
			System.out.println("Enter the Bill amount");
			double billAmount = sc.nextDouble();
			double totalPrice = 0;
			
			if (billAmount < 0 ) {
				System.out.printf("%.0f is not a valid Bill Amount",billAmount);
			} else {
				
				if (billAmount < 1000) {
					totalPrice = billAmount;
				} else {
					
					if (custId >= 1 && custId <= 100) {
						totalPrice = billAmount - (billAmount * 15 / 100);
					} else if (custId >= 101 && custId <= 250) {
						totalPrice = billAmount - (billAmount * 18 / 100);
					} else if (custId >= 251 && custId <= 500) {
						totalPrice = billAmount - (billAmount * 23 / 100);
					} else if (custId >= 501 && custId <= 1000) {
						totalPrice = billAmount - (billAmount * 28 / 100);
					} else if (custId >= 1001) {
						totalPrice = billAmount - (billAmount * 32 / 100);
					}
				}
				System.out.printf("Total Price is %.2f ", totalPrice);
			}
		}
	}

}
