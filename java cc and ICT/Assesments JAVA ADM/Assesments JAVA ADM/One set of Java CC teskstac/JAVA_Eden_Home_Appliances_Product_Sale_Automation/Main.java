package java_lc_cc.JAVA_Eden_Home_Appliances_Product_Sale_Automation;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product Id");
		int pid=sc.nextInt();
		System.out.println("Enter the Product Name");
		sc.nextLine();
		String pname=sc.nextLine();
		System.out.println("Enter the Product Price");
		float price=sc.nextFloat();
		System.out.println("Enter the dimension");
		String dim=sc.next();
		System.out.println("Enter the warranty");
		int war=sc.nextInt();
		
		//Uncomment these lines after you inherit the Product class in ElectronicProduct class
		
		
		ElectronicProduct e=new ElectronicProduct(pid, pname, price, dim,war);
		
		System.out.println("Product Id - "+e.getProductId());
		System.out.println("Product Name - "+e.getProductName());
		System.out.println("Product Price - "+e.getPrice());
		System.out.println("Dimension - "+e.getDimension());
		System.out.println("Warranty - "+e.getWarranty()+" years");
		System.out.printf("Discount  amount - %.2f",e.calculateDiscount());
		
	}
}
