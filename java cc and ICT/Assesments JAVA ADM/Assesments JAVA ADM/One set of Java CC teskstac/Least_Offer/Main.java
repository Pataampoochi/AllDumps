package java_lc_cc.Least_Offer;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(sc.nextLine());
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> discounts = new ArrayList<Double>();
		for (int i = 0; i < size; i++) {
			String text = sc.nextLine();
			String name = text.split(",")[0];
			names.add(name);
			Double discount = Double.parseDouble(text.split(",")[1]) * Double.parseDouble(text.split(",")[2]) / 100;
			discounts.add(discount);
		}
		Double minDiscount = Collections.min(discounts);
		for (int i = 0; i < size; i++) {
			if (minDiscount.compareTo(discounts.get(i)) == 0) {
				System.out.println(names.get(i));
			}
		}

	}

}
