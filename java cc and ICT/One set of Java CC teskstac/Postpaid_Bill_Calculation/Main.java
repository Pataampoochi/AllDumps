package java_lc_cc.Postpaid_Bill_Calculation;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		double calls = sc.nextDouble();
		if (calls < 0) {
			System.out.printf("%.0f is an invalid input", calls);
		} else if (calls > 1000) {
			System.out.printf("%.0f exceeds the maximum limit", calls);
		} else {
			
			System.out.println("Enter the number of SMS:");
			double sms = sc.nextDouble();
			if (sms < 0) {
				System.out.printf("%.0f is an invalid input", sms);
			} else if (sms > 1000) {
				System.out.printf("%.0f exceeds the maximum limit", sms);
			} else {
				
				if (calls <= 100) {
					calls = 100;
				}
				if (sms <= 100) {
					sms = 100;
				}
				double cost = ((calls - 100) * 1.5) + ((sms - 100) * 0.5) + 150;
				cost = cost + (cost * 5.5 / 100);
				System.out.printf("Amount to be paid is Rs.%.2f", cost);
			}
		}
		
	}

}
