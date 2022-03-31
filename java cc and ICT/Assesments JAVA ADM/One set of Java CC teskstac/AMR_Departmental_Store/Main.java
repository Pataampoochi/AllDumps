package java_lc_cc.AMR_Departmental_Store;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the item Name:");
		String itemName = br.readLine();
		System.out.println("Enter the item Cost:");
		float itemCost = Float.parseFloat(br.readLine());
		System.out.println("Enter the GST:");
		float GST = Float.parseFloat(br.readLine());
		TaxableItem obj = new TaxableItem();
		obj.setItemName(itemName);
		obj.setItemCost(itemCost);
		obj.setGST(GST);
		obj.findTaxAmount();
		System.out.printf("Total Cost: %.2f",obj.getTotalCost());
	}

}
