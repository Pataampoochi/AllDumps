package java_lc_cc.JAVA_Maria_Mobiles_Mobile_Sale_Automation;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mobile Id");
		int mobileid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Brand Name");
		String bname=sc.nextLine();
		
		System.out.println("Enter the price");
		float price=sc.nextFloat();
		System.out.println("Enter the Camera details");
		sc.nextLine();
		String camera=sc.nextLine();
		System.out.println("Enter the Network supported");
		String nw=sc.nextLine();
		//Uncomment these lines after SmartPhone class inherits the Mobile class
		
		
		SmartPhone phone=new SmartPhone(mobileid,bname,price,camera,nw);
		System.out.println("Mobile Id - "+phone.getMobileId());
		System.out.println("Brand Name - "+phone.getBrandName());
		System.out.println("Price - "+phone.getPrice());
		System.out.println("Camera details - "+phone.getCameraDetails());
		System.out.println("Network supported - "+phone.getNetworkSupport());
		System.out.printf("Discount  amount - %.2f",phone.calculateDiscount());
			
	}

}
