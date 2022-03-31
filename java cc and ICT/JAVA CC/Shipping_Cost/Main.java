package java_lc_cc.Shipping_Cost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) throws IOException, InterruptedException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Cargo:");
		int numberOfCargo = Integer.parseInt(reader.readLine());

		System.out.println("Enter cargo details (id,length,width,weight,cargo type,storage type):");
		List<Cargo> cargoList1 = new ArrayList<Cargo>();

		for(int i=0;i<numberOfCargo;i++) {
			cargoList1.add(new Cargo(reader.readLine()));

		}
		List<Cargo> cargoList2 = cargoList1.subList(0, (numberOfCargo/2));
		List<Cargo> cargoList3 = cargoList1.subList((numberOfCargo/2),numberOfCargo);

		List<Double> priceList2=new ArrayList<Double>();
		ShippingCostThread m1= new ShippingCostThread(cargoList2,priceList2);
		Thread t1=new Thread(m1);
		Thread t2=new Thread(new ShippingCostThread(cargoList3, priceList2));
		t1.start();
		t1.join();
		t2.start();
		t2.join();

		displayPrice(priceList2);


	}

	public static void displayPrice(List<Double> list){

		System.out.println("Price List:");

		for(int j=0;j<list.size();j++)
		{ System.out.println(list.get(j));}

	}

}
