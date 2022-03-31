package java_lc_cc.Display_Agent_Details;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the agent details");
		System.out.println("Enter the agent name :");
		String name = sc.nextLine();
		System.out.println("Enter the identification number :");
		String id = sc.nextLine();
		System.out.println("Enter the accountNumber :");
		String account = sc.nextLine();
		System.out.println("Enter the creditLimit :");
		double creditLimit = sc.nextDouble();
		
		System.out.println("Agent details are");
		System.out.println("Name : "+name);
		System.out.println("Identification Number : "+id);
		System.out.println("Account Number : "+account);
		System.out.printf("Credit Limit : %.2f\n", creditLimit);
		
	}

}
