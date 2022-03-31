package java_lc_cc.Holiday_Trip;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double totalCost;
		HashMap<String, HashMap<String, Double>> table = new HashMap<String, HashMap<String, Double>>();
		
		HashMap<String, Double> airIndia = new HashMap<String, Double>();
		airIndia.put("Travel class", 3200.0);
		airIndia.put("Economy class", 6950.0);
		airIndia.put("Business class", 10340.0);
		airIndia.put("Card Payment", 10.5);
		table.put("Air India", airIndia);
		
		HashMap<String, Double> spiceJet = new HashMap<String, Double>();
		spiceJet.put("Travel class", 3450.0);
		spiceJet.put("Economy class", 7945.0);
		spiceJet.put("Business class", 9500.0);
		spiceJet.put("Card Payment", 7.5);
		table.put("Spice Jet", spiceJet);
		
		HashMap<String, Double> goAir = new HashMap<String, Double>();
		goAir.put("Travel class", 3300.0);
		goAir.put("Economy class", 7250.0);
		goAir.put("Business class", 9890.0);
		goAir.put("Card Payment", 9.5);
		table.put("Go Air", goAir);
		
		HashMap<String, Double> indiGo = new HashMap<String, Double>();
		indiGo.put("Travel class", 3490.0);
		indiGo.put("Economy class", 7560.0);
		indiGo.put("Business class", 9990.0);
		indiGo.put("Card Payment", 8.5);
		table.put("IndiGo", indiGo);
		
		System.out.println("Enter the flight name");
		String flightName = sc.nextLine();
		System.out.println("Enter the class");
		String flightClass = sc.nextLine();
		System.out.println("Enter the number of seats");
		double seats = Double.parseDouble(sc.nextLine());
		System.out.println("Card Payment");
		String card = sc.nextLine();
		
		if (card.equalsIgnoreCase("Y")) {
			double fare = table.get(flightName).get(flightClass);
			double discount = table.get(flightName).get("Card Payment");
			totalCost = (fare * seats) - (fare * seats * (discount / 100));
		} else {
			totalCost = table.get(flightName).get(flightClass) * seats;
		}
		
		if (flightName.equalsIgnoreCase("Spice Jet") || flightName.equalsIgnoreCase("IndiGo")) {
			if (seats > 5) {
				totalCost = totalCost - (totalCost * 10 / 100);
			} else if (seats > 10) {
				totalCost = totalCost - (totalCost * 15 / 100);
			}
		}
		
		System.out.printf("%.0f", totalCost);

	}

}
