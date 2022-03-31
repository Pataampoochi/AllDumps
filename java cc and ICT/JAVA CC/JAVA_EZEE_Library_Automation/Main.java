package java_lc_cc.JAVA_EZEE_Library_Automation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ISBN Number");
		int isbnnum= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Book Name");
		String name=sc.nextLine();
		System.out.println("Enter the price");
		double price=sc.nextDouble();
		System.out.println("Enter the magazine Type");
		String type = sc.next();		
		
		//Uncomment these lines after performing the necessary changes in Book and Magazine class 
		
	
		 Magazine magazine =new Magazine(isbnnum,name,price,type);	 
		 double discount = magazine.calculateDiscount();		
		 System.out.println("ISBN Number "+isbnnum);
		 System.out.println("Discount Amount "+discount);		 
		
		
	}

}
