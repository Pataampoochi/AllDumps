package java_lc_cc.Fuel_Consumption_Calculator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of liters to fill the tank");
		double fuel  = sc.nextDouble();
		if (fuel < 1) {
			System.out.printf("%.0f is an Invalid Input", fuel);
		} else {
			
			System.out.println("Enter the distance covered");
			double distance  = sc.nextDouble();
			if (distance < 1) {
				System.out.printf("%.0f is an Invalid Input", distance);
			} else {
				
				double fuelPer100km = fuel / distance * 100;
				double milePerGallons = (distance * 0.6214) / (fuel * 0.2642);
				System.out.println("Liters/100KM");
				System.out.printf("%.2f ", fuelPer100km);
				System.out.println("Miles/gallons");
				System.out.printf("%.2f", milePerGallons);
			}
		}
		
	}

}
